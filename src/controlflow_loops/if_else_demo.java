package controlflow_loops;

import java.util.*;

public class if_else_demo {

	public static void main(String[] args) {
//		If-else statement example
// if-else condition  is used for the Decision making if is true then it prints block inside the if otherwise else		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Number :");
		int number=input.nextInt();
		System.out.println("number :"+ number);
		System.out.println("\n----------------if-else---------------\n");
		if(number %2==0) {
			System.out.println("Even Number");
		}else {
			System.out.println("Odd Number");
		}
		
//		Second Example
		System.out.println("\n----------------if-else---------------\n");
		System.out.println("Enter number :");
		int a=input.nextInt();
		 System.out.println("a"+a);
		 if(a>=0) {
			 System.out.println("Postive Number");
		 }else{
			 System.out.println("Negtive  Number");
		 }
		
		input.close();
	}

}
