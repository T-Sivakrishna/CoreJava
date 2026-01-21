package basics;
import java.util.*;

public class LargestofThreeNumbers {

	public static void main(String[] args) {
		// To find largest among 3 numbers.
		Scanner number=new Scanner(System.in);
		System.out.println("Enter num1 :");
		int num1=number.nextInt();
		System.out.println("Enter num2 :");
		int num2=number.nextInt();
		System.out.println("Enter num3 :");
		int num3=number.nextInt();
		System.out.println("\n");
		System.out.println("num1 :" + num1);
		System.out.println("num2 :" + num2);
		System.out.println("num3 :" + num3);
		
		System.out.println();		
//		Method 1
		if(num1>=num2 && num1>=num3) {
		System.out.println("\n Largest Number among the 3 is :"+num1);
		}
		else if(num1<=num2 && num2>=num3) {
			System.out.println("Largest Number among the 3 is :"+num2);
		}else {
			System.out.println("Largest Number among the 3 is :"+num3);
		}
		
//		Method 2
		
		int Large=(num1>=num2)?((num1>=num3)?num1:num3):((num2>=num3)?num2:num3);
		System.out.println("Large (Terniary) number : "+Large);
		
//      Method 3
	int maximum =Math.max(num1,Math.max(num2, num3));
	 System.out.println("Max Number :" +maximum);	
	 
	 
	 number.close();
	}

}
