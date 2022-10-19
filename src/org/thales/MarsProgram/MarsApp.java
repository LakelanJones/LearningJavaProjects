//Lakelan Jones
//8/18/22
//Mars Robot App

package org.thales.MarsProgram;

public class MarsApp {
    //main method static indicates the method is a class method shared by all MarsRobot objects
    public static void main (String[] arguments) {
 
        //new MarsRobot object is created called spirit
        MarsRobot spirit = new MarsRobot();

        //instance variable of spirit object is given values
        spirit.status = "exploring";
        spirit.speed = 2;
        spirit.temperature = -60;

        spirit.showAttributes();
        System.out.println("Increasing speed to 3.");
        spirit.speed = 3;

        spirit.showAttributes();
        System.out.println("Changing temperature tp -90");
        spirit.temperature = -90;

        spirit.showAttributes();
        System.out.println("Checking the temperature");
        spirit.checkTemperature();
        spirit.showAttributes();
    }
}