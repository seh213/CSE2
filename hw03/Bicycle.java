//CSE002 hw03: Gathering Input
//Spring 2015 Homework Assignment 3-1
//2015 Feb 10
//Sewook Hur

//Write a program that prompts the user to enter two digits,
//the first giving the number of counts on a cyclometer and 
//the second giving the number of seconds during which the counts 
//occurred, and then an then prints out the distance traveled 
//and the average miles per hour. 
//Your program should assume the diameter of the wheel is 27 inches. 
//See lab 02 for the details of the computation. 
//Save your program in the file Bicycle.java 
//(and of course name the class Bicycle). 
//Recall that in lab 2 we only computed the distance
//and the number of minutes. The average miles per hour 
//is that distance divided by the number of hours
//(the number of minutes divided by 60).

//Here is a sample run:
//Enter the number of seconds: 480
//Enter the number of counts: 1561
//The distance was 2.08 miles and took 8.0 minutes.
//The average mph was 15.67


//import scanner util
import java.util.Scanner;

//define a class
public class Bicycle{
    //add main method
    public static void main(String[] args){
        
        //declare scnner
        Scanner myscanner;
        //call scanner
        myscanner = new Scanner(System.in);
        
        //variable
        int second;
        int count;
        double distance;
        double minute;
        //variable from lab 2
        // our intermediate variables and output data. Document!
        double wheelDiameter=27.0;  //wheelDiameter
        double PI=3.14159; // pi
        int feetPerMile=5280;  // feet per mile
        int inchesPerFoot=12;   // inch per foot
        //new vraible
        double averageMPH;
        
        //get second data
        System.out.println("Enter the number of seconds: ");
        second = myscanner.nextInt();
        //get counts data
        System.out.println("Enter the number of counts: ");
        count = myscanner.nextInt();
        
        //get distance
        distance=count * wheelDiameter * PI / inchesPerFoot / feetPerMile;
        
        //round to two decimal place
        distance = Math.round(distance * 100);
        distance /= 100; 
        
        //get minutes
        minute = second / 60;
        
        //get averageMPH
        averageMPH = distance / (minute/60);
        //round to two decimal place
        averageMPH = Math.round(averageMPH * 100);
        averageMPH /= 100;
        
        //Print out the output data.
        System.out.println("The distance was " + distance + " mile(s) and took " +  minute + "minute(s).");
        System.out.println("The average mph was " + averageMPH);
        
        
    }//end of method
}//end of class