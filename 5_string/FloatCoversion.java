import java.util.Scanner;
public class FloatCoversion{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		float height = 0;

		System.out.println("Insert Height");
		height = input.nextFloat();

		System.out.println(height +"m you're short.");
	}
}