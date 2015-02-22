//CSE002 HW4
//Spring 2015 Homework Assignment 4
//2015 Feb 17
//Sewook Hur

//Write a program using switch statements that allows users to process banking transactions.
//Start the user off with a rlibrary or the Random function in the java.lang.Math library. 
//Then offer them the choice of dandom amount between 1,000 and 5,000 in their bank account 
//using the java.util.Random depositing money, withdrawing money, or viewing their balance. 
//If they choose to deposit, ask them how much they want to deposit and make sure they enter a positive number. 
//Then print their resulting balance. If they choose to withdraw, ask them how much they want to withdraw
//and make sure it is a positive number no more than the amount in their account. Then print the resulting balance.
//Save the program as Banking.java .

import java.util.Scanner;
import java.util.Random;

public class Banking{
    
    //add main method
    public static void main(String[] args){
        
        //variable
        int money = 0;
        int deposit = 0;
        int withdraw = 0;
        String choice;
        
        //5000 is the maximum and the 1000 is our minimum
        Random rand = new Random();
        money = rand.nextInt(5000) + 1000; 
        
        //declare scnner
        Scanner myscanner;
        //call scanner
        myscanner = new Scanner(System.in);
        
        //ask questions
        System.out.println("D for Deposit, W for Withdraw, V for View Balance");
        choice = myscanner.next();
        
        switch(choice)
        {
            //deposit
            case "D" :
                {
                    System.out.println("How much you want deposit?");
                    deposit = myscanner.nextInt();
                    //positive
                    if(deposit <= 0)
                    {
                         System.out.println("deposit should be positive");
                    }
                    else if(deposit > 0)
                    {
                        money = money+deposit;
                        System.out.println("your resulting balance  is $" + money);
                    }
                    else
                    {
                        System.out.println("Invalid input");
                    }
                    break;
                }
            //withdraw    
            case ("W") :
                {
                    System.out.println("How much you want withdraw");
                    withdraw = myscanner.nextInt();
                    //positive
                    if(withdraw <= 0)
                    {
                         System.out.println("withdraw should be positive");
                    }
                    else if(withdraw > 0 && withdraw < money)
                    {
                        money = money-withdraw;
                        System.out.println("your resulting balance  is $" + money);
                    }
                    else if(withdraw < money)
                    {
                         System.out.println("your balance is not enought for deposit");
                    }
                    else
                    {
                        System.out.println("Invalid input");
                    }
                    break;
                }
            //view balance    
            case "V" :
                {
                    System.out.println("Your balance is $" + money);
                    break;
                }
            //other value    
            default :
            {
                System.out.println("invalid input");
                break;
            }
        }
        

    }//end of method
}//end of class
