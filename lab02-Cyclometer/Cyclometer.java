//
//Sewook Hur
//
//My bicycle cyclometer (meant to measure speed, distance, etc.) 
//records two kinds of data, the time elapsed in seconds, 
//and the number of rotations of the front wheel during that time.
//For two trips, given time and rotation count, your program should
//a. print the number of minutes for each trip
//b. print the number of counts for each tirp
//c. print the distance of each trip in miles
//d. print the distance for the two trips combined


//define a class

public class Cyclometer{
    
    //add main method
    
    public static void main(String[] args){
        
        
        // our input data.
        //time elapese in second 1
        int secsTrip1=480;
        //time elapese in second 2
        int secsTrip2=3220;  
        //the number of rotations of the front wheel 1
        int countsTrip1=1561;
        //the number of rotations of the front wheel 2
        int countsTrip2=9037;
        
        // our intermediate variables and output data. Document!
        double wheelDiameter=27.0;  //wheelDiameter
        double PI=3.14159; // pi
        int feetPerMile=5280;  // feet per mile
        int inchesPerFoot=12;   // inch per foot
        int secondsPerMinute=60;  // second per min
        double distanceTrip1, distanceTrip2,totalDistance;
        
        
        //print the statment
        
        System.out.println("Trip 1 took "+ (secsTrip1/secondsPerMinute)+" minutes and had "+ countsTrip1+" counts.");
        System.out.println("Trip 2 took "+ (secsTrip2/secondsPerMinute)+" minutes and had "+ countsTrip2+" counts.");

        //run the calculations; store the values. Document your
        //calculation here. What are you calculating?
        // distance of trip 1 and 2
        distanceTrip1=countsTrip1*wheelDiameter*PI;
        // Above gives distance in inches
        //(for each count, a rotation of the wheel travels
        //the diameter in inches times PI)
        distanceTrip1/=inchesPerFoot*feetPerMile; // Gives distance in miles
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        totalDistance=distanceTrip1+distanceTrip2;
        
        //Print out the output data.
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
        System.out.println("Trip 2 was "+distanceTrip2+" miles");
        System.out.println("The total distance was "+totalDistance+" miles");
    }//end of method
}//end of class