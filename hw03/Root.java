//CSE002 hw03: Gathering Input
//Spring 2015 Homework Assignment 3-3
//2015 Feb 10
//Sewook Hur

//Write a program that prompts the user to enter a double and then prints out a crude estimate of the cube root of the number and the value of this crude guess when cubed. 
//Save your program in the file Root.java.
//If x is the number entered. Then start by guessing the square root is x/3. 
//Then improve your estimate by replacing “guess” in the following expression with your first estimate, x/3: 

//(guess*guess*guess+x)/(3*guess*guess) 
//Improve your estimate four more times by continuing to substitute your last estimate for “guess” in the expression above.  
//For example, to find a crude guess for the cube root of 27, guess 27/3=9. Then replace guess with (2*guess*guess*guess+x)/(3*guess*guess) = (2*9*9*9+27)/(3*9*9) = (2*729+27)/(243) = 6.
//(As you can see the early estimates can be pretty inaccurate) 

//Here is a sample run:
//  Enter a double, and I print its cube root- 27
// The cube root is 3.0004539340817478:
// 3.0004539340817478*3.0004539340817478*3.0004539340817478 = 27.01225807480608


import java.util.Scanner;

//define a class
public class Root{
    
    //add main method
    public static void main(String[] args){
        
        //declare scnner
        Scanner myscanner;
        //call scanner
        myscanner = new Scanner(System.in);
        
        //variabel
        double userinput;
        double cuberoot1;
        double cuberoot2;
        double cuberoot3;
        double cuberoot4;
        double cuberoot5;
        double guess;
        
        //get input
        System.out.println("Enter a double, and I print its cube root ");
        userinput = myscanner.nextDouble();
        
        //Then improve your estimate by replacing “guess” in the following expression with your first estimate, x/3
        guess = userinput / 3; 
        
        //(2*guess*guess*guess+x)/(3*guess*guess)
        cuberoot1 = (2*guess*guess*guess+userinput)/(3*guess*guess);
        cuberoot2 = (2*cuberoot1*cuberoot1*cuberoot1+userinput)/(3*cuberoot1*cuberoot1);
        cuberoot3 = (2*cuberoot2*cuberoot2*cuberoot2+userinput)/(3*cuberoot2*cuberoot2);
        cuberoot4 = (2*cuberoot3*cuberoot3*cuberoot3+userinput)/(3*cuberoot3*cuberoot3);
        cuberoot5 = (2*cuberoot4*cuberoot4*cuberoot4+userinput)/(3*cuberoot4*cuberoot4);
        
        //printout result
        System.out.println("The cube root is " + cuberoot5);
        System.out.println(cuberoot5 + " * " + cuberoot5 + " * " + cuberoot5 + " = " + cuberoot5*cuberoot5*cuberoot5);
        
    }//end of method
}//end of class