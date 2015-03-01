//
//Sewook Hur
//print out Hello World

//define a class

public class HelloWorld{
    
    //add main method
    
    public static void main(String[] args){
        
        int k = 16;
        int j = 4;
switch (j){
 case 1: 
  System.out.print(1+""); 
  k /= 2;
case 2:
  System.out.print(2+"");
  k %= 5;
case 3:
  System.out.printf("3 ");
  k -= 4;
  break;   
default:
  System.out.printf("default ");
  k *= 5;
}
System.out.printf("k = %2.2f\n", (double)k);

        
    }//end of method
}//end of class