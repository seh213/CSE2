//CSE002 HW7
//Spring 2015 Homework Assignment 7
//2015 Mar 17
//Sewook Hur

//You should use loops to create each of the three stacks of number. 
//The first stack should be created only using for loops. 
//The second stack should be created only using while loops. 
//The third stack should be created only using do-while loops. 
//Start by writing a program that prints the first stack and get it running. 
//Then it is straightforward to modify a copy of that code (which uses for loops) to write code that uses only while loops.
//Once you have code that generates the top two stacks you can easily modify the code to generate the third stack that only uses do-while loops.
 

import java.util.Scanner;

public class waves{
    //add main method
    public static void main(String[] args){
        
        Scanner myscanner;
        myscanner = new Scanner(System.in);
        
        int input;
        //Using scanner Write a program that forces the user to enter an integer between 1 and 30
        //input check
        do 
        {
            System.out.println("Please enter an integer that is between 1 and 30:");
            while (!myscanner.hasNextInt()) 
            {
                System.out.println("Only Integer is accepted");
                myscanner.next(); 
            }
            input = myscanner.nextInt();
        } while (input > 30 || input < 1);
        System.out.println();
        
        //use for loop
        System.out.println("FOR LOOP:");
        
        //i=row
        //j=cell
        //k=rowcell
        
        for(int i = 1; i<=input; i++)
        {
            //even number goes up 
            if(i%2 == 0)
            {
                for(int k = 0; k < i; k++)
                {
                    for(int j=0; j <=k; j++)
                    {
                        System.out.print(i);
                    }
                    System.out.println("");
                }
            }
            //odd number goes down
            else
            {
                for(int k = i; k > 0; k--)
                {
                    for(int j = k; j > 0; j--)
                    {
                        System.out.print(i);
                    }
                    System.out.println("");
                }
            }
        }
        
        
        //use while loop
        System.out.println("While LOOP:");
        //declare variable
        int i = 1;
        int k = 0;
        int j = 0;
        
        while(i<=input)
        {
             //even number goes up 
            if(i%2 == 0)
            {
                k = 0;
                while(k < i)
                {
                    j = 0;
                    while(j <= k)
                    {
                        System.out.print(i);
                        j++;
                    }
                    System.out.println("");
                    k++;
                }
            }
            //odd number goes down
            else
            {
                k = i;
                while(k > 0)
                {
                    j = k;
                    while(j > 0)
                    {
                        System.out.print(i);
                        j--;
                    }
                    System.out.println("");
                    k--;
                }
            }
            
            i++;    
        }
        
        //use Do-While loop
        System.out.println("Do-While LOOP:");
        //declare variable
        i = 1;
        k = 0;
        j = 0;
        
        do{ 
            if(i%2 == 0)
                {
                    k = 0;
                    do{
                        j = 0;
                        do{
                            System.out.print(i);
                            j++;
                        }while(j <= k);
                        
                        System.out.println("");
                        k++;
                        
                    }while(k < i);
                }
                //odd number goes down
                else
                {
                    k = i;
                    do
                    {
                        j=k;
                        do
                        {
                            System.out.print(i);
                            j--;
                        }while(j > 0);
                        
                        System.out.println("");
                        k--;
                        
                    }while(k>0);
                }
                
            i++;     
        }while(i<=input);
        
        
    }
}