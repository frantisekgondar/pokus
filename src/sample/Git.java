package sample;

import java.util.Scanner;

public class Git {

    public static void main (String[] args){
        System.out.println("hello world");
        //System.in.read()
        //System.err.println();
        System.out.println("napis text: ");
        Scanner scanner = new Scanner(System.in);

        String out = scanner.nextLine();
        int pocet = pocetZnakov(out);
        //Vytvorte metodu ktora spocita pocet znakov v zadanom texte
        System.out.println("vystupny text: "+out);
        System.out.println("pocet znakov je: "+ pocet);
    }

    public static int pocetZnakov(String vstup) {
        return vstup.length();
    }
    }