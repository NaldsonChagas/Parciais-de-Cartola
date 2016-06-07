package br.com.naldson.turmacachaca.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.inject.Inject;

import org.json.JSONObject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;
import br.com.naldson.turmacachaca.model.Jogadores;
import br.com.naldson.turmacachaca.model.Liga;
import br.com.naldson.turmacachaca.model.Time;
import br.com.naldson.turmacachaca.util.CalculaParciais;
import br.com.naldson.turmacachaca.util.GeraTimes;
import br.com.naldson.turmacachaca.util.PegaJsonTimes;

@Controller
public class IndexController {

	private PegaJsonTimes jsonTimes;
	private Liga liga;
	private ArrayList<Time> times = new ArrayList<>();
	private Result result;
	private CalculaParciais parciais;

	@Inject
	public IndexController(PegaJsonTimes jsonTimes, Liga liga, CalculaParciais parciais, Result result) {
		this.jsonTimes = jsonTimes;
		this.liga = liga;
		this.parciais = parciais;
		this.result = result;
	}

	@Deprecated
	public IndexController() {
	}

	@Path(value = "/", priority = 1)
	@Get
	public void index() throws IOException {

		for (String url : liga.getTimes()) {
			jsonTimes.addUrl(url);
		}
		jsonTimes.geraJson();
		for (JSONObject j : jsonTimes.getJsons()) {
			ArrayList<Jogadores> jogadores = GeraTimes.adicionaJogadores(j);
			Time time = GeraTimes.converteJsonParaTimes(j, jogadores);

			if (parciais.pegaParciais()) {
				parciais.calculaParciais(time);
				time.setPontos(parciais.getParcial());
			} else {
				result.redirectTo(this).index2();
			}
			times.add(time);
		}
		result.include("time", times);
	}

	@Path("mercado-indisponivel")
	private void index2() {

	}
}