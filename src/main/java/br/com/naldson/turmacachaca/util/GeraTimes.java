package br.com.naldson.turmacachaca.util;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

import br.com.naldson.turmacachaca.model.Jogadores;
import br.com.naldson.turmacachaca.model.Liga;
import br.com.naldson.turmacachaca.model.Time;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import org.json.JSONException;

public class GeraTimes {

    private PegaJsonTimes jsonTimes;
    private Liga liga;
    private List<Time> times;
    private CalculaParciais parciais;
    private Time time;

    @Inject
    public GeraTimes(PegaJsonTimes jsonTimes, Liga liga, CalculaParciais parciais) {
        this.times = new ArrayList<Time>();
        this.jsonTimes = jsonTimes;
        this.liga = liga;
        this.parciais = parciais;
    }

    @Deprecated
    public GeraTimes() {
    }

    public static Time converteJsonParaTimes(JSONObject json, ArrayList<Jogadores> jogadores) {
        String nome = json.getJSONObject("time").getString("nome");
        String escudoSvg = json.getJSONObject("time").getString("url_escudo_svg");
        String nomeJogador = json.getJSONObject("time").getString("nome_cartola");
        String slug = json.getJSONObject("time").getString("slug");

        Time time = new Time(nome, escudoSvg, nomeJogador, slug);
        time.setJogadores(jogadores);
        return time;
    }

    public static ArrayList<Jogadores> adicionaJogadores(JSONObject json) {
        JSONArray array = json.getJSONArray("atletas");
        ArrayList<Jogadores> jogadores = new ArrayList<Jogadores>();

        for (int i = 0; i < array.length(); i++) {
            JSONObject jsonObject = array.getJSONObject(i);

            Integer id = Integer.valueOf(jsonObject.get("atleta_id").toString());
            String nome = jsonObject.get("apelido").toString();
            String foto = jsonObject.get("foto").toString();
            Integer posicaoId = Integer.valueOf(jsonObject.get("posicao_id").toString());

            Jogadores jogador = new Jogadores(id, nome, foto, posicaoId);

            jogadores.add(jogador);
        }
        return jogadores;
    }

    public List<Time> geraTimes() throws JSONException, IOException {
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
                return null;
            }
            times.add(time);
            Collections.sort(times);
        }
        return times;
    }
}
