package com.pluralsight;

import java.io.IOException;
import java.util.Scanner;

public class Console {
    public static final Scanner myScanner = new Scanner(System.in);

    public static String promptForString (String prompt) {
       System.out.println(prompt);
       return myScanner.nextLine();
    }
    public static int promptForInt (String prompt) {
        while (true) {
            try {
                System.out.println(prompt);
                int result = myScanner.nextInt();
                myScanner.nextLine();
                return result;
            }catch (Exception var3) {
                System.out.println("Please Enter a number");
                myScanner.nextLine();
            }
        }
    }

}
