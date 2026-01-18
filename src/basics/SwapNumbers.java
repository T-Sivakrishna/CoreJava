package basics;
import java.util.*;

public class SwapNumbers {

	public static void main(String[] args) {
//		Swapping Numbers
		Scanner input=new Scanner(System.in);
		System.out.println("Enter num1 :");
		int num1=input.nextInt();
		System.out.println("Enter num2 :");
		int num2=input.nextInt();
//		Before Swapping
		System.out.println("num1 :"+num1+" , num2 :"+num2);
// Swap number using Temporary Variable creation		
		int temp=num1;
		num1=num2;
		num2=temp;
//		AfterSwapping value
		System.out.println("num1 :" +num1);
		System.out.println("num2 :" +num2);

		input.close();
	}

}
