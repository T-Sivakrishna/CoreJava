package controlflow_loops;
import java.util.*;

public class Reverse_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Number to Reverse");
		int Num=input.nextInt();
		System.out.println(Num);
		int reverse=0;
		while(Num !=0) {
			int digit=Num % 10;
		    reverse=reverse * 10+ digit;
		    Num=Num/10;
		}
		 System.out.println("\n"+reverse); 
		input.close();		
	}

}
