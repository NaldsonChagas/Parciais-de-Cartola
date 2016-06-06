package br.com.naldson.turmacachaca.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONObject;

public class PegaJsonTimes {
	private List<String> url = new ArrayList<String>();
	private JSONObject json;
	private List<JSONObject> jsons = new ArrayList<JSONObject>();

	public void addUrl(String url) {
		this.url.add(url);
	}

	public void geraJson() throws IOException {
		for (int i = 0; i < url.size(); i++) {
			URL url = new URL(this.url.get(i));
			BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

			String inputLine;

			while ((inputLine = in.readLine()) != null) {
				json = new JSONObject(inputLine);
				jsons.add(json);
			}
		}
	}

	public List<JSONObject> getJsons() {
		return jsons;
	}
}