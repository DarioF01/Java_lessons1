import java.util.*;

public class Challenge1{
	public static void main(String[] args){

	Challenge1->+Prompter:prompt("What is your name: ");
	activate Challenge1;
	Prompter-->-Challenge1:return name;

	Challenge1->+Prompter:prompt("What is your surname: ");
	Prompter-->-Challenge1:return surname;

	Challenge1->+Prompter:prompt("What is youre date of birth? DD/MM/YY: ");
	Prompter-->-Challenge1:return dob;

	Challenge1->+Prompter:prompt("How far is your favourite store from your house: ");
	Prompter-->-Challenge1:return distance;

	Challenge1->+DateValidator:isValid(dob);
	DateValidator-->-Challenge1:return dateValid;

	Challenge1->+NumberValidator:isValid(distance);
	NumberValidator-->-Challenge1:return distanceIsNumeric;

	int age = 0;

	alt if(dateValid):

	//Place the logic to extract the year of birth here

	Challenge1->+AgeCalculator:calculate(yob);
	AgeCalculator-->-Challenge1:return age;
	Challenge1->Challnge1:System.out.println("You are "+age+" years old");
	else 
		Challenge1->+Challenge1:System.out.println("Date is not valid");

	alt if(distantIsNumeric):

	Challenge1->+MilesCalculator:calculate(distance);
	MilesCalculator-->-Challenge1:return miles;
	Challenge1->Challenge1:System.out.println("The distance from the shop is "+miles+" miles");

	Challenge1->+Printer:print(name,surname,age,miles);
	// place logic to print a customised greeting here.
	// place logic to print age and distance in miles here 

	Printer-->-Challenge1:return;
	else 
		Challenge1->Challenge1:System.out.println("Date is not valid exiting");

	}
}