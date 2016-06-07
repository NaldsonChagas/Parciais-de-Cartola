package br.com.naldson.turmacachaca.util;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONObject;

import br.com.naldson.turmacachaca.model.Jogadores;
import br.com.naldson.turmacachaca.model.Time;

public class CalculaParciais {

	private JSONArray array;
	private double parcial = 0;

	public boolean pegaParciais() throws IOException {
		try {
			PegaJsonJogadores apiJsonJogadores = new PegaJsonJogadores("https://api.cartolafc.globo.com/atletas/pontuados");
			JSONObject jsonJogadores = apiJsonJogadores.geraJson();
			array = jsonJogadores.getJSONArray("atletas");
		} catch (FileNotFoundException e) {
			return false;
		}
		return true;
	}

	public void calculaParciais(Time time) {
		for (int i = 0; i < array.length(); i++) {
			JSONObject jsonObject = array.getJSONObject(i);

			for (Jogadores jogador : time.getJogadores()) {
				double pontos = Double.valueOf(jsonObject.getString(jogador.getId().toString()));
				this.parcial += pontos;
			}
		}
	}

	public double getParcial() {
		return parcial;
	}
}
