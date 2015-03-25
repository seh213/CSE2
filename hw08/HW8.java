//CSE002 HW8
//Spring 2015 Homework Assignment 8
//2015 Mar 24
//Sewook Hur

//Here are all the methods in this program:
//public static String getInput(Scanner scan, String string), this function takes in a scanner and a string “Cc”. It is used to continue the game. If the user enter ‘C’ or ‘c’, the game continue. ANY OTHER KEY results in “Yea right LOSER!” and quit the game.
//public static String getInput(Scanner scan, String string, int trial), the most complicated method in this program. It takes in a string “AaEe”, and a counter trial:
//If the user enter ‘A’ or ‘a’, it means attack, trial is used to record the number of critical hit. You may either give a critical hit or miss! This is determined by a random number that either yields 0 or 1. When you have 10 critical hits, you kill the GIANT and get to move on. 
//If the user enter ‘E’ or ‘e’, it means escape. Everytime the user tries to escape, a random number from 1-10 is generated, if the number equals 10, the program will report that the user escaped successfully. Otherwise, the user faces the “AaEe” option again.
//Any key other than ‘A’ ‘a’ ‘E’ ‘e’ should generate the output “Executed by the GIANT! Game Over! ”
//public static String getInput(Scanner scan), the user chooses to open a treasury box from 1 of the 3. Use SWITCH statement to assign rewards and set default case as A Wrong Number! You get nothing! Better restart the game LOL” Make sure you print out what the reward is.


import java.util.Scanner;

public class HW8{

    public static void main(String[] args) {
        char option;
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to MG's adventure world. Now your journey begins. Good luck!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        String input = getInput(scan, "Cc");
        System.out.println("You are in a dead valley.");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        
        input = getInput(scan, "Cc");
        System.out.println("You walked and walked and walked and you saw a cave!");
        
        cave();
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("You entered a cave!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("Unfortunately, you ran into a GIANT!");
        
        giant();
        System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
        input = getInput(scan, "AaEe", 10);
        System.out.println("Congratulations! You SURVIVED! Get your REWARD!");
        System.out.println("There are three 3 tressure box in front of you! Enter the box number you want to open!");
       
        box();
        input = getInput(scan);
        System.out.println("Hero! Have a good day!");
       }
    
    public static void giant() 
    {
        System.out.println("                                 ---------                    ");
        System.out.println("                                |  /    \\|                   ");
        System.out.println("                      ZZZZZH    |    O    |    HZZZZZ             ");
        System.out.println("                           H     -----------   H              ");
        System.out.println("                      ZZZZZHHHHHHHHHHHHHHHHHHHHHZZZZZ                   ");
        System.out.println("                           H    HHHHHHHHHHH    H                      ");
        System.out.println("                      ZZZZZH    HHHHHHHHHHH    HZZZZZ               ");
        System.out.println("                                HHHHHHHHHHH                   ");
        System.out.println("                                HHH     HHH                   ");
        System.out.println("                               HHH       HHH                   ");
    }

    public static void cave() 
    {
        System.out.println("                              *****   * * * * * * * *        ");
        System.out.println("                         ***         ***                      ");
        System.out.println("                      ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("             O __|__  ***               ***                   ");
        System.out.println("           ******l    ***               ***                   ");
        System.out.println("            * *       ***               ***                   ");
        System.out.println("           *   *      ********************* * * * * * *       ");
    }
    
    public static void box()
    {
        System.out.println("                     *********************     *********************    *********************             ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     ***       1       ***     ***       2       ***    ***       3       ***              ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     *********************     *********************    *********************               "); 
    }
    
    //This function takes in a scanner and a string “Cc”. 
    //It is used to continue the game. 
    //If the user enter ‘C’ or ‘c’, the game continue. ANY OTHER KEY results in “Yea right LOSER!” and quit the game.
    
    public static String getInput(Scanner scan, String string)
    {
        String quit = scan.next();
        if (!(quit.equals("c") || quit.equals("C")))
        {
            System.out.println("Yea right LOSER!");
            System.exit(0);
        }
        return string;
    }
    
    //the most complicated method in this program. It takes in a string “AaEe”, and a counter trial:
    //If the user enter ‘A’ or ‘a’, it means attack, trial is used to record the number of critical hit.
    //You may either give a critical hit or miss! This is determined by a random number that either yields 0 or 1. 
    //When you have 10 critical hits, you kill the GIANT and get to move on. 
    //If the user enter ‘E’ or ‘e’, it means escape. 
    //Everytime the user tries to escape, a random number from 1-10 is generated, if the number equals 10, the program will report that the user escaped successfully. 
    //Otherwise, the user faces the “AaEe” option again.
    //Any key other than ‘A’ ‘a’ ‘E’ ‘e’ should generate the output “Executed by the GIANT! Game Over! ”
    
    public static String getInput(Scanner scan, String string, int trial)
    {
        int hit;
        int escape;
            
        while(trial>0)
        {
            String input = scan.next();
            if (input.equals("a") || input.equals("A"))
            {
                hit = (int)(Math.random()*2);
                if(hit == 1)
                {
                    System.out.println("Critical HiT!");
                    System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
                    trial--;
                }
                else
                {
                    System.out.println("miss");
                    System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
                }
            }
            
            else if(input.equals("e") || input.equals("E"))
            {
                escape = (int)(Math.random()*10)+1;
                
                if(escape == 10)
                {
                    System.out.println("escaped successfully!");
                    System.exit(0);
                }
                else
                {
                    System.out.println("escape failed");
                    System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
                }
            }
            
            else
            {   
                System.out.println("Executed by the GIANT! Game Over!");
                System.exit(0);
            }
        }
        
        return string;
    }
    
    //the user chooses to open a treasury box from 1 of the 3. 
    //Use SWITCH statement to assign rewards and set default case as A Wrong Number! 
    //You get nothing! Better restart the game LOL” Make sure you print out what the reward is.
    public static String getInput(Scanner scan)
    {
        int input = 0;
        String string = ""; 
        //only integer 
            while (!scan.hasNextInt()) 
            {
                System.out.println("Only Integer is accepted");
                scan.next(); 
            }
            input = scan.nextInt();

        
        //Use SWITCH statement to assign rewards and set default case as A Wrong Number! 
         switch (input) 
         {
            case 1:  System.out.print("You get $100 ");
                     break;
            case 2:  System.out.print("You get $1,000 ");
                     break;
            case 3:  System.out.print("You get $10,000  ");
                     break;
            default: System.out.print("A Wrong Number! You get nothing! Better restart the game LOL" );
                     break;
         }
         return string; 
    }
}
