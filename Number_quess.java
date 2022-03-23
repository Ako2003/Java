import java.util.Arrays;
import java.util.Scanner;

import javax.print.attribute.IntegerSyntax;

public class Number_quess{
	public static void main(S_tring[] args){
		System.out.println("Computer wished a number! Try to guess it!");
		int user_input_number = -1, computer_number;
		S_tring user_input_string;
		Scanner obj = new Scanner(System.in);
		computer_number = (int)(Math.random()*10);
		while (true) {
			System.out.print("Enter your number: ");
			user_input_number = obj.nextInt();
			if(user_input_number == computer_number){
				System.out.println("You guessed the number!");
				System.out.println("Would you like to play again?");
				user_input_string = obj.next();
				if(user_input_string.equals("no")){
					break;
				}
			}
			else if(user_input_number > computer_number){
				System.out.println("Computer's number is less than yours");
			}
			else if(user_input_number < computer_number){
				System.out.println("Computer's number is greater than yours");
			}
		}
	}
}

