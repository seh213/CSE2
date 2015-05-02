
import java.util.Random;

public class Methods {
    public static void main(String[] args) {

    System.out.println("The <" + adj(Random()) + "> <" + adj(Random()) + "> <" + sub(Random()) + "> <" + v(Random()) + "> the <" + adj(Random()) + "> <" + obj(Random()) + ">.");
    }
    
    public static String adj(int input) {
        String adjective = "";
        switch (input) {
            case 0: adjective = "1";
                break;
            case 1: adjective = "2";
                break;
            case 2: adjective = "3";
                break;
            case 3: adjective = "4";
                break;
            case 4: adjective = "5";
                break;
            case 5: adjective = "6";
                break;
            case 6: adjective = "7";
                break;
            case 7: adjective = "8";
                break;
            case 8: adjective = "9";
                break;
            case 9: adjective = "0";
                break;
        }
        return adjective;
    }
    
    public static String sub(int input) {
        String subject = "";
        switch (input) {
            case 0: subject = "A";
                break;
            case 1: subject = "B";
                break;
            case 2: subject = "C";
                break;
            case 3: subject = "D";
                break;
            case 4: subject = "E";
                break;
            case 5: subject = "F";
                break;
            case 6: subject = "G";
                break;
            case 7: subject = "H";
                break;
            case 8: subject = "I";
                break;
            case 9: subject = "J";
                break;
        }
        return subject; 
    }
    
    public static String v(int input) {
        String verb = "";
        switch (input) {
            case 0: verb = "a";
                break;
            case 1: verb = "b";
                break;
            case 2: verb = "c";
                break;
            case 3: verb = "d";
                break;
            case 4: verb = "e";
                break;
            case 5: verb = "f";
                break;
            case 6: verb = "g";
                break;
            case 7: verb = "h";
                break;
            case 8: verb = "i";
                break;
            case 9: verb = "j";
                break;
        }
        return verb;
    }
    public static String obj(int input) {
        String object = "";
        switch (input) {
            case 0: object = "11";
                break;
            case 1: object = "22";
                break;
            case 2: object = "33";
                break;
            case 3: object = "44";
                break;
            case 4: object = "55";
                break;
            case 5: object = "66";
                break;
            case 6: object = "77";
                break;
            case 7: object = "88";
                break;
            case 8: object = "99";
                break;
            case 9: object = "00";
                break;
        }
        return object;
    }
    public static int Random() 
    {
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(10);
        return randomInt;
    }
}