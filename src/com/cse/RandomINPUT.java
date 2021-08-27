package com.cse;

import java.io.File;
import java.util.Random;
import java.util.Scanner;
public class RandomINPUT {
    public static String Tittle() {
        String[] str = new String[10000];
        int ll=0,i;
        try {
            File Txt = new File("MovieName.txt");
            Scanner keyBoardInput = new Scanner(Txt);
            i=0;
             while(keyBoardInput.hasNextLine()) {
                str[i] = keyBoardInput.nextLine();
                i++;
            }
            Random randomInput = new Random();
            ll = randomInput.nextInt(i);
        }catch (Exception e){
            System.out.println("not Found");
        }
        return str[ll];
    }

}
