import java.util.Scanner;

public class Main {

	static Scanner input;
	static int value1;
	static boolean tries = true;

	public static void main(String[] args) {

//		do {
//			System.out.print("Enter only integers:");
//			enterValue(value1);
//		} while (tries);
		
		
		while (tries) {
			System.out.print("Enter only integers:");
			enterValue(value1);
		}

	}

	public static boolean enterValue(int value) {
		

		try {
			input = new Scanner(System.in);
			value = input.nextInt();
			System.out.println("Succes");
			tries = false;
			return tries;

		} catch (Exception e) {

			System.err.println("Error");
			tries = true;
			return tries;
		}

	}

}
