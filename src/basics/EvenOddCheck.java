package basics;
import java.util.*;

public class EvenOddCheck {

	public static void main(String[] args) {
//		Even odd check
		Scanner check=new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int Number=check.nextInt();
		System.out.println("Number :"+Number+"\n");
//		check whether number is Even or odd 
		if(Number %2==0) {
			System.out.println("Number is Even \n");
		}
		else {
			System.out.println("Number is Odd \n");
		}
//      Method 2
		if((Number & 1)==0) {
			System.out.println("Even Number \n");
		}else {
			System.out.println("odd Number \n ");
		}
		check.close();
	}

}
