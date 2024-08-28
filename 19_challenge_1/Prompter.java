 import  java.util.*;
 public class Prompter{
 	public static String prompt(String prp){
 		System.out.println(prp);
 		Scanner name = new Scanner(System.in);
 		return name.nextLine();
		
		}
 	}
