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
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Controller
public class IndexController {

    private PegaJsonTimes jsonTimes;
    private Liga liga;
    private final List<Time> times;
    private Result result;
    private CalculaParciais parciais;
    private Time time;

    @Inject
    public IndexController(PegaJsonTimes jsonTimes, Liga liga, CalculaParciais parciais, Result result) {
        this.times = new ArrayList<Time>();
        this.jsonTimes = jsonTimes;
        this.liga = liga;
        this.parciais = parciais;
        this.result = result;
    }

    public IndexController() {
        this.times = new ArrayList<Time>();
    }

    @Path(value = "/", priority = 1)
    @Get
    public void index() throws IOException {

        Collection<String> urls = liga.getTimes().values();

        for (String url : urls) {
            jsonTimes.addUrl(url);
        }

        jsonTimes.geraJson();
        for (JSONObject j : jsonTimes.getJsons()) {
            ArrayList<Jogadores> jogadores = GeraTimes.adicionaJogadores(j);
            time = GeraTimes.converteJsonParaTimes(j, jogadores);

            if (parciais.pegaParciais()) {
                parciais.calculaParciais(time);
                time.setPontos(parciais.getParcial());
                parciais.setParcial(0);
            } else {
                result.redirectTo(this).index2();
            }
            times.add(time);
            Collections.sort(times);
        }
        result.include("times", times);
    }

    @Path("mercado-indisponivel")
    public void index2() {
    }
}
