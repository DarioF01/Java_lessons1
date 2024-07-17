import java.util.Scanner;
public class CharCoversion{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		char letter = 0;

		System.out.println("What is the first letter in the alphabet?");
		letter = input.next().charAt(0);

		System.out.println(letter + " you are correct");
	}
}