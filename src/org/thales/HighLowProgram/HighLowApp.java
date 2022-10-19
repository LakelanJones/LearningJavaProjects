package org.thales.HighLowProgram;

import java.util.Scanner;

public class HighLowApp {
    public static void main (String[] args) {

        //Initialize scanner
        Scanner scanner = new Scanner(System.in);

        //Mode input variable
        String input;
        System.out.println("Input your mode: easy, medium, or hard?");
        
        input = scanner.nextLine();

        if (input.equalsIgnoreCase("easy")) {
            EasyHighLow easy = new EasyHighLow();
            easy.easy(args);
        } else if (input.equalsIgnoreCase("medium")) {
            MediumHighLow medium = new MediumHighLow();
            medium.medium(args);
        } else if (input.equalsIgnoreCase("hard")) {
            HardHighLow hard = new HardHighLow();
            hard.hard(args);
        }
        scanner.close();
    }
}

