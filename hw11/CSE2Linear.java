//CSE002 HW11   
//Spring 2015 Homework Assignment 11
//2015 Apr 14
//Sewook Hur

// Write a program called CSE2Linear.java that prompts the user to enter 15 ints for students’ final grades in CSE2. 
//Check that the user only enters ints, and print an error message if the user enters anything other than an int. 
//Print a different error message for an int that is out of the range from 0-100, and finally a third error message 
//if the int is not greater than or equal to the last int.  Print the final input array.  
//Next, prompt the user to enter a grade to be searched for. implement a binary search to find the entered grade. 
//Indicate if the grade was found or not, and print out the number of iterations used. 

//Next, scramble the sorted array randomly, and print out the scrambled array.
//Prompt the user again to enter an int to be searched for, and use linear search to find the grade.
//Indicate if the grade was found or not, and how many iterations it took. 

//Write separate methods for linear search, binary search and random scrambling. 
//It might also help to write a print method to track the progress of your array. 
//Import and use java.util.Random for the random scrambling method. 
//Treat it like sorting, using a random number for the index.




import java.util.Random;
import java.util.Scanner;

public class CSE2Linear
{
    public static void main(String [] arg)
    {
        Scanner myscanner;
        myscanner = new Scanner(System.in);
        //array 15 integers
        int[] myintegers = new int[15];
        int input;
        int search1;
        int search2;
        int count = 2;
        //get first number of array
        do 
            {
                System.out.println("Please enter an integer 1 that is between 0 and 100:");
                while (!myscanner.hasNextInt()) 
                {
                    System.out.println("Only Integer is accepted");
                    myscanner.next(); 
                }
                input = myscanner.nextInt();
            } while (input > 100 || input < 0);
            
            myintegers[0] = input;
        
        ////get 2~15 number of integer that is not greater than or equal to the last int
        for(int i = 1; i<15; i++)
        {
            do 
            {
                System.out.println("Please enter an integer " + count + " that is between 0 and 100:");
                while (!myscanner.hasNextInt()) 
                {
                    System.out.println("Only Integer is accepted");
                    myscanner.next(); 
                }
                input = myscanner.nextInt();
                count++;
            } while (input > 100 || input < 0);
            
            myintegers[i] = input;
            
            while(input <= myintegers[i-1])
            {
                System.out.println("Only Integer greater than or equal to the last integer");
                input = myscanner.nextInt();
                myintegers[i] = input;
            }
            
        }
        System.out.println();
        //print out array
        
        System.out.print("The grades, sorted, are: ");
        for(int i=0; i<15; i++)
        {
            System.out.print(myintegers[i] + " ");    
        }
        System.out.println("");
        //prompt the user to enter a grade to be searched for.
        do 
            {
                System.out.println("Please enter a grade to be searched for between " + myintegers[0] + " and "  + myintegers[14]);
                while (!myscanner.hasNextInt()) 
                {
                    System.out.println("Only Integer is accepted");
                    myscanner.next(); 
                }
                search1 = myscanner.nextInt();
            } while (search1 > myintegers[14] || search1 < myintegers[0]);
            
        //put binary search method
        binarysearch(myintegers, search1);
        
        //scrambling method
        System.out.println("Now, numbers are scrambled");
        int [] scrambledarray = new int[15];
        scrambledarray = scrambling(myintegers);
        for(int i=0; i<15; i++)
        {
            System.out.print(scrambledarray[i] + " ");    
        }
        
//Prompt the user again to enter an int to be searched for, and use linear search to find the grade.
//Indicate if the grade was found or not, and how many iterations it took. 
         System.out.println("");
        //prompt the user to enter a grade to be searched for.
        do 
        {
            System.out.println("Please enter a grade to be searched for between 0 and 100:");
            while (!myscanner.hasNextInt()) 
            {
                System.out.println("Only Integer is accepted");
                myscanner.next(); 
            }
            search2 = myscanner.nextInt();
        } while (search1 > 100 || search1 < 0);
        //linear method
        linearsearch(scrambledarray, search2);
        
    }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    
    //binarysearch method
    //implement a binary search to find the entered grade. 
    //Indicate if the grade was found or not, and print out the number of iterations used. 
    public static void binarysearch(int[] myarray, int search)
    {
        int[] array = new int[15];
        for(int i=0; i<15; i++)
        {
            array[i] = myarray[i];
        }
        int center;
        int count = 0;
        int high = 15;
        int low = 0;
        //find middle number
        center = (low + high)/2;
        
        while(array[center] != search && low<=high)
        {
            count++;
            if(array[center] > search)
            {
                high = center-1;
            }
            else if(array[center] < search)
            {
                low = center+1;
            }
            center = (low+high)/2;
        }
        
        if(low <= high)
        {
            System.out.println(search + " was found in the list with " + count + " iterations");
        }
        else if(low > high)
        {
            System.out.println(search + " was not found in the list with " + count + " iterations");
        }
        
    }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Next, scramble the sorted array randomly, and print out the scrambled array.
    public static int[] scrambling(int[] myarray)
    {
        Random scramble = new Random();
        int[] array = new int[15];
        for(int i=0; i<15; i++)
        {
            array[i] = myarray[i];
        }
        for(int i= 14; i > 0 ; i--)
        {
            int scrambled = scramble.nextInt(i);
            int a = array[scrambled];
            array[scrambled] = array[i];
            array[i] = a;
        }
        return array;
    }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    
    public static void linearsearch(int[] myarray, int search)
    {
        int[] array = new int[15];
        for(int i=0; i<15; i++)
        {
            array[i] = myarray[i];
        }
        int count = 1;
        int k = 0;
        while(k<15)
        {
            if (array[k] == search)
            {
                System.out.println(search + " was found in the list with " + count + " iterations");
                break;
            }
            count++;
            k++;
        }
        if(k == 15)
        {
            System.out.println(search + " was not found in the list after 15 iterations");
        }
        
        
    }

 
}
    
