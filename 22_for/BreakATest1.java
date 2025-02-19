public class BreakATest1{
	public static void main(String[] args){
		int i = 0;
		do{
			System.out.println("outer " + i);
			i++;
			if (i == 8){
				break;
			}
		}while (i < 10);
	}
}