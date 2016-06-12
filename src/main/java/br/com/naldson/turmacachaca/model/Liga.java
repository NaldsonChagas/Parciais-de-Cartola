package br.com.naldson.turmacachaca.model;

import java.util.ArrayList;
import java.util.List;

public class Liga {

    private ArrayList<String> times = new ArrayList<String>();

    public Liga() {
        adicionaTimes();
    }

    public void adicionaTimes() {
        times.add("http://scoutsaovivo.appspot.com/gettarget.php?a=ssc-napoleza");
        times.add("http://scoutsaovivo.appspot.com/gettarget.php?a=Turmada-resenha-fc");
        times.add("http://scoutsaovivo.appspot.com/gettarget.php?a=IkarosGrill-FC");
        times.add("http://scoutsaovivo.appspot.com/gettarget.php?a=FEC18-EC");
        times.add("http://scoutsaovivo.appspot.com/gettarget.php?a=Rio-Negro-Fcm");
        times.add("http://scoutsaovivo.appspot.com/gettarget.php?a=Spartacus-1000");
        times.add("http://scoutsaovivo.appspot.com/gettarget.php?a=Real-mdg-fc");
        times.add("http://scoutsaovivo.appspot.com/gettarget.php?a=six-nations-fc");
        times.add("http://scoutsaovivo.appspot.com/gettarget.php?a=elieel-fc");
        times.add("http://scoutsaovivo.appspot.com/gettarget.php?a=25-de-dezembro-f-c");
        times.add("http://scoutsaovivo.appspot.com/gettarget.php?a=denismengao");
        times.add("http://scoutsaovivo.appspot.com/gettarget.php?a=atletic-de-esparta");
    }

    public List<String> getTimes() {
        return times;
    }
}
