package br.com.naldson.turmacachaca.controller;

import java.io.IOException;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;
import br.com.naldson.turmacachaca.model.Time;
import br.com.naldson.turmacachaca.util.GeraTimes;
import java.util.List;
import javax.inject.Inject;

@Controller
public class IndexController {

    private GeraTimes geraTimes;
    private Result result;
    private List<Time> times;

    @Inject
    public IndexController(GeraTimes geraTimes, Result result) {
        this.geraTimes = geraTimes;
        this.result = result;
    }

    @Deprecated
    public IndexController() {
    }

    @Path(value = "/", priority = 1)
    @Get
    public void index() throws IOException {
        times = geraTimes.geraTimes();
        if (times != null) {
            result.include("times", times);
        } else {
            result.redirectTo(this).index2();
        }
    }

    @Path("mercado-indisponivel")
    public void index2() {
    }
}