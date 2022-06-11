package pl.lublin.wsei.java.cwiczenia.lab2.test;
import pl.lublin.wsei.java.cwiczenia.lab2.GusInfoGraphicList;
import pl.lublin.wsei.java.cwiczenia.lab2.Infografika;

public class TestGusInfoGraphicList {
    public static void main(String[] args) {
        GusInfoGraphicList list=new GusInfoGraphicList("gusInfoGraphic.xml");
        for (Infografika ig: list.infografiki) ig.print();

    }
}
