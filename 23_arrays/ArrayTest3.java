public class ArrayTest3{
	public static void main(String[] args){
		int [] lottonumbers = {233,444,678,675,897,678,453,567,455,456,453};

		for(int i = 0;i < lottonumbers.length;i++){
			if(lottonumbers[i] % 2 == 1){
			System.out.println("index = "+ i +"value = " +lottonumbers[i]);

			}
		}
	}
}