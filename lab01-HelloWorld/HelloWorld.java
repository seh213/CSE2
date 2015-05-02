//
//Sewook Hur
//print out Hello World

//define a class
import java.util.Scanner;
public class HelloWorld{
    
    //add main method
    

    public static void main( String args[] )
    {
     int x[]={1, 2, 4, 6};
     int y[]={2, 3, 4};
     y = x;
print(x);
System.out.println();
print(y);





    }
    public static void print(double[] A)
    {
        for(int i = 0; i < A.length; i++)
        {
            System.out.print(A[i]);
            System.out.print(",");
            
        }
    }
    public static void print(int[] A)
    {
        for(int i = 0; i < A.length; i++)
        {
            System.out.print(A[i]);
            System.out.print(",");
            
        }
    }
    

    
    
public static int enigma(double x[], double y[],int z[]){
        double []temp;
        temp=x;
        temp[z[2]]=42.0;
        y=x;
        y[0]=2.34;
        System.out.println();
        print(x);
        System.out.println();
        print(y);
        System.out.println();
        print(z);
        System.out.println();
        
        return z[z[0]];
    }


}//end of class