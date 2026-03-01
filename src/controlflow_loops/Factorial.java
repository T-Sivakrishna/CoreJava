package controlflow_loops;
import java.util.*;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
        System.out.println("Enter requried Factorial Number");
        int Fact=input.nextInt();
        System.out.println("Factorial : "+Fact);
        int fact=1;
        for(int i=1;i<=Fact ; i++) {
        	 fact *= i ;
        	 if(i<Fact) {
        		 System.out.print(i+"*"); 
        	 }else {
        		 System.out.print(i);
        	 }
        	 
        }
        System.out.println("="+fact);
        input.close();
	}

}
