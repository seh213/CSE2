//CSE002 hw03: Gathering Input
//Spring 2015 Homework Assignment 3-2
//2015 Feb 10
//Sewook Hur

//Write a program that prompts the user to enter a double and  then prints out the first four digits to the right of the decimal point. 
//Store the program in  FourDigits.java. Hint: Casting the number to an int twice, once before and once after multiplication by 10000, 
//is useful in both samples below. The second sample also requires you to access the individual digits of the int you get by implementing the first line of this hint.
//Using / and % is useful in extracting the individual digits.

//Here are two sample runs.
//Enter a double and I display the four digits to the right of the decimal point-
//23.4534
//The four digits are 4533
//Enter a double and I display the four digits to the right of the decimal point-
//1.0023
//The four digits are 0023

//import scanner util
import java.util.Scanner;
import java.util.Formatter;
import java.util.Locale;
//define a class
public class FourDigits{
    
    //add main method
    public static void main(String[] args){
        
        //declare scnner
        Scanner myscanner;
        //call scanner
        myscanner = new Scanner(System.in);
        
        //variable 
        int decimal;
        double userinput;
        
        //get data
        System.out.println("Enter a double (xx.xxxx) and I display the four digits to the right of the decimal point");
        userinput = myscanner.nextDouble();
        
        //get fourdigit
        decimal = (int)(userinput*10000);
        //get only decimal
        
        decimal = decimal%10000;
        
        //String fourdigit = String.format("%04d", decimal);
        //printout result
        System.out.print("The Four digits are ");
        //number to string 4 decimal point
        String s = String.format("%04d", decimal);
        //print out numbers
        System.out.print(s);
        
    }//end of method
}//end of class