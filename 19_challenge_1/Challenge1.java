import java.util.*;

public class Challenge1{

	public static void main(String[] args){
		String name = Prompter.prompt("What is your name ?");
		System.out.println("My name is "+name);
		String surname = Prompter.prompt("what is youre surname ?");
		System.out.println("My surname is " +surname);
		System.out.println(name +" "+ surname);
	}

	

}