import java.util.Scanner;

public class TemperatureConversion {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter a Fahrenheit temperature: ");
		double myFahrenheit = keyboard.nextDouble();
		double toCelcius = convertToCelcius(myFahrenheit);
		System.out.println(myFahrenheit + "F is equivalent to " + toCelcius + "C");
		
		
		System.out.print("Enter a Celcius temperature: ");
		double myCelcius = keyboard.nextDouble();
		double toFahrenheit = convertToFahrenheit(myCelcius);
		System.out.println(myCelcius + "C is equivalent to " + toFahrenheit + "F");
		

		
	}
	
	public static double convertToFahrenheit(double number1) {
		double conversion = 9.0/5 * number1 + 32;
		return conversion;
	}
	
	public static double convertToCelcius(double number2) {
		double conversion2 = (number2 - 32) * 5.0/9;
		return conversion2;
	}

}