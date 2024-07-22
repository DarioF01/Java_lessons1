import java.util.Scanner;
public class UserInput{
	public static void main(String[] args){
		Scanner myInput = new Scanner(System.in);
		System.out.println("Enter name.");

		String name = myInput.nextLine();
		System.out.println("Name: " + name);

	}

	
}