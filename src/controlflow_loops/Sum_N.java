package controlflow_loops;
import java.util.*;

public class Sum_N {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		System.out.println("Enter number to perform SUM : ");
		int n=input.nextInt();
		int sum=0;
		for(int i=0;i<=n;i++) {
			
			if(i<n) {
				System.out.print(i+"+");	
			}else {
				System.out.print(i);
			}
			 sum += i;
			}
		System.out.println("="+sum);
		input.close();
	}
	
}
