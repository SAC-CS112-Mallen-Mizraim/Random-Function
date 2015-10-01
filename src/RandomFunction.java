// Miz Mallen
import java.util.Scanner;
public class RandomFunction 
{	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		int rand;
		int userNum;
		
		System.out.println("Please guess a number between 1 and 10: ");
	    userNum = input.nextInt();
		
		rand = 1 + (int)(Math.random() * 10);
		System.out.println(rand);
	
	    if ( rand == userNum)
	    System.out.println("You got it!");
	    	
	    if ( rand != userNum)
	    System.out.println("Sorry, you got it wrong.");
	    		
	    }

}