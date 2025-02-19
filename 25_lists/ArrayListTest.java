import java.util.ArrayList;
import java.util.List;

public class ArrayListTest{
	public static void main(String[] args){

		List<String>fruits = new ArrayList<>();

		fruits.add("apple");
		fruits.add("banana");
		fruits.add("peach");

		String[] fruitsArray = fruits.toArray(new String[0]);

		System.out.println("Array elements : ");
		for(String fruit: fruitsArray){
			System.out.println(fruit);
		}
	}
}