import java.util.Scanner;
public class GetInput1{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("What is youre name?");
		String name = in.nextLine();
		System.out.println("What is youre surame?");
		String surname = in.nextLine();
		System.out.println("Hello" + " " + name + " " + surname);
	}
}