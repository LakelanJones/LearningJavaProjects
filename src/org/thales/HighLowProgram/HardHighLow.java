package org.thales.HighLowProgram;

import java.util.Random;
import java.util.Scanner;

public class HardHighLow {
 
    public void hard (String[] args) {

        //Initialize Scanner
        Scanner scanner = new Scanner(System.in);

        //Initialize random number generator
        Random random = new Random();

        //variables for number and guess
        int number = random.nextInt(1, 100);
        int inputNumber;

        for (int i = 0; i < 3; i++) {
            System.out.println("Input your guess from 1 to 100 (inclusive): ");
            
            inputNumber = scanner.nextInt(); //Read input

            if (inputNumber < number && inputNumber <= 100 && inputNumber >= 1) {
                if (i == 2) {
                    System.out.println("You have failed.");
                } else {
                    System.out.println("Guess Higher.");
                }
            } 
            else if (inputNumber > number && inputNumber <= 100 && inputNumber >= 1) {
                if (i ==2) {
                    System.out.println("You have failed.");
                } else {
                    System.out.println("Guess Lower.");
                }
            } 
            else if (inputNumber == number && inputNumber <= 100 && inputNumber >= 1) {
                System.out.println("Correct!");
                break;
            }
            else {
                System.out.println("Please input an acceptable value.");
            }
        } 
        scanner.close();
    }
   
}
