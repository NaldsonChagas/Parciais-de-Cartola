package br.com.naldson.turmacachaca.controller;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Result;
import br.com.naldson.turmacachaca.model.Jogadores;
import br.com.naldson.turmacachaca.model.Liga;
import br.com.naldson.turmacachaca.model.Time;
import br.com.naldson.turmacachaca.util.GeraTimes;
import br.com.naldson.turmacachaca.util.PegaJsonTimes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import org.json.JSONException;
import org.json.JSONObject;

@Controller
public class TimeController {

    private Result result;
    private PegaJsonTimes jsonTimes;

    @Inject
    public TimeController(Result result, PegaJsonTimes jsonTimes) {
        this.result = result;
        this.jsonTimes = jsonTimes;
    }

    public TimeController() {
    }

    @Get("time/{slug}")
    public void time(String slug) throws JSONException, IOException {
        String url = new Liga().getTimes().get(slug);
        jsonTimes.addUrl(url);
        jsonTimes.geraJson();
        List<JSONObject> j = jsonTimes.getJsons();

        ArrayList<Jogadores> jogadores = GeraTimes.adicionaJogadores(j.get(0));
        Time time = GeraTimes.converteJsonParaTimes(j.get(0), jogadores);
        
        result.include("jogadores", time.getJogadores());
    }

}