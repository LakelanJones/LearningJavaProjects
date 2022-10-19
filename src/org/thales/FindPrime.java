package org.thales;

public class FindPrime {
    public static void main (String args[]) {
    int prime = 2;

        for(int i = 2; i <= 250; i++) {

                if(prime == 2 || prime == 3 || prime == 5 || prime == 7 || prime == 11) {
                    System.out.println(prime + " is prime.");
                }

                if(prime % 2 != 0) {
                    
                    for(int j = 2; j < prime; j++) {

                        if(prime % j != 0 && prime % 3 != 0 && prime % 5 != 0 && prime % 7 != 0 && prime % 11 != 0) {                           
                            System.out.println(prime + " is prime");
                            break;
                        } 
                    } 
                }         
            prime++;
        }
    }
}
