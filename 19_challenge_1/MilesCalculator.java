public class MilesCalculator{
	public static double calculate(String mc){

		double distance = Double.parseDouble(mc);
		double results = distance/1.609;

		return results;
	}
}