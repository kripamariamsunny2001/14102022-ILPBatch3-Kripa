import java.util.Scanner;

public class SwappingWithoutTemp {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int num1;
		int num2;
		System.out.println("Before Swapping");
		System.out.println("Enter First No- ");
		num1=scanner.nextInt();
		System.out.println("Enter Second No- ");
		num2=scanner.nextInt();
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		
		System.out.println("After Swapping");
		
		System.out.println(num1+"   "+num2);
		

	}

}
