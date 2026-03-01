package controlflow_loops;
import java.util.*;

public class Multipliaction_Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter requried table number");
		int mul=input.nextInt();
		System.out.println(mul+"\n");
		int n=10;
       for(int i=1;i<=n;i++) {

	         int Mul=mul*i;
	         System.out.println(mul+"*"+i+ "=" +Mul);
        }
		input.close();
	}

}
