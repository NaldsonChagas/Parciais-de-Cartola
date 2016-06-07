package br.com.naldson.turmacachaca.util;

import org.json.JSONObject;
import org.json.XML;

public class TransformaEmXML {
	public static String transforma(JSONObject j) {
		String xml = XML.toString(j);
		return xml;
	}
}
