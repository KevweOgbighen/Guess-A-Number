import java.util.Scanner;
import java.util.Random;

public class Guess_A_Number {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);

		System.out.println("Guess the secret number.");
		System.out.print("\nEnter the maximum value for secret number: ");

		int max = sc.nextInt();
		Random num = new Random();

		int guess = 1 + num.nextInt(max);

		while (true)
		{
			System.out.println("A new secret number has been chosen.");
			int x = 0;
			int y = 0;
	
			while (x!= guess)
			{
				System.out.print("Enter guess: ");
				x = sc.nextInt();
				y++;
		
				if (x < guess)
				{
					System.out.println("Too low, try again.");
				} else if (x > guess) {
					System.out.println("Too high, try again");
				}
			}
	
			System.out.println("You won in " + y + " guesses!");
	
			System.out.print("\nPlay again? (Y/N)");
			sc.nextLine();
			String again = sc.nextLine();
	
			if (again.equalsIgnoreCase("y"))
			{
				continue;
			}
			else {
				break;
			}
		}
	}
}
