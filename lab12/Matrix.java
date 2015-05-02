import java.util.Scanner;
import java.util.*;

public class Matrix{
    
    
    public static int [][]increasingMatrix(int width, int height, boolean format)
    {
        
        int [][]myarray;
        int mynum = 1;
        if(format)
        {
            myarray = new int [height][width];
            for(int i =0; i < height; i++)
            {
                for(int j = 0; j<width; j++)
                {
                    myarray[i][j] = mynum;
                    mynum++;
                }
            }
        }
        
        else
        {
            myarray = new int [width][height];
            for(int i =0; i < height; i++)
            {
                for(int j = 0; j<width; j++)
                {
                    myarray[j][i] = mynum;
                    mynum++;
                }
            }
        }
        return myarray;
    }
    
    public static void printMatrix(int[][] array, boolean format)
    {
            
        if(format)
        {
            for(int i = 0; i < array.length; i++)
            {
                System.out.print("[ ");
                for(int j=0; j< array[0].length; j++)
                {
                    System.out.print(array[i][j]+ " ");
                }
                System.out.println("]");
            }
        }
        else
        {
            for(int i = 0; i < array.length; i++)
            {
                System.out.print("[ ");
                for(int j=0; j< array[0].length; j++)
                {
                    System.out.print(array[j][i]+ " ");
                }
                System.out.println("]");
            }
        }
    }
    
    public static int [][]translate(int[][] array)
    {
        int mytransArray[][] = new int [array[0].length][array.length];
        for(int i = 0; i<array[0].length; i++)
        {
            for(int j=0; j<array.length;j++)
            {
                mytransArray[i][j] = array[j][i];
            }
        }
        
        return mytransArray;
    }
    
    public static int [][] addMatrix( int[][] a, boolean formata, int[][] b, boolean formatb)
    {
        if(!formata)
        {
            a = translate(a);
        }
        if(!formatb)
        {
            b =translate(b);
        }
        if(a.length == b.length && a[0].length ==b[0].length)
        {
            for(int i = 0; i < a.length; i++)
            {
                for(int j = 0; j < a[0].length;j++)
                {
                    a[i][j] = a[i][j]+b[i][j];
                }
            }
            return a;
        }
        else
        {
            System.out.println("Unable to add input matrices.");
            return null;
        }
    }
        
    public static void main(String[] args) 
    {
        int width1, width2, heigth1, height2;
        int[][] arrayA, arrayB, arrayC;
        
        width1 = (int)(Math.random()*5+1);
        width2 = (int)(Math.random()*5+1); 
        heigth1= (int)(Math.random()*5+1);    
        height2 = (int)(Math.random()*5+1);    
        arrayA = new int[heigth1][width1];
        arrayB = new int[width1][heigth1];
        arrayC = new int[height2][width2];

        System.out.println("Generating a matrix");
        arrayA = increasingMatrix(width1, heigth1, true);
        printMatrix(arrayA, true);
        
        System.out.println("Generating a matrix");
        arrayB = increasingMatrix(width1, heigth1, false);
        printMatrix(arrayB, false);
        
        System.out.println("Generating a matrix");
        arrayC = increasingMatrix(width2, height2, true);
        printMatrix(arrayC, true);

        System.out.println("Adding two matrices.");
        printMatrix(addMatrix(arrayA, true, arrayB, false), true);


    }
    
    
}//end of class