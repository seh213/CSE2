
//import scanner to get data
import java.util.Scanner;

//bigmac program get number of bigmac, price and tax rate and let people know the result
public class BigMac {
    // main method required for every Java program
    public static void main(String[] args) {
        
        //decalre scanner
        Scanner myScanner;
        //call scanner         
        myScanner = new Scanner( System.in );
        //input number of bigmac
        System.out.print("Enter the number of Big Macs(an integer > 0): ");
        //accept user input        
        int nBigMacs = myScanner.nextInt();
        
        //input cost
        System.out.print("Enter the cost per Big Mac as" + " a double (in the form xx.xx): ");
        //accept user input
        double bigMac$ = myScanner.nextDouble();
        //input tax
        System.out.print("Enter the percent tax as a whole number (xx): ");
        //accept user input
        double taxRate = myScanner.nextDouble();
        //user enters percent, but I want proportion
        taxRate/=100; 
        
        //print out result
        double cost$;
        int dollars;   //whole dollar amount of cost 
        int dimes;
        int pennies; //for storing digits
          //to the right of the decimal point 
          //for the cost$ 
        cost$ = nBigMacs*bigMac$*(1+taxRate);
        //get the whole amount, dropping decimal fraction
        dollars=(int)cost$;
        //get dimes amount, e.g., 
        // (int)(6.73 * 10) % 10 -> 67 % 10 -> 7
        //  where the % (mod) operator returns the remainder
        //  after the division:   583%100 -> 83, 27%5 -> 2 
        dimes=(int)(cost$*10)%10;
        pennies=(int)(cost$*100)%10;
        System.out.println("The total cost of " +nBigMacs +" BigMacs, at $"+bigMac$ +" per bigMac, with a" +  " sales tax of "+ (int)(taxRate*100) + "%, is $"+dollars+"."+dimes+pennies);

        



    


        

    }  //end of main method   
} //end of class
