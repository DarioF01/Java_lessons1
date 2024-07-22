public class ReturnTest{
	public void getPen(String pen){
		System.out.println(pen);
	}
	public String getPen2(String pen){
		return pen;
	}
	public static void main(String[] args){
		ReturnTest obj = new ReturnTest();
		obj.getPen("Big ");
	    
	    String pen = obj.getPen2("pen");
	    System.out.println(pen);
	}
}