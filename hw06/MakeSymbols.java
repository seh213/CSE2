//CSE002 HW6
//Spring 2015 Homework Assignment 6-3
//2015 Mar 3
//Sewook Hur


//For this program, you need to use do-while loops and the random number generator to generate an integer between 0 and 100. 
//You will first need to print out the number. If the number is even, you will then print out that number of “*” characters; 
//if the number is odd, then you will print out that number of “&” characters.   Save your code in MakeSymbols.java

public class MakeSymbols{
    
        public static void main(String[] args){
            
            int random;
            int count;
            
            //generate an integer between 0 and 100
            random = (int)(Math.random()*101);
            
            System.out.println("Random number generated : " + random);
            
            count = random;
            
            //If the number is even, you will then print out that number of “*”
            if(random%2 == 0)
            {
                do{
                    System.out.print("*");
                    count--;
                }while(count>0);
            }
            //if the number is odd, then you will print out that number of “&” characters.
            if(random%2 == 1)
            {
                do{
                    System.out.print("$");
                    count--;
                }while(count>0);
            }
        }//end of method
        
}//end of class
    