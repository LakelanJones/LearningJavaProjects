package org.thales.HighLowProgram;

import java.util.Random;
import java.util.Scanner;

public class EasyHighLow {
    public void easy (String[] args) {

        //Initialize random number generator
        Random random = new Random();

        //Initialize scanner
        Scanner scanner = new Scanner(System.in);

        //variables for number and guess
        int number = random.nextInt(1, 100);
        int inputNumber;

        for (int i = 0; i < 10; i++) {
            System.out.println("Input your guess from 1 to 100 (inclusive): ");
            
            inputNumber = scanner.nextInt(); //Read input

            if (inputNumber < number && inputNumber <= 100 && inputNumber >= 1) {
                if (i == 9) {
                    System.out.println("You have failed.");
                } else {
                    System.out.println("Guess Higher.");
                }
            } 
            else if (inputNumber > number && inputNumber <= 100 && inputNumber >= 1) {
                if (i == 9) {
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

