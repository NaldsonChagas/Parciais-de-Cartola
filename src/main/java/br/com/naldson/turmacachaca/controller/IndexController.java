package br.com.naldson.turmacachaca.controller;

import java.io.IOException;

import javax.inject.Inject;

import org.json.JSONObject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.naldson.turmacachaca.model.Liga;
import br.com.naldson.turmacachaca.model.Time;
import br.com.naldson.turmacachaca.util.GeraTimes;
import br.com.naldson.turmacachaca.util.PegaJsonTimes;

@Controller
public class IndexController {

	private PegaJsonTimes jsonTimes;
	private Liga liga;
	private Time time;

	@Inject
	public IndexController(PegaJsonTimes jsonTimes, Liga liga) {
		this.jsonTimes = jsonTimes;
		this.liga = liga;
	}

	@Deprecated
	public IndexController() {
	}

	@Path("/")
	public void index() throws IOException {

		for (String url : liga.getTimes()) {
			jsonTimes.addUrl(url);
		}
		jsonTimes.geraJson();
		for (JSONObject j : jsonTimes.getJsons()) {
			time = GeraTimes.converteJsonParaTimes(j);
		}
		
		System.out.println(time);
	}
}