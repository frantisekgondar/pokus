package sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Úlohy {

    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("src/sample/Úloha");

            int znak = reader.read();
            //while (znak != -1) {
                System.out.println((char) znak);
               znak = reader.read();
               //System.out.println("Bez chyby");
            //}
        } catch (FileNotFoundException e) {
            System.out.println("Chyba sa nasla");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}