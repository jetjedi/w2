import java.util.Scanner;

public class SumOfIntegers {

	public static void main(String[] args) {

		/* Write a program that asks the user to enter a 5-digit positive integer. 
		 * Using only the / and % operations, compute each digit and display the sum of the digits. 
		 * Here is a sample run with the user input shown in red. 
		 * 
		 * Enter a 5-digit positive integer: 30458 
		 * The sum of the digits is 3 + 0 + 4 + 5 + 8 = 20
		 */
		
		int getNumber,remainder,total = 0;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a 5-digit positive integer: ");
		getNumber = keyboard.nextInt(); //assign input to getNumber
		
		//convert getNumber to string and count the length
		int isLength = String.valueOf(getNumber).length(); 
		
		
		//validate if isLength is at least 5 digits long and > 0.
		if(isLength != 5 || getNumber < 0) {
			System.out.println("Error: Number entered is not 5 digits long or is not positve. Exiting(0)");
			System.exit(0);
		}
		else {
			//cast getNumber to String so that I can iterate through each character later
			String nowString = String.valueOf(getNumber);
			while (getNumber > 0) {
				remainder = getNumber % 10; //divide getNumber by 10 and assign the remainder to remainder
				total += remainder;			//keep adding the remainder to total
				getNumber = getNumber / 10;	//divide getNumber by 10 and reassign the new value to getNumber
			}
			System.out.print("The sum of the digits is ");
			for(int i=0; i<nowString.length(); i++) {
				System.out.print(nowString.charAt(i) + " ");
			}
			System.out.println("= " + total);
		}
		keyboard.close();
	}

}
