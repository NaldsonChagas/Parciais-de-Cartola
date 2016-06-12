package br.com.naldson.turmacachaca.util;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

import br.com.naldson.turmacachaca.model.Jogadores;
import br.com.naldson.turmacachaca.model.Time;

public class GeraTimes {

    public static Time converteJsonParaTimes(JSONObject json, ArrayList<Jogadores> jogadores) {
        String nome = json.getJSONObject("time").getString("nome");
        String escudoSvg = json.getJSONObject("time").getString("url_escudo_svg");
        String nomeJogador = json.getJSONObject("time").getString("nome_cartola");

        Time time = new Time(nome, escudoSvg, nomeJogador);
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

            Jogadores jogador = new Jogadores(id, nome);
            jogadores.add(jogador);
        }
        return jogadores;
    }
}
