package controlflow_loops;
import java.util.*;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		System.out.println("Enter number to check");
		int Num=input.nextInt();
		System.out.println(Num);
		int Palindrome=Num;
		int reverse=0;
		
		while(Num !=0) {
			int digit= Num %10;
			reverse = reverse * 10 + digit ;
			Num=Num/10;
		}
		
		if(Palindrome == reverse) {
			System.out.println("Number is Palindrome");
		}else {
			System.out.println("Number is not a Palindrome");
		}
		input.close();
	}

}
