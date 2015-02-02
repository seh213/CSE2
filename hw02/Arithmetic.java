//CSE002 HW2: Arithmetic Calculations
//Spring 2015 Homework Assignment 2
//2015 Feb 3
//Sewook Hur

//You go shopping at Walmart’s and want to compute 
//the cost of the items you bought, including the PA sales tax of 6%.
//Begin by setting up a class called “Arithmetic” with a main method,
//as you did in your first homework.

//define a class

public class Arithmetic{
    
    //add main method
    
    public static void main(String[] args){
        
        //print the statment
        
        //Number of pairs of socks
        int nSocks=3;
        //Cost per pair of socks
        //(‘$’ is part of the variable name)
        double sockCost$=2.58;

        //Number of drinking glasses
        int nGlasses=6;
        //Cost per glass
        double glassCost$=2.29;

        //Number of boxes of envelopes
        int nEnvelopes=1;
        //cost per box of envelopes
        double envelopeCost$=3.25;
        
        //PA tax
        double taxPercent=0.06;
        
        //cost of Socks
        double sockscost = sockCost$*nSocks;
        
        //cost of socks after tax
        double ATsockscost = sockscost*taxPercent;
        
        //cost of drinking glasses
        double DGscost = nGlasses*glassCost$;
        
        //cost of dringking glassess after tax
        double ATDGscost = DGscost * taxPercent;

        //cost of boxes of envelopes
        double BoEscost = nEnvelopes*envelopeCost$;
        
        //cost of boxes of envelopes after tax
        double ATBoEscost = BoEscost * taxPercent;
        
        //Total cost before Tax
        double TotalCost = sockscost+DGscost+BoEscost;
        
        //Total cost after tax
        double ATTotalCost = sockscost+DGscost+BoEscost+ATsockscost+ATBoEscost+ATDGscost;
        
        //print out results
        System.out.println("Total cost of each kind of item Socks : $" + sockscost + " drinking glasses : $" + DGscost + " boxes of envelopes : $" + BoEscost);
        System.out.println("Total sales tax of total cost Socks : $" + String.format( "%.2f", ATsockscost ) + " drinking glasses : $" + String.format( "%.2f", ATDGscost ) + " boxes of envelopes : $" + String.format( "%.2f", ATBoEscost));
        System.out.println("Total cost of purchases before tax is $" + String.format( "%.2f", TotalCost));
        System.out.println("Total actually paid for this transaction, including sales tax is $" + String.format( "%.2f", ATTotalCost));
        
    }//end of class
}//end of method

