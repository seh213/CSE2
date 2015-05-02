//CSE002 HW13
//Spring 2015 Homework Assignment 13
//2015 Apr 28
//Sewook Hur

// Write a program called FourDwin that creates a ragged 4D array containing random doubles between 0 and 30 (1 decimal point is fine).
//Set the outermost array to be size 3.  For other dimensions, assign its length to a random value between X and Y,
//where X and Y are user integer inputs and X < Y. Be sure to check for valid user input. 



import java.util.Random;
import java.util.Scanner;
import java.util.*;

public class FourDwin
{
    //Begin by implementing a method called randomMatrix() that accepts two input variables:  
    //These variables, width and height, are integer sizes for the matrix.  
    //As output, randomMatrix() produces a two dimensional array of integers,
    //in row-major representation, whose elements are random integers between -10 and 10.
    
    
    //Write a method “statArray” that prints the array’s sum, mean, and number of elements.
    public static void statArray(double[][][][] A)
    {
        int count=0;
        double sum=0;
        
        for(int i = 0; i<A.length; i++)
        {
            for(int j = 0; j<A[i].length; j++)
            {
                for(int k = 0; i<A[i][j].length; k++)
                {
                    for(int l = 0; i < A[i][j][k].length; l++)
                    {
                        count++;
                        sum += A[i][j][k][l];
                    }
                }
            }
        }
        double mean = sum/count;    
        System.out.println("Members: " + count);
        System.out.println("Sum    : " + sum);
        System.out.println("Mean: " + mean);
    }
    
    //Write a method “sort4DArray” that sorts the array from its smallest to largest 3D arrays
    //The 4D array should be sorted using insertion sort on the number of individual doubles in each of its member 3D arrays. 
    //If two 3D arrays have the same size, rank based on lowest value in 3D array.  
    //The lower value comes first.  
    //sort4DArray should call sort3DArray on each member 3D array after rearranging the 3D arrays.

    
    public static double[][][][] sort4DArray(double[][][][] A)
    {
        int x;
        for (int i = 1; i < A.length; i++) 
        {
            double[][][] currentElement = A[i];
            //shifts the 3D arrays   
            for (x = i - 1; x >= 0 && count(A[x]) > count(currentElement); x--) 
            {
                A[x + 1] = A[x];
            }          
            //inserts the 3D array to its new position
            A[x + 1] = currentElement;
        }
        
        return A;
    }
    
    //for method “sort4DArray" get count 3D array
    public static int count(double[][][] B) 
    {
       int count = 0;
        for (int j=0; j < B.length; j++) {
            for (int k=0; k < B[j].length; k++){
                count += B[j][k].length;
            }
        }
        return count;
    }
    
    
    //Write a method “sort3DArray” that sorts the 3D arrays 
    //(i.e. sorts all individual 1D arrays within each 3D array)
    //using selection sort (into ascending order).  
    //sort3DArray is not to rearrange the member arrays at any level.
   /* public static double[][][] sort3DArray(double[][][]B)
    {
        for(i = 0; i < B.length; i++)
        {
            smallest = i;
            for(j = i; j < 10; j++)
            {
                if(criminals[i][1].compareTo(criminals[j][1]) > 0)
                {
                    smallest = j;
                }
            }
            temp = criminals[i][1];
            criminals[i][1] = criminals[smallest][1];
            criminals[smallest][1] = temp;
        }
    }
    */
    
    public static void printArray(double[][][][] myarray)
    {
        double result;
        System.out.println("{");
        for(int i=0; i<myarray.length;i++){
            System.out.print("{");
            for(int j=0; j<myarray[i].length;j++){
                System.out.print("{");
                for(int k=0; k<myarray[i][j].length;k++)
                {
                    System.out.print("{");
                    for(int l=0; l<myarray[i][j][k].length;l++)
                    {
                        //random doubles between 0 and 30
                        result = Math.round((myarray[i][j][k][l]) * 10) / 10.0;
                        System.out.print(result + ", ");
                    }
                    System.out.print("},");
                }
                System.out.print("},");
            }
            System.out.println("},");
        }
        System.out.println("}");
    }
    
    
    
    
    //Write a method “sort4DArray” that sorts the array from its smallest to largest 3D arrays.
  //  public static void ssort4DArray(double[] A)
//{
        
  //  }
    
    public static void main(String [] arg)
    {
        
        Scanner myscanner;
        myscanner = new Scanner(System.in);
        //Loops to ask and check for valid user input (2 integers).
        //get integer x
        int x;
        int y;
        do 
        {
            System.out.println("Please enter x greater than 0");
            while (!myscanner.hasNextInt()) 
            {
                System.out.println("Only Integer is accepted");
                myscanner.next(); 
            }
            x = myscanner.nextInt();
        } while (x < 0);
        
        //get integer y
        do 
        {
            System.out.println("Please enter y greater than 0 and x");
            while (!myscanner.hasNextInt()) 
            {
                System.out.println("Only Integer is accepted");
                myscanner.next(); 
            }
            y = myscanner.nextInt();
        } while (y < 0 || y<=x);
        
        int length1 = (int)((Math.random()*((y+1)-x))+x);
        int length2 = (int)((Math.random()*((y+1)-x))+x);
        int length3 = (int)((Math.random()*((y+1)-x))+x);

        //rand.nextInt((y+1) - x) + x;
        
        //Creates a 4D ragged array based on these values.
        double[][][][] myarray = new double[3][length1][length2][length3];
        double result = 0;
        
        //Fills the 4D array with random doubles and print out
      //  System.out.println("{");
        for(int i=0; i<myarray.length;i++){
         //   System.out.print("{");
            for(int j=0; j<myarray[i].length;j++){
               // System.out.print("{");
                for(int k=0; k<myarray[i][j].length;k++){
                    //System.out.print("{");
                    for(int l=0; l<myarray[i][j][k].length;l++){
                        //random doubles between 0 and 30
                        myarray[i][j][k][l] = Math.random()*30;

                        //result = Math.round((myarray[i][j][k][l]) * 10) / 10.0;
                        //System.out.print(result + ",");
                        }  
                    }
                }
            }
    
    
    //Original Array:
    System.out.println("Original Array: ");
    printArray(myarray);
    
    //Sorted Array:
    System.out.println("");
    System.out.println("Sorted Array: ");

    }

        //Prints out the initial array, the sorted array, and its statistics.

    
}