package com.pluralsight;

import java.util.Scanner;

public class Console {
    public static final Scanner sc = new Scanner(System.in);

    public static String promptForString(String prompt ) {
        System.out.println(prompt);
        return sc.nextLine();
    }
    public static int promptForInt(String prompt) {
        while (true) {
            try {
                System.out.println(prompt);
                int result = sc.nextInt();
                sc.nextLine();
                return result;

            } catch (Exception var3) {
                System.out.println("Please Enter a number");
                sc.nextLine();
            }
        }
    }public static double promptForDouble(String prompt) {
        while (true) {
            try {
                System.out.println(prompt);
                double result = sc.nextDouble();
                sc.nextLine();
                return result;
            } catch (Exception var3) {
                System.out.println("Please Enter a decimal number");
                sc.nextLine();
            }
        }
    }


}
