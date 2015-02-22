//CSE002 HW4
//Spring 2015 Homework Assignment 5
//2015 Feb 24
//Sewook Hur

//Your laptop display or computer monitor use tiny pixels to display what you see on your screen. 
//Pixels consist of three colors: Red, Green, and Blue (RGB) which are mixed together to produce all of the possible colors that your screen can display. 
//RGB are represented by 8-bits, so their values can range from 0 - 255. 
//For example, the color white is represented in (R,G,B) as (255, 255, 255) respectively.
//You will develop a program which takes decimal RGB values (three inputs) and convert them to hexadecimal.
//For example, the color white is represented in hexadecimal as FFFFFF. 

import java.util.Scanner;

public class ToHex{
    
    //add main method
    public static void main(String[] args){
        //variable
        Scanner myscanner;
        //declare my scaenner
        myscanner = new Scanner(System.in);
        
        //variable
        int R;
        int G;
        int B;
        
        //string variable
        String HexaR;
        String HexaG;
        String HexaB;
        
        //input validation and get R, G, B
        do 
        {
            System.out.println("Please enter numbers representing R value from 0 to 255: ");
            while (!myscanner.hasNextInt()) 
            {
                System.out.println("Only Integer is accepted");
                myscanner.next(); 
            }
            R = myscanner.nextInt();
        } while (R < 0 || R > 255);

        //input validation and get R, G, B
        do 
        {
            System.out.println("Please enter numbers representing G value from 0 to 255: ");
            while (!myscanner.hasNextInt()) 
            {
                System.out.println("Only Integer is accepted");
                myscanner.next(); 
            }
            G = myscanner.nextInt();
        } while (G < 0 || G > 255);
        
        
        //input validation and get R, G, B
        do 
        {
            System.out.println("Please enter numbers representing R value from 0 to 255: ");
            while (!myscanner.hasNextInt()) 
            {
                System.out.println("Only Integer is accepted");
                myscanner.next(); 
            }
            B = myscanner.nextInt();
        } while (B < 0 || B > 255);
        
        ////////////////////// R //////////////////////
        
        HexaR = Integer.toString(R/16);
        
        //first number
        if(R>0 && R<10)
        {
            HexaR = '0' + Integer.toString(R);
        }
        //from 0 to 15
        else if(R<16)
        {
            HexaR =  Integer.toString(R);
        }
        
        else if(R/16 == 10)
        {
            HexaR =  "A";
        }
        
        else if(R/16 == 11)
        {
            HexaR =  "B";
        }
        
        else if(R/16 == 12)
        {
            HexaR =  "C";
        }
        
        else if(R/16 == 13)
        {
            HexaR =  "D";
        }
        
        else if(R/16 == 14)
        {
            HexaR =  "E";
        }
        
        else if(R/16 == 15)
        {
            HexaR =  "F";
        }
        
        //Remain(2nd number)
        if ((R%16 >= 0) && (R%16 < 10))
        {
            HexaR += Integer.toString(R%16);
        }
        //from 0 to 15
        else if((R < 16) && (R%16 > 0))
        {
            HexaR = Integer.toString(R);
        }
        else if(R%16 == 10)
        {
            HexaR += 'A';
        }
        else if(R%16 == 11)
        {
            HexaR += 'B';            
        }
        else if(R%16 == 12)
        {
            HexaR += 'C';            
        }
        else if(R%16 == 13)
        {
            HexaR += 'D';            
        }
        else if(R%16 == 14)
        {
            HexaR += 'E';            
        }
        else if(R%16 == 15)
        {
            HexaR += 'F';            
        }
        
        ////////////////////// G //////////////////////
        
        HexaG = Integer.toString(G/16);
        
        //first number
        if(G>0 && G<10)
        {
            HexaG = '0' + Integer.toString(G);
        }
        //from 0 to 15
        else if(G<16)
        {
            HexaG =  Integer.toString(G);
        }
        
        else if(G/16 == 10)
        {
            HexaG =  "A";
        }
        
        else if(G/16 == 11)
        {
            HexaG =  "B";
        }
        
        else if(G/16 == 12)
        {
            HexaG =  "C";
        }
        
        else if(G/16 == 13)
        {
            HexaG =  "D";
        }
        
        else if(G/16 == 14)
        {
            HexaG =  "E";
        }
        
        else if(G/16 == 15)
        {
            HexaG =  "F";
        }
        
        //Remain(2nd number)
        if ((G%16 >= 0) && (G%16 < 10))
        {
            HexaG += Integer.toString(G%16);
        }
        //from 0 to 15
        else if((G < 16) && (G%16 > 0))
        {
            HexaG = Integer.toString(G);
        }
        else if(G%16 == 10)
        {
            HexaG += 'A';
        }
        else if(G%16 == 11)
        {
            HexaG += 'B';            
        }
        else if(G%16 == 12)
        {
            HexaG += 'C';            
        }
        else if(G%16 == 13)
        {
            HexaG += 'D';            
        }
        else if(G%16 == 14)
        {
            HexaG += 'E';            
        }
        else if(G%16 == 15)
        {
            HexaG += 'F';            
        }
        
        ////////////////////// B //////////////////////
        
        
        HexaB = Integer.toString(B/16);

        //first number
        if(B>0 && B<10)
        {
            HexaB = '0' + Integer.toString(B);
        }
        //from 0 to 15
        else if(B<16)
        {
            HexaB =  Integer.toString(B);
        }
        
        else if(B/16 == 10)
        {
            HexaB =  "A";
        }
        
        else if(B/16 == 11)
        {
            HexaB =  "B";
        }
        
        else if(B/16 == 12)
        {
            HexaB =  "C";
        }
        
        else if(B/16 == 13)
        {
            HexaB =  "D";
        }
        
        else if(B/16 == 14)
        {
            HexaB =  "E";
        }
        
        else if(B/16 == 15)
        {
            HexaB =  "F";
        }
        
        //Remain(2nd number)
        if ((B%16 >= 0) && (B%16 < 10))
        {
            HexaB += Integer.toString(B%16);
        }
        //from 0 to 15
        else if((B < 16) && (B%16 > 0))
        {
            HexaB = Integer.toString(B);
        }
        else if(B%16 == 10)
        {
            HexaB += 'A';
        }
        else if(B%16 == 11)
        {
            HexaB += 'B';            
        }
        else if(B%16 == 12)
        {
            HexaB += 'C';            
        }
        else if(B%16 == 13)
        {
            HexaB += 'D';            
        }
        else if(B%16 == 14)
        {
            HexaB += 'E';            
        }
        else if(B%16 == 15)
        {
            HexaB += 'F';            
        }
        
        
        //printout result
        System.out.println("The decimal numbers R: " + R + ", G: " + G + ", B: " + B + " is represented in hexadecimal as: " + HexaR + HexaG + HexaB);
        
        
        
    }//end of method
}//end of class