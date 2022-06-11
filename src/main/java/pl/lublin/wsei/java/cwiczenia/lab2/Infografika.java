package pl.lublin.wsei.java.cwiczenia.lab2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Infografika  {
    public String tytul;
    public String adresStrony;
    public String adresGrafika;
    public String szerokosc;
    public String wysokosc;
    public String adresMiniaturka;
    public Infografika(String text) {
        Pattern pat = Pattern.compile("<title>\\<!\\[CDATA\\[(.*)\\]\\]");
        Matcher m = pat.matcher(text);
        if (m.find()) {
            tytul= m.group(1);
        } else {
            tytul="";
        }
        pat = Pattern.compile("<link>(.*)<\\/link>");
        m = pat.matcher(text);
        //String adresStrony;
        if (m.find()) {
            adresStrony= m.group(1);
        } else {
            adresStrony="";
        }
        pat = Pattern.compile("<media:content url=\"(.*\\.*)\" type");
         m = pat.matcher(text);
        //String adresGrafika;
        if (m.find()) {
            adresGrafika= m.group(1);
        } else {
            adresGrafika="";
        }
        pat = Pattern.compile("<media:thumbnail url=\"(.*\\.*)\"");
        m = pat.matcher(text);
        //String adresMiniaturka;
        if (m.find()) {
            adresMiniaturka= m.group(1);
        } else {
            adresMiniaturka="";
        }
        pat = Pattern.compile("\" width=\"(\\d*)");
        m = pat.matcher(text);
        //String szerokosc;
        if (m.find()) {
            szerokosc= m.group(1);
        } else {
            szerokosc="";
        }
        pat = Pattern.compile("height=\"(\\d*)");
        m = pat.matcher(text);

        if (m.find()) {
            wysokosc= m.group(1);
        } else {
            wysokosc="";
        }

    }


    public void print() {
        System.out.println("Infografika:");
        System.out.println("tytul: "+tytul);
        System.out.println("adres strony: "+adresStrony);
        System.out.println("adres grafiki:"+adresGrafika);
        System.out.println("adres miniaturki: "+adresMiniaturka);
        System.out.println("rozmiary: "+wysokosc+"x"+szerokosc);
    }
}
