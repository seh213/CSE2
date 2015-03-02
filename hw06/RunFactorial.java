//CSE002 HW6
//Spring 2015 Homework Assignment 6-2
//2015 Mar 3
//Sewook Hur

//You are taking a math test; unfortunately, you forgot to bring your TI-84 calculator.
//So you decide to write yourself a calculator program using a while-loop. 
//Your task: use while-loop to solve factorial programs. 
//Using scanner, you will first input an integer that is between 9 and 16 inclusively.
//Then you need to calculate the factorial of the input number. 

import java.util.Scanner;

public class RunFactorial{
    //add main method
    public static void main(String[] args){
        //variable
        int input;
        int integer;
        int factorial = 1;
        
        Scanner myscanner;
        myscanner = new Scanner(System.in);
        //Using scanner, you will first input an integer that is between 9 and 16 inclusively
        //input check
        do 
        {
            System.out.println("Please enter an integer that is between 9 and 16:");
            while (!myscanner.hasNextInt()) 
            {
                System.out.println("Only Integer is accepted");
                myscanner.next(); 
            }
            input = myscanner.nextInt();
        } while (input > 16 || input < 9);
        
        
        System.out.println("Input accepted:");
        //declare integer
        integer = input;
        //use while-loop to solve factorial programs
        while(integer>0)
        {
            factorial *= integer;
            integer--;
        }
        
        System.out.println(input+"! = " + factorial);
    
   
    }//end of method
}//end of class