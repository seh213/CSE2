import java.util.Scanner;

// The user is responsible for bringing cookies to an event. 
//Write a program that uses the Scanner class to obtain from users how many cookies they want,
//how many people they are buying for, and at least how many cookies they want each person to get. 
//Make sure all inputs are valid. Then determine if the number of cookies is evenly divisible 
//among the people and if there is enough for each person. 
//If there are not enough cookies tell the user how many more are need.

//define a class
public class Cookies{
    
    //add main method
    public static void main(String[] args){
        
        //declare scnner
        Scanner myscanner;
        //call scanner
        myscanner = new Scanner(System.in);
        
        //variabel
        int people = 0;
        int cookie = 0 ;
        int eachperson = 0;
        
        
        //get people
        System.out.println("Enter the number of People:");
       
        
        if(myscanner.hasNextInt()) 
            {
                people = myscanner.nextInt();
                
                if (people < 0)
                {
                    System.out.println("You did not enter an int > 0");
                    System.out.println("Enter the number of People:");
                    people = myscanner.nextInt();
                }
                
            }
        else
            {
                System.out.println("You did not enter an int!");
                return;
            }
            
             
        
        
        
       
        //get cookie
        System.out.println("Enter the number of cookies you are planning to buy:");
        cookie = myscanner.nextInt();
        
         if (cookie < 0)
        {
            System.out.println("You did not enter an int > 0");
            System.out.println("Enter the number of cookies you are planning to buy:");
            cookie = myscanner.nextInt();
        }
        
        
        else if (!(cookie >= 0))
        {
            System.out.println("You did not enter an int");
            System.out.println("Enter the number of cookies you are planning to buy:");
            cookie = myscanner.nextInt();
        }
        
        //get each person to get
        System.out.println("How many to want each person to get?");
        eachperson = myscanner.nextInt();
        
         if (eachperson < 0)
        {
            System.out.println("You did not enter an int > 0");
            System.out.println("How many to want each person to get?");
            eachperson = myscanner.nextInt();
        }
        
        else if (!(eachperson >= 0))
        {
            System.out.println("You did not enter an int");
            System.out.println("How many to want each person to get?");
            eachperson = myscanner.nextInt();
        }
        
        else if ((eachperson*people) > cookie)
        {
            System.out.println("You will not have enough cookies. You need to buy at least " + ((eachperson*people)-cookie) +  " more.");
        }
        
        else
        {
            System.out.println("You have enough, but they will divide evenly.");
        }
        
       
        
    }//end of method
}//end of class