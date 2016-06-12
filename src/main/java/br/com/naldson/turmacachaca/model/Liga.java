package br.com.naldson.turmacachaca.model;

import java.util.ArrayList;
import java.util.List;

public class Liga {

    private ArrayList<String> times = new ArrayList<String>();

    public Liga() {
        adicionaTimes();
    }

    public void adicionaTimes() {
        times.add("https://api.cartolafc.globo.com/time/ssc-napoleza");
        times.add("https://api.cartolafc.globo.com/time/Turmada-resenha-fc");
        times.add("https://api.cartolafc.globo.com/time/IkarosGrill-FC");
        times.add("https://api.cartolafc.globo.com/time/FEC18-EC");
        times.add("https://api.cartolafc.globo.com/time/Rio-Negro-Fcm");
        times.add("https://api.cartolafc.globo.com/time/Spartacus-1000");
        times.add("https://api.cartolafc.globo.com/time/Real-mdg-fc");
        times.add("https://api.cartolafc.globo.com/time/six-nations-fc");
        times.add("https://api.cartolafc.globo.com/time/elieel-fc");
        times.add("https://api.cartolafc.globo.com/time/25-de-dezembro-f-c");
        times.add("https://api.cartolafc.globo.com/time/denismengao");
        times.add("https://api.cartolafc.globo.com/time/atletic-de-esparta");
    }

    public List<String> getTimes() {
        return times;
    }
}
