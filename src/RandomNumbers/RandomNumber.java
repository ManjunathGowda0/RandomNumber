package RandomNumbers;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {



	public static void main(String[] args) {
		
		
		
		
		
		Scanner sc = new Scanner(System.in);
		
		Random rand  = new Random();
		
		
		int randomnumber = rand.nextInt(10)+1;
		
		System.out.println("The Random Number is : "+randomnumber);
		
		System.out.println("Guess Random Number Game (Only 10 Tries)");
		int count = 0;
		
		while(true) {
			
	
			System.out.println("Please Enter you number between 1 - 10 :)");
			int playerguess = sc.nextInt();
			count++;
			
			
			if(count == 10) 
			{
				
				System.out.println("Stop it you cant guess!");
				System.out.println("10 tries over");
				break;
			}
			
			
			else if(randomnumber == playerguess)
			{
			System.out.println("Yahh! You got it right");
			System.out.println("You took "+ count + " tries");
			break;
			}
		else if (playerguess > randomnumber) {
				System.out.println("Your number is greather");
			
				}
		else 
				{	
			System.out.println("Your number is lesser");
				}
		}
		
		sc.close();
		
	}

}
