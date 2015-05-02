import java.util.Scanner;

public class Factorials {
    public static void main(String[] args) {
        Scanner myscanner;
        myscanner = new Scanner(System.in);
        int mynum;
            do 
            {
                System.out.println("Please enter a positive integer for super factorial of");
                while (!myscanner.hasNextInt()) 
                {
                    System.out.println("Only Integer is accepted");
                    myscanner.next(); 
                }
            mynum = myscanner.nextInt();
        } while (mynum < 0);
        
        int sum = 0;
        for(int i = 1; i <= mynum; i++){
            sum += factorial(i);
        }
        print(sum, mynum);
  }
  
    public static int factorial(int key){
        int mul = 1;
        for (int i = 1; i <= key; i++){
            mul *= i;
        }
        System.out.println(mul);
        return mul;
    }
    public static void print(int num, int mynum){
        System.out.println("The super factorial of " + mynum + "  is equal to " + num);
    }
}