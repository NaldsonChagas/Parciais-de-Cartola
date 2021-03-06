package br.com.naldson.parciaiscartola.util;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.JSONObject;

import br.com.naldson.parciaiscartola.model.Jogadores;
import br.com.naldson.parciaiscartola.model.Time;

public class CalculaParciais {

    private JSONObject json;
    private double parcial = 0;

    public boolean pegaParciais() throws IOException {
        try {
            PegaJsonJogadores apiJsonJogadores = new PegaJsonJogadores("https://api.cartolafc.globo.com/atletas/pontuados");
            JSONObject jsonJogadores = apiJsonJogadores.geraJson();
            json = jsonJogadores.getJSONObject("atletas");
        } catch (FileNotFoundException e) {
            return false;
        }
        return true;
    }

    public void calculaParciais(Time time) {
        for (Jogadores j : time.getJogadores()) {
            if (json.has(j.getId().toString())) {
                JSONObject atleta = (JSONObject) json.get(j.getId().toString());

                double pontos = Double.valueOf(atleta.get("pontuacao").toString());
                j.setPontos(pontos);
                this.parcial += pontos;
            }
        }
    }

    public double getParcial() {
        return parcial;
    }

    public void setParcial(double parcial) {
        this.parcial = parcial;
    }
}
