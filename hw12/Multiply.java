//CSE002 HW12  
//Spring 2015 Homework Assignment 12
//2015 Apr 21
//Sewook Hur

// implement matrix multiplication on random matrices.  


import java.util.Random;
import java.util.Scanner;
import java.util.*;

public class Multiply
{
    //Begin by implementing a method called randomMatrix() that accepts two input variables:  
    //These variables, width and height, are integer sizes for the matrix.  
    //As output, randomMatrix() produces a two dimensional array of integers,
    //in row-major representation, whose elements are random integers between -10 and 10.
    public static int[][] randomMatrix(int a, int b)
    {
        Random random = new Random();
        
        int[][] myarray = new int[a][b];
        
        for(int i = 0 ; i < myarray.length; i++)
        {
            for(int j = 0; j < myarray[i].length; j++)
            {
                //random integers between -10 and 10
                myarray[i][j] = random.nextInt(21)-10;
            }
        }
        

        return myarray;
    }
    
    //printMatrix, developed in lab 12, to ensure that your random matrix is correctly generated.

    public static void printMatrix(int[][] a)
    {
        for(int[] r : a)
        {
            System.out.println( Arrays.toString(r));
        }
    }
  
    //Implement a main method that asks the user to input the width and height of two matrices.
    //Check in the main method if these dimensions are compatible for matrix multiplication, 
    //and if not, require the user to provide the dimensions again 
    //(this is the primary error check.  The error check in matrixMultiply() is to catch bugs.  
    //Also, if the user inputs any values that are non-integer or non-positive, 
    //provide an error-specific error message and request the user re-input the affected integer. 
    //Next, generate two random matrices based on the input dimensions, compute their product, and print out the product matrix.
    public static void main(String [] arg)
    {
        Scanner myscanner;
        myscanner = new Scanner(System.in);
        
        int row;
        int column;
        int row2;
        int column2;
        
        //first Matirix
        //get row
        do 
        {
            System.out.println("Please enter a row greater than 0");
            while (!myscanner.hasNextInt()) 
            {
                System.out.println("Only Integer is accepted");
                myscanner.next(); 
            }
            row = myscanner.nextInt();
        } while (row < 0);
        
        //get column    
        do 
        {
            System.out.println("Please enter a row greater than 0");
            while (!myscanner.hasNextInt()) 
            {
                System.out.println("Only Integer is accepted");
                myscanner.next(); 
            }
            column = myscanner.nextInt();
        } while (column < 0);
        //get random nubmer first matrix
        int[][] myfirstmatrix = randomMatrix(row, column);
        System.out.println("Your First Matrix is");
        printMatrix(myfirstmatrix);
        
        //Second Matirix
        //get row row should not be same as first coloum

        do 
        {
            System.out.println("Please enter a row greater than 0 and same as first matix column");
            while (!myscanner.hasNextInt()) 
            {
                System.out.println("Only Integer is accepted");
                myscanner.next(); 
            }
            row2 = myscanner.nextInt();
        } while (row2 < 0 || row2 != column);
        
        //get column    
        do 
        {
            System.out.println("Please enter a column greater than 0");
            while (!myscanner.hasNextInt()) 
            {
                System.out.println("Only Integer is accepted");
                myscanner.next(); 
            }
            column2 = myscanner.nextInt();
        } while (column2 < 0);
        //get random number matrix 2
        int[][] mysecondmatrix = randomMatrix(row2, column2);
        System.out.println("Your Second Matrix is");
        printMatrix(mysecondmatrix);
        
        
        //get multiplied matrix1 and matrix2
        int[][] mymultipliedmatrix = matrixMultiply(myfirstmatrix, mysecondmatrix);
        System.out.println("Your multiplied Matrix is");
        printMatrix(mymultipliedmatrix);
    }
        
        
    //Your method, multiply(), should accept two 2-dimensional arrays in row-major format, 
    //and it should generate a 2-dimensional output array in row-major format    
    public static int[][] matrixMultiply(int[][] a, int[][] b)
    {
        int row1 = a.length;
        int row2 = b.length;
        int column1 = a[0].length;
        int column2 = b[0].length;
        int[][] matrixMultiply = new int[row1][column2];
        int temp = 0;
        
        
        //error check catch bugs
        // your code should print an error and return null
        if(row1 != column2)
        {
            System.out.println("multiplication is not possible");
            return null;
        }
        //Next, figure out the dimensions of the output array.
        //compute the linear combinations necessary to compute each matrix element.
        else
        {
            //row
            for (int i = 0; i < row1; i++) 
            {
                //column
                for (int j = 0; j < column2; j++) 
                {
                    //get result
                    for (int k = 0; k < row2; k++) 
                    {
                        matrixMultiply[i][j] = matrixMultiply[i][j] + a[i][k] * b[k][j];
                    }
               
                }
            }
            return matrixMultiply;
        }
    }
}

        
     
        /*
        int column;
        int column2;
        int[][] firstmatrix = new int[a.length][column];
        for(int i = 0; i < a.length; i++)
        {
            firstmatrix[i] = new int[a[i].length];
            for (int j = 0; j < a[i].length; j++)
            {
                firstmatrix[i][column] = a[i][j];
            }
        }
        
        int[][] secondmatrix = new int[b.length][column2];
        for(int i = 0; i < a.length; i++)
        {
            firstmatrix[i] = new int[b[i].length];
            for (int j = 0; j < b[i].length; j++)
            {
                secondmatrix[i][j] = b[i][j];
            }
        }    */
        
        //error check catch bugs
        //if(b != c)
        //{
        //    System.out.println("multiplication is not possible");
        //      return null;
        //   }
            
        // else
        //   {
        //        
        //     }
            
    
        
        
        
        
        
    

