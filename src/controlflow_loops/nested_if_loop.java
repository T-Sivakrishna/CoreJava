package controlflow_loops;

import java.util.*;

public class nested_if_loop {

	public static void main(String[] args) {
//		Nested if Loop
		Scanner input=new Scanner(System.in);
		System.out.println("Enter num1");
		int num1=input.nextInt();
		System.out.println("Enter num2");
		int num2=input.nextInt();
		System.out.println("Enter num3");
		int num3=input.nextInt();
		System.out.println("num1 :"+num1);
		System.out.println("num2 :"+num2);
		System.out.println("num3 :"+num3);
		
		if(num1>=num2) {
			if(num1>=num3) {
				System.out.println("\n"+num1+":is Greater");

			}else {
				System.out.println("\n"+num3+":is Greater");

			}
		}else if(num2>=num1) {
			if(num2>=num3) {
				System.out.println("\n"+num2+":is Greater");

			}else {
				System.out.println("\n"+num3+":is Greater");

			}
		}else {
			System.out.println("All Values are equal");
		}
		input.close();

	}

}
