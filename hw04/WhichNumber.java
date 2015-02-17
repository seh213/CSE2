//CSE002 HW4
//Spring 2015 Homework Assignment 1
//2015 Feb 17
//Sewook Hur

//Write a program that prompts the user to think of an int 
//between 1 and 10 inclusive. Then the program proceeds 
//to ask the user questions in an attempt to guess
//what number the user is thinking of.

//Sample runs:

//Think of a number between 1 and 10 inclusive.
//Is your number even? Y
//Is it divisible by 3? n
//Is it divisible by 4? y
//Is the number divided by 4 greater than 1? N
//Is your number 4? y
//Yay!

//Think of a number between 1 and 10 inclusive.
//Is your number even? j
//Sorry, that is not a valid input.

//define a class
import java.util.Scanner;

public class WhichNumber{
    
    //add main method
    public static void main(String[] args){
        
        //declare scnner
        Scanner myscanner;
        //call scanner
        myscanner = new Scanner(System.in);
        
        //variabel
        String number = "x";

        //print statemnet
        System.out.println("Think of a number between 1 and 10 inclusive. Answer is only y,Y for (yes) and n,N for (no)");
       
        //ask questions
        System.out.println("Is youe number even?");
        number = myscanner.next();
        
        //
        // follow graph
        //
        //user’s y/Y/n/N input is valid.

        if(number.equals("y") || number.equals("Y"))
        {
            System.out.println("Is it divisible by 3?");
            number = myscanner.next();
            
            if(number.equals("y") || number.equals("Y"))
            {
                System.out.println("is your number 6?");
                number = myscanner.next();
                
                if(number.equals("y") || number.equals("Y"))
                {
                    System.out.println("yay");
                }
                
                else if(number.equals("n") || number.equals("N"))
                {
                    System.out.println("weired. let's do it again");
                }
                
                else
                {
                    System.out.println("Sorry, that is not a valid input.");
                }
            }
            
            else if(number.equals("n") || number.equals("N"))
            {
                System.out.println("is the number divisible by 4?");
                number = myscanner.next();
                
                if(number.equals("y") || number.equals("Y"))
                {
                    System.out.println("is the number divided by 4 greater than 1?");
                    number = myscanner.next();
                    
                    if(number.equals("y") || number.equals("Y"))
                    {
                        System.out.println("Is your number 8?");
                        number = myscanner.next();
                        
                        if(number.equals("y") || number.equals("Y"))
                        {
                            System.out.println("yay");
                        }
                
                        else if(number.equals("n") || number.equals("N"))
                        {
                            System.out.println("weired. let's do it again");
                        }
                
                        else
                        {
                            System.out.println("Sorry, that is not a valid input.");
                        }
                    }
                    else if(number.equals("n") || number.equals("N"))
                    {
                        System.out.println("Is your number 4?");
                        number = myscanner.next();
                        
                        if(number.equals("y") || number.equals("Y"))
                        {
                            System.out.println("yay");
                        }
                        else if(number.equals("n") || number.equals("N"))
                        {
                            System.out.println("weired. let's do it again");
                        }
                        else
                        {
                            System.out.println("Sorry, that is not a valid input.");
                        }
                    }
                }
                    
                else if(number.equals("n") || number.equals("N"))
                {
                    System.out.println("Is if divisible by 5?");
                    number = myscanner.next();
                    
                    if(number.equals("y") || number.equals("Y"))
                    {
                        System.out.println("Is your number 10?");
                        number = myscanner.next();
                        
                        if(number.equals("y") || number.equals("Y"))
                        {
                            System.out.println("yay");
                        }
                
                        else if(number.equals("n") || number.equals("N"))
                        {
                            System.out.println("weired. let's do it again");
                        }
                
                        else
                        {
                            System.out.println("Sorry, that is not a valid input.");
                        }
                    }
                    else if(number.equals("n") || number.equals("N"))
                    {
                        System.out.println("Is your number 2?");
                        number = myscanner.next();
                        
                        if(number.equals("y") || number.equals("Y"))
                        {
                            System.out.println("yay");
                        }
                        else if(number.equals("n") || number.equals("N"))
                        {
                            System.out.println("weired. let's do it again");
                        }
                        else
                        {
                            System.out.println("Sorry, that is not a valid input.");
                        }
                    }
                }
            
                else
                {
                    System.out.println("Sorry, that is not a valid input.");
                }
            }
        }
/////////////////////////////////////////////////////////////            
        else if(number.equals("n") || number.equals("N"))
        {
            System.out.println("Is it divisible by 3?");
            number = myscanner.next();
            
            if(number.equals("y") || number.equals("Y"))
            {
                System.out.println("When dividied by 3 is the result greater than 1?");
                number = myscanner.next();
                
                if(number.equals("y") || number.equals("Y"))
                {
                    System.out.println("Is your number 9?");
                    number = myscanner.next();
                    {
                        if(number.equals("y") || number.equals("Y"))
                        {
                            System.out.println("yay");
                        }
                        else if(number.equals("n") || number.equals("N"))
                        {
                            System.out.println("weired. let's do it again");
                        }
                        else
                        {
                            System.out.println("Sorry, that is not a valid input.");
                        }
                    }
                }
                
                else if(number.equals("n") || number.equals("N"))
                {
                    System.out.println("Is your number 3?");
                    number = myscanner.next();
                    {
                        if(number.equals("y") || number.equals("Y"))
                        {
                            System.out.println("yay");
                        }
                        else if(number.equals("n") || number.equals("N"))
                        {
                            System.out.println("weired. let's do it again");
                        }
                        else
                        {
                            System.out.println("Sorry, that is not a valid input.");
                        }
                    }
                }
                
                else
                {
                    System.out.println("Sorry, that is not a valid input.");
                }
            }
            
            else if(number.equals("n") || number.equals("N"))
            {
                System.out.println("is it greater than 6?");
                number = myscanner.next();
                
                if(number.equals("y") || number.equals("Y"))
                {
                    System.out.println("is your number 7?");
                    number = myscanner.next();
                    
                    if(number.equals("y") || number.equals("Y"))
                    {
                        System.out.println("yay");
                    }
                    else if(number.equals("n") || number.equals("N"))
                    {
                        System.out.println("weired. let's do it again");
                    }
                    else
                    {
                        System.out.println("Sorry, that is not a valid input.");
                    }
                }
                
                else if(number.equals("n") || number.equals("N"))
                {
                    System.out.println("is it less than 3?");
                    number = myscanner.next();
                    
                    if(number.equals("y") || number.equals("Y"))
                    {
                        System.out.println("Is your number 1?");
                        number = myscanner.next();
                        
                        if(number.equals("y") || number.equals("Y"))
                        {
                            System.out.println("yay");
                        }
                
                        else if(number.equals("n") || number.equals("N"))
                        {
                            System.out.println("weired. let's do it again");
                        }
                
                        else
                        {
                            System.out.println("Sorry, that is not a valid input.");
                        }
                    }
                    else if(number.equals("n") || number.equals("N"))
                    {
                        System.out.println("Is your number 5?");
                        number = myscanner.next();
                        
                        if(number.equals("y") || number.equals("Y"))
                        {
                            System.out.println("yay");
                        }
                        else if(number.equals("n") || number.equals("N"))
                        {
                            System.out.println("weired. let's do it again");
                        }
                        else
                        {
                            System.out.println("Sorry, that is not a valid input.");
                        }
                    }
                    else
                    {
                        System.out.println("Sorry, that is not a valid input.");
                    }
                }
            
                else
                {
                    System.out.println("Sorry, that is not a valid input.");
                }
            }
            
            else
            {
                System.out.println("Sorry, that is not a valid input.");
            }
        }
        
        else
        {
            System.out.println("Sorry, that is not a valid input.");
        }
        
    }//end of method
}//end of class