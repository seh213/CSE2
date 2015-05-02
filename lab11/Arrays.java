import java.util.Scanner;
import java.util.*;

public class Arrays {
    public static void main(String[] args) {
        
        Scanner myscanner;
        myscanner = new Scanner(System.in);
        
        int[] array1 = new int[50];
        int[] array2 = new int[50];
        
        
        for(int i = 0; i < 50; i++)
        {
            array1[i] = (int)(Math.random()*101); 
        }
        
        for(int i = 0; i < 50; i++)
        {
            array2[i] = (int)(Math.random()*101);
            
        }
        
        
        
        int min = array1[0];
        int max = array1[0];
        
        for (int i = 1; i < 50; i++) 
        {
            if (array1[i] < min) 
            {
                min = array1[i];
            }
            if (array1[i] > max)
            {
                max = array1[i];
            }
        }
        
        System.out.println("The maximum of array1 : " + max);
        System.out.println("The minumum of array1 : " + min);
        int temp;
        int min2;
        int max2;
        for(int i=0; i<array2.length; i++)
        {
            min = i;
            for(int j=i; j< array2.length; j++)
            {
                if(array2[j] < array2[min])
                    min = j;

            }
             temp = array2[i];
             array2[i] = array2[min];
             array2[min] = temp;
        }
    
    
        min2 = array2[0];
        max2= array2[49];
        
        System.out.println("The maximum of array2 : " + max2);
        System.out.println("The minumum of array2 : " + min2);
        
        /////////////////////////
        int input;
        do 
        {
            System.out.println("Please enter positve integers from 0 to 100: ");
            while (!myscanner.hasNextInt()) 
            {
                System.out.println("Only Integer is accepted");
                myscanner.next(); 
            }
            input = myscanner.nextInt();
        } while (input > 100 || input < 0);
        
        
        if (input >= 0) {
                
            int top = 49;
            int bot = 0;
            int index = (top+bot)/2;
                
            while (true) {
                    
                if (array2[index] > input && array2[index-1] < input) {
                    System.out.println(input + " was not found in the list.");
                    System.out.println("The number above the key was " + array2[index+1]);
                    System.out.println("The number below the key was " + array2[index-1]);
                    break;
                }
                
                else if(array2[index] < input && array2[index + 1] > input) {
                    System.out.println(input + " was not found in the list.");
                    System.out.println("The number above the key was " + array2[index+1]);
                    System.out.println("The number below the key was " + array2[index-1]);
                    break;
                }
                
                else if (array2[index] == input) {
                    System.out.println(input + " was found in the list.");
                    break;
                }
                
                else {
                    if(array2[index] > input) {
                        top = index - 1;
                    }
                    else {
                        bot = index + 1;
                    }
                    index = (top+bot)/2;
                }
            }
        }
        
    }
}