//Lakelan Jones
//8/31/2022
//Convert a US date (MM/DD/YYYY) to EU date (DD/MM/YYYY)

package org.thales;

public class DateApp {
    public static void main(String[] args) {
        String birthday = "07/29/1926";
        System.out.println("The birthday is July 29th, 1926");
        EuropeConvert(birthday);
    } 
    
    public static void EuropeConvert(String date) {
        String mm = date.substring(0, 3);
        String dd = date.substring(3, 6);
        String yyyy = date.substring(6);

        String dateEurope = dd + mm + yyyy;
        
        System.out.println(dateEurope);
    }

}