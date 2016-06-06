package br.com.naldson.turmacachaca.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.inject.Inject;

import org.json.JSONObject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;
import br.com.naldson.turmacachaca.model.Liga;
import br.com.naldson.turmacachaca.model.Time;
import br.com.naldson.turmacachaca.util.GeraTimes;
import br.com.naldson.turmacachaca.util.PegaJsonTimes;

@Controller
public class IndexController {

	private PegaJsonTimes jsonTimes;
	private Liga liga;
	private ArrayList<Time> time = new ArrayList<>();
	private Result result;

	@Inject
	public IndexController(PegaJsonTimes jsonTimes, Liga liga, Result result) {
		this.jsonTimes = jsonTimes;
		this.liga = liga;
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
			time.add(GeraTimes.converteJsonParaTimes(j));
		}
		result.include("time", time);
	}
}