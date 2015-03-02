//CSE002 HW6
//Spring 2015 Homework Assignment 6-1
//2015 Mar 3
//Sewook Hur

//Ask the user for 5 non-negative integers 
//(if an invalid value is entered, then ask again, using a loop), 
//and print out the sum of the 5 integers. 
//Please write the program using non-nested for-loops. 



import java.util.Scanner;

public class GetIntegers{
    //add main method
    public static void main(String[] args){
        
        Scanner myscanner;
        myscanner = new Scanner(System.in);
        //variable
        int integer = 0;
        int sum = 0;
        
        System.out.println("Please enter 5 non-negative integers: ");
        
        for (int i = 0; i < 5; i++)
        {
            //input should be integer 
            while (!myscanner.hasNextInt()) 
            {
                System.out.println("Invalid input, enter again");
                myscanner.next(); 
            }
            integer = myscanner.nextInt();
            //input should be positive
            while(integer<0)
            { 
                System.out.println("Invalid input, enter again ");
                integer = myscanner.nextInt();
            }
            //sum
            sum += integer;
            
        }
        //print out
        System.out.println("Sum is " + sum);
        
    }//end of method
}//end of class
        
        