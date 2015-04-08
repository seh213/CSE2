

import java.util.Scanner;

public class ArrayInputs {
    public static void main(String[] args) {
        
        Scanner myscanner;
        myscanner = new Scanner(System.in);
    
        //variable
        int input;
        int a=0;
        int newinput;
        
        int[] myIntArray = new int[0];
        
        
        do 
        {
            System.out.println("Please enter positve integers for the size of an array: ");
            while (!myscanner.hasNextInt()) 
            {
                System.out.println("Only Integer is accepted");
                myscanner.next(); 
            }
            input = myscanner.nextInt();
        } while (input < 0);
        
        
        System.out.println("Please enter " + input + " positive integer: ");
        newinput = myscanner.nextInt();
        
        myIntArray = new int[input];
        
        while(a <= newinput)
        {
            myIntArray[a] = newinput;
            a++;
            System.out.print(myIntArray[a]);
        }
    }
}