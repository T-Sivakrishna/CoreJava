package controlflow_loops;
import java.util.*;

public class Fibonacci_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		System.out.println("enter limit for sequance");
		int fibb=input.nextInt();
		System.out.println(fibb+"\n");
		int a=0;
		int b=1;
		System.out.println(a);
		System.out.println(b);
		for(int i=3; i<=fibb ; i++) {
			int c=a+b;
			a=b;
			b=c;
			System.out.println(c);
		}
		input.close();
	}

}
