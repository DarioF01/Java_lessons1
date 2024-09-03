import java.util.*;

public class Challenge1{

	public static void main(String[] args){
		String name = Prompter.prompt("What is your name ?");
		String surname = Prompter.prompt("what is youre surname ?");
		String miles = Prompter.prompt("Distance from your house to your favourite store ?");
		double distance = MilesCalculator.calculate(miles);
		String milesv = Prompter.prompt("Please verify the distance:" + distance);
		boolean dvalid = NumberValidator.isValid(distance); 
		String year = Prompter.prompt("What is your year of birth ?");
		int age = AgeCalculator.calculate(year);
		String valid = Prompter.prompt("Please validate your year of birth ? " + year);
		boolean date = DateValidator.isValid(year);
		String print = Printer.print(String name, String surname, double distance, int age);
	}

	

}