package ch03pc06;
import java.util.Scanner;
/**
 *
 * @author FRANK.OLSON
 * date: 11/1/2017
 * purpose: display the amount of time
 */
public class Ch03pc06 {

    public static void main(String[] args) {
        //variables
        int seconds, result;
        
        //create keyboard input
        Scanner keyboard = new Scanner(System.in);
        
        //Request input
        System.out.print("Please enter the number of seconds: ");
        seconds = keyboard.nextInt();
        
        if (seconds < 60)
            System.out.println("There are " + seconds + " seconds in the amount you provided");
        else if (seconds >= 60 && seconds < 3600)
        {
            result = seconds/60;
            System.out.println("There are " + result + " minutes in the amount you provided");
        }
        else if (seconds >= 3600 && seconds < 86400)
        {
            result = seconds/3600;
            System.out.println("There are " + result + " hours in the amount you provided");
        }
        else if (seconds >= 86400)
        {
            result = seconds/86400;
            System.out.println("There are " + result + " days in the amount you provided");
        }
        
    }
    
}
