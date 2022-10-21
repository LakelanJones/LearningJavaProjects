package org.thales;

public class FindPrime {
    public static void main(String args[]) {
        boolean prime = true;
        int count = 0;

        for(int i = 2; i < 250; i++) {

            for(int j = i - 1; j > 1; j--) {
                if (i % j == 0) {
                    prime = false;
                }         
            }
            if(prime) {
                System.out.println(i + " is prime.");
                count++;
            }
            prime = true;
        }
        System.out.println("There are " + count + " prime numbers between 2 and 250.");
    }
}
