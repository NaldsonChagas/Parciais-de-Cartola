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
        times.put("Turmada-resenha-fc", "https://api.cartolafc.globo.com/time/Turmada-resenha-fc");
        times.put("IkarosGrill-FC", "https://api.cartolafc.globo.com/time/IkarosGrill-FC");
        times.put("FEC18-EC", "https://api.cartolafc.globo.com/time/FEC18-EC");
        times.put("Rio-Negro-Fcm", "https://api.cartolafc.globo.com/time/Rio-Negro-Fcm");
        times.put("Spartacus-1000", "https://api.cartolafc.globo.com/time/Spartacus-1000");
        times.put("Real-mdg-fc", "https://api.cartolafc.globo.com/time/Real-mdg-fc");
        times.put("six-nations-fc", "https://api.cartolafc.globo.com/time/six-nations-fc");
        times.put("elieel-fc", "https://api.cartolafc.globo.com/time/elieel-fc");
        times.put("25-de-dezembro-f-c", "https://api.cartolafc.globo.com/time/25-de-dezembro-f-c");
        times.put("denismengao", "https://api.cartolafc.globo.com/time/denismengao");
        times.put("atletic-de-esparta", "https://api.cartolafc.globo.com/time/atletic-de-esparta");
        times.put("crtorquato", "https://api.cartolafc.globo.com/time/crtorquato");
    }

    public HashMap<String, String> getTimes() {
        return times;
    }
}
