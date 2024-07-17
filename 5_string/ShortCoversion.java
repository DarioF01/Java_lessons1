import java.util.Scanner;
public class ShortCoversion{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		short age = 0;

		System.out.println("Insert age");
		age = input.nextShort();

		System.out.println(age + " You still have you're whole life ahead of you.");
	}
}