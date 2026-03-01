package controlflow_loops;
import java.util.*;

public class For_example {

	public static void main(String[] args) {
//		for example 
		Scanner input=new Scanner(System.in);
		System.out.println("enter n value");
		
		int n=input.nextInt();
		System.out.println(n);
		for (int i=0; i<=n ;i++) {
			System.out.println(i);
		}
		int i=1;
		while(i <=n) {
			System.out.println(i);
			i++;
		}
	System.out.println("\n");
		do {
			System.out.println(i);
			i++;
		}while(i<=n);
		
input.close();
	}

}
