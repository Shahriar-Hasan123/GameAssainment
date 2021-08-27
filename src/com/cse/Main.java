package com.cse;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String names = "", moviname, wrongs = "";
        int wAinput = 0,crinput=0;
        moviname = RandomINPUT.Tittle();
        Scanner Letter = new Scanner(System.in);
        crinput = Print(moviname, names, wrongs, 0,wAinput);
        while (crinput != moviname.length() && wAinput != 10) {
            System.out.print("Guess a letter:");
            //input a letter
            String in = Letter.nextLine();
            if (moviname.contains(in)) names = names + in;
            else {
                wrongs = wrongs + in;
                wAinput++;
            }
             crinput=Print(moviname, names, wrongs, 0,wAinput);
        }
        if (wAinput == 10) {
            System.out.println("\nYou lose!");
        } else {
            System.out.println("You Win!");
            System.out.println("You have guessed  " + moviname + "  correctly.");
        }

    }

    public static int Print(String Letter, String names, String wrongs,int c,int wAinput) {
        System.out.print("You are guessing:");
        for (int i = 0; i < Letter.length(); i++) {
            if (names.indexOf(Letter.charAt(i)) == -1)
                System.out.print("_");
            else {System.out.print(Letter.charAt(i));
            c++;}
        }
        System.out.println();
        System.out.print("You have gussed (" + wAinput + ") wrong letters:");
        for (int i = 0; i < wrongs.length(); i++) {
            System.out.print(wrongs.charAt(i) + " ");
        }
        System.out.println();
        return c;
    }
}
