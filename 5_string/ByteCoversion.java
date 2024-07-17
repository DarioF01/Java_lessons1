import java.util.Scanner;
public class ByteCoversion{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		byte years = 0;

		System.out.println("How many years have passed?");
		years = input.nextByte();

		System.out.println(years + " years have passed.");
	}
}