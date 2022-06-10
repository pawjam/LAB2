package pl.lublin.wsei.java.cwiczenia.lab2.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TestFileRead {
    public static void main(String[] args) {
        try{
//            String contents=new String(Files.readAllBytes(Paths.get("C:\\Users\\pawel\\IdeaProjects\\Lab2\\src\\main\\java\\pl\\lublin\\wsei\\java\\cwiczenia\\lab2\\gusInfoGraphic.xml")));
            String contents=new String(Files.readAllBytes(Paths.get("gusInfoGraphic.xml")));
            System.out.println("Zawartość pliku gusInfoGraphic.xml");
            System.out.print(contents);
        }
        catch(IOException e){
            System.out.println("Błąd wczytywania pliku guesInfoGraphic.xml=>"+e.getLocalizedMessage());
            e.printStackTrace();

        }
    }
}
