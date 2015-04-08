//CSE002 HW10   
//Spring 2015 Homework Assignment 10
//2015 Apr 7
//Sewook Hur

//randomInput(), delete(list,pos), and remove(list,target)





import java.util.Scanner;

public class RemoveElements
{
    public static void main(String [] arg)
    {
	    Scanner scan=new Scanner(System.in);
        int num[]=new int[10];
        int newArray1[];
        int newArray2[];
        int index,target;
	    String answer="";
	
	    do
	    {
  	        System.out.print("Random input 10 ints [0-9]");
  	        num = randomInput();
  	        String out = "The original array is:";
  	        out += listArray(num);
  	        System.out.println(out);
 
        	System.out.print("Enter the index ");
        	index = scan.nextInt();
  	        newArray1 = delete(num,index);
  	        String out1="The output array is ";
  	        out1+=listArray(newArray1); //return a string of the form "{2, 3, -9}"  
  	        System.out.println(out1);
 
            System.out.print("Enter the target value ");
        	target = scan.nextInt();
        	newArray2 = remove(num,target);
        	String out2="The output array is ";
  	        out2+=listArray(newArray2); //return a string of the form "{2, 3, -9}"  
  	        System.out.println(out2);
  	 
  	        System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
         	answer=scan.next();
        }while(answer.equals("Y") || answer.equals("y"));
    }
 
    public static String listArray(int num[])
    {
	    String out="{";
	    for(int j=0;j<num.length;j++)
	    {
  	        if(j>0)
  	        {out+=", ";}
         	out+=num[j];
	    }
	    out+="} ";
	    return out;
    }
    //randomInput(), delete(list,pos), and remove(list,target)
    //The randomInput() method generates an array of 10 random integers between 0 to 9.  Implement randomInput so that it fills the array with random integers and returns the filled array. 
    public static int[] randomInput()
    {
        int[] list =new int[10];
        int count = 0;
        while(count < 10)
        {
            //get random integers between 0 and 10
            list[count]  = (int)(Math.random()*10);
            //count++
            count++;
        }
        return list;
    }
    
    //The method delete(list,pos) takes, as input, an integer array called list and an integer called pos.  It should create a new array that has one member fewer than list, and be composed of all of the same members except the member in the position pos.  

    public static int[] delete(int[] list, int pos)
    {
        int size = list.length;
        
        //invalid check
        if (pos>=10 || pos<0)
        {
            System.out.println("The index is not valid.");
            return list;
        }
        
        else
        {
            //if there is one new array 9
            int[] deletedlist = new int[9];
            
            //copy
            for(int i = 0; i < pos; i++)
            {
                deletedlist[i] = list[i];
            }
            
            //copy after pos
            for (int i = pos; i < size-1; i++) 
            {
                deletedlist[i] = list[i+1];
            }
            return deletedlist;  
        }
    }
    
    //Method remove(list,target) deletes all the elements that are equal to target, returning a new list without all those new elements.
    public static int[] remove(int[] list, int target)
    {
        int count = 0;
        int count2 =0;
        //check there is same number
        for(int i = 0; i < 10; i++)
        {
            if(list[i] == target)
            {
                count++;
            }
        }
        //invalid check
        if (count == 0)
        {
            System.out.println("Element " + target + " was not found");
            int[] removedlist = new int[list.length];
            for(int i = 0; i < removedlist.length; i++)
            {
                removedlist[i] = list[i];
            }
        return removedlist;
        }
        //if there is eletment
        else
        {
            System.out.println("Element " + target + " has been found");
            //new array 
            int[] removedlist = new int[10-count];
            
            for(int i = 0; i < 10; i++)
            {
                if(list[i] != target)
                {
                    removedlist[i-count2] = list[i];
                }
                else
                {
                    count2++;
                }
            }
            return removedlist;
        }
        
    }//end of method
}//end of class
