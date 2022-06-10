package pl.lublin.wsei.java.cwiczenia.lab2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Infografika  {
    public Infografika(String text) {
        Pattern pat = Pattern.compile("<title>\\<!\\[CDATA\\[(.*)\\]\\]");
        Matcher m = pat.matcher(text);
        String tytul;
        if (m.find()) {
            tytul= m.group(1);
        } else {
            tytul="";
        }
        Pattern pat_adres = Pattern.compile("<title>\\<!\\[CDATA\\[(.*)\\]\\]");
        Matcher m_adres = pat.matcher(text);
        String adresStrony;
        if (m_adres.find()) {
            adresStrony= m_adres.group(1);
        } else {
            adresStrony="";
        }
        Pattern pat_grafika = Pattern.compile("<media:content url=\"(.*\\.*)\" type");
        Matcher m_grafika = pat.matcher(text);
        String adresGrafika;
        if (m.find()) {
            adresGrafika= m_grafika.group(1);
        } else {
            adresGrafika="";
        }
        Pattern pat_miniaturka = Pattern.compile("<media:thumbnail url=\"(.*\\.*)\"");
        Matcher m_miniaturka = pat.matcher(text);
        String adresMiniaturka;
        if (m.find()) {
            adresMiniaturka= m_miniaturka.group(1);
        } else {
            adresMiniaturka="";
        }
        Pattern pat_szerokosc = Pattern.compile("\" width=\"(\\d*)");
        Matcher m_szerokosc = pat.matcher(text);
        String szerokosc;
        if (m.find()) {
            szerokosc= m_szerokosc.group(1);
        } else {
            szerokosc="";
        }
        Pattern pat_wyskosc = Pattern.compile("\" width=\"(\\d*)");
        Matcher m_wysokosc = pat.matcher(text);
        String wysokosc;
        if (m.find()) {
            wysokosc= m_szerokosc.group(1);
        } else {
            wysokosc="";
        }

    }
}
