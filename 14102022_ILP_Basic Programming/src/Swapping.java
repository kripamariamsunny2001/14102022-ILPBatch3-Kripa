import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int firstNumber;
		int secondNumber;
		System.out.println("Before Swapping");
		System.out.println("Enter First No- ");
		firstNumber=scanner.nextInt();
		System.out.println("Enter Second No- ");
		secondNumber=scanner.nextInt();
		
		int temporary=firstNumber;
		firstNumber=secondNumber;
		secondNumber=temporary;
		System.out.println("After Swapping");
		
		System.out.println(firstNumber+"   "+secondNumber);
		
		
	}

}
