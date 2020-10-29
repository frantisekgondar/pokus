package sample;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Output {
    public static void main(String[] args) {
        try {


            FileWriter writer = new FileWriter("Pokus");
            writer.write("novy riadok");
            writer.close();


        }catch (IOException e) {
        }

        }



}

