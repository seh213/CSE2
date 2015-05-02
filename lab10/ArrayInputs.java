

import java.util.Scanner;

public class ArrayInputs {
    public static void main(String[] args) {
        
        Scanner myscanner;
        myscanner = new Scanner(System.in);
    
        //variable
        int input;
        int a=0;
        int newinput;
        

        
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
        
        int[] A = new int[input];
        

        
        
        for (int i = 0; i < input; i++)
        {
            do 
            {
                System.out.println("Please enter " + input + " positive integer: ");
                while (!myscanner.hasNextInt()) 
                {
                    System.out.println("Only Integer is accepted");
                    myscanner.next(); 
                }
            newinput = myscanner.nextInt();
            } while (newinput < 0);
            
            A[i] = newinput;
        }
        
        System.out.println("The array is: ");
        System.out.print("[ ");
        for(int i = 0; i < input; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println("]");
        System.out.println();
    }
}