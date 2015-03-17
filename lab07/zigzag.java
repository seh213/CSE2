
import java.util.Scanner;
import java.util.Random;

//The purpose of this lab is to get familiar with loops, 
//a critical piece of syntax that is essential for many programming languages.

//define a class
public class zigzag{
    
    //add main method
    public static void main(String[] args){
 
 // import java.util.Scanner.
 //Then write a loop(s) that appear above the loops you wrote above and
 //forces the user to enter an int between 3 and 33, storing the int in nStars.
 //(Recall the Scanner method hasNextInt(). Your loop(s) will be controlled 
 //by two boolean conditions, hasNextInt() and 
 //the value of nextInt() being in the range 3-33, inclusive.) 
 
    Scanner myscanner;
    myscanner = new Scanner(System.in);
    
    //variable
    int nStar = 10;
    String a = "";
    
    
    
    
   do
   {
    
    do 
        {
            System.out.println("Please enter an integer that is between 3 and 33:");
            while (!myscanner.hasNextInt()) 
            {
                System.out.println("Only Integer is accepted");
                myscanner.next(); 
            }
            nStar = myscanner.nextInt();
        } while (nStar > 33 || nStar < 3);
 
 
    
    for(int i=0; i < nStar; i++)
    {
        System.out.print('*');
    }
    
    System.out.println("");
   
    for(int i=1; i < nStar-1; i++)
    {
        for(int k = 0; k < i; k++)
        {
            System.out.print(" ");
        }
        System.out.print('*');
        System.out.println("");
    }
    
   
    for(int i=0; i < nStar; i++)
    {
        System.out.print('*');
    }
    
    
    
   
    System.out.println("");
    System.out.println("Enter y or Y to go again");
    a = myscanner.next();
    
    }while(a.equals("y") ||a.equals("Y"));
    
    
    }
}