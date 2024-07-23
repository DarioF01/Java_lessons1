import java.util.Scanner;
public class MethodChallenge{
	public static String getName(){
		Scanner in = new Scanner(System.in);
		System.out.println("Name?");
		return in.nextLine();
	}
	public static String getSurname(){
		Scanner in = new Scanner(System.in);
		System.out.println("Surname?");
		return in.nextLine();
	}
	public static int getAge(){
		Scanner in = new Scanner(System.in);
		System.out.println("Age?");
		return in.nextInt();
	}
	public static void main(String[] args){

		// MethodChallenge obj = new MethodChallenge();
		// obj.getName();
		// obj.getSurname();
		// obj.getAge();
		String name = MethodChallenge.getName();
		String surname = MethodChallenge.getSurname();
		int age = MethodChallenge.getAge();

		System.out.println("Hello " + name +" "+ surname +" you are " + age + " years old.");

	}	

}