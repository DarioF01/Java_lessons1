public class ParamTest{
	public static void main(String[] args){
		String str1 = "I";
		String str2 = "Love";
		String str3 = "Monster Hunter";

		concatenateAndPrint(str1,str2,str3);
	}

	public static void concatenateAndPrint(String str1,String str2,String str3){
		String concatenatedString = str1 + " " + str2 + " " + str3;
		System.out.println("Concatenated String:" + concatenatedString);

	}
}