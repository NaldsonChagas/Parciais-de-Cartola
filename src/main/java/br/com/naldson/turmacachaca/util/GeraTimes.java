package br.com.naldson.turmacachaca.util;

import org.json.JSONObject;

import br.com.naldson.turmacachaca.model.Time;

public class GeraTimes {

	public static Time converteJsonParaTimes(JSONObject json) {

		String nome = json.getJSONObject("time").getString("nome");
		String escudoSvg = json.getJSONObject("time").getString("url_escudo_svg");
		String nomeJogador = json.getJSONObject("time").getString("nome_cartola");

		Time time = new Time(nome, escudoSvg, nomeJogador);

		return time;
	}
}
