package br.com.naldson.turmacachaca.model;

import java.util.HashMap;

public final class Liga {

    private HashMap<String, String> times;

    public Liga() {
        this.times = new HashMap();
        adicionaTimes();
    }

    public void adicionaTimes() {
        times.put("ssc-napoleza", "https://api.cartolafc.globo.com/time/ssc-napoleza");
        times.put("turmada-resenha-fc", "https://api.cartolafc.globo.com/time/Turmada-resenha-fc");
        times.put("ikarosgrill-fc", "https://api.cartolafc.globo.com/time/IkarosGrill-FC");
        times.put("fec18-ec", "https://api.cartolafc.globo.com/time/FEC18-EC");
        times.put("rio-negro-fcm", "https://api.cartolafc.globo.com/time/Rio-Negro-Fcm");
        times.put("spartacus-1000", "https://api.cartolafc.globo.com/time/Spartacus-1000");
        times.put("real-mdg-fc", "https://api.cartolafc.globo.com/time/Real-mdg-fc");
        times.put("six-nations-fc", "https://api.cartolafc.globo.com/time/six-nations-fc");
        times.put("elieel-fc", "https://api.cartolafc.globo.com/time/elieel-fc");
        times.put("25-de-dezembro-f-c", "https://api.cartolafc.globo.com/time/25-de-dezembro-f-c");
        times.put("denismengao", "https://api.cartolafc.globo.com/time/denismengao");
        times.put("atletic-de-esparta", "https://api.cartolafc.globo.com/time/atletic-de-esparta");
        times.put("crtorquato", "https://api.cartolafc.globo.com/time/crtorquato");
        times.put("igor-ceara-fc", "https://api.cartolafc.globo.com/time/igor-ceara-fc");
        times.put("joec", "https://api.cartolafc.globo.com/time/joec");
        times.put("fortaleza-tsc", "https://api.cartolafc.globo.com/time/fortaleza-tsc");
    }

    public HashMap<String, String> getTimes() {
        return times;
    }
}
