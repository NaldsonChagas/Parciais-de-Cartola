package br.com.naldson.turmacachaca.util;

import java.io.IOException;

import org.json.JSONObject;

public class GeraJogadores {

	public boolean TransformmaJsonEmJogadores() throws IOException {
		JSONObject json = new PegaJsonJogadores("https://api.cartolafc.globo.com/atletas/pontuados").geraJson();

		try {
			json.getJSONArray("atletas").getString(0);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

		return true;
	}
}
