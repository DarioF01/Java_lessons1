public class BreakTest{
	public static void main(String[] args){
		int limit = 8;
		int i = 0;

		do {
			System.out.println("Counter = " +i);
			i++;
			if(i==limit)
				break;
		}while (i < 10);
	}
}