package br.com.naldson.parciaiscartola.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import org.json.JSONObject;

public class PegaJsonJogadores {

    private String url;
    private JSONObject json;

    public PegaJsonJogadores(String url) {
        this.url = url;
    }

    public JSONObject geraJson() throws IOException {
        try {
            URL api = new URL(this.url);
            InputStreamReader inputStreamReader = new InputStreamReader(api.openStream());
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            String inputLine;

            while ((inputLine = bufferedReader.readLine()) != null) {
                json = new JSONObject(inputLine);
            }

            return json;
        } catch (MalformedURLException e) {
            System.out.println("Esta api não é valida");
        }
        return null;
    }
}
