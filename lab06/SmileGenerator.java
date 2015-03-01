import java.util.Scanner;
import java.util.Random;

//The purpose of this lab is to get familiar with loops, 
//a critical piece of syntax that is essential for many programming languages.

//define a class
public class SmileGenerator{
    
    //add main method
    public static void main(String[] args){
    
        
        //simple output
        System.out.println(":) :) :) :) :)");
        System.out.println("");
        
        int i;
        //using for loop
        String a = ":)";
        for(i=0; i<5; i++)
        {
            System.out.print(a + " ");
        }
        
        System.out.println("");
        System.out.println("");
        
        int w = 0;
        //using while loop
        while(w<5)
        {
            System.out.print(a + " ");
            w++;
        }
        
        System.out.println("");
        System.out.println("");
        
        //do while
        int dw = 0;
        
        do{
            System.out.print(a+ " ");
            dw++;
        }while(dw<5);
        
        // Create a second loop to print out 
        //a random number of smiley faces using “math.random()”.
        
        System.out.println("");
        System.out.println("");
        
        //random
        int slr = (int)(Math.random()*100+1);
        //second loop
        for(int sl = 0; sl < slr ; sl++)
        {
            System.out.print(a + " ");
        }
        
        System.out.println("");
        System.out.println("");
        
        //third loop
        for(int tl = 0; tl < slr; tl++)
        {
            System.out.print(a + " ");
            if(tl==29 || tl ==60 || tl==90)
            {
            System.out.println("");
            }
        }
        
        System.out.println("");
        System.out.println("");
        
        //Fourth loop
        for(int fl = 1; fl < 5; fl++)
        {
            for(int fl2 = 0; fl2 < fl; fl2++)
            {
            System.out.print(a);
            }
            
            System.out.println("");
            
        }
        
        
       
        
        
        
    }//end of method
}//end ot class