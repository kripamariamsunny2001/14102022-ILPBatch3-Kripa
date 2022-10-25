import java.util.Scanner;

public class LastDigitEvenOdd {

	public static void main(String[] args) {
		int num;
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter a number");
		num=scanner.nextInt();
		int lastdigit = num%10;
		if(lastdigit%2==0)
		{
			System.out.println("last digit is even");
		}
		else
		{
			System.out.println("last digit is odd");
		}
	}

}
