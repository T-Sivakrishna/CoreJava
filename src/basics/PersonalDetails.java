package basics;
import java.util.*;

public class PersonalDetails {
	public static void main(String args[]) {
		
//		Object Creation using Scanner Class
		
		Scanner input=new Scanner(System.in);
		
//		Input statements
		
		System.out.println("Enter Name:");
		String Name=input.nextLine();
		System.out.println("Enter SurName:");
		String SurName=input.nextLine();
		System.out.println("Enter Graduation:");
		String Graduation=input.nextLine();
		System.out.println("Enter Age:");
		int Age=input.nextInt();
		input.nextLine();
		System.out.println("Enter Address:");
		String Address=input.nextLine();
		System.out.println();
		System.out.println("--------PersonalDetails--------\n");
		
//		Output Printing Statements
		
		System.out.println("Name      : "+ Name);
		System.out.println("SurName   : "+ SurName);
		System.out.println("Age       : "+ Age);
		System.out.println("Graduation: "+Graduation);
		System.out.println("Address   : "+Address);
		
	input.close();	
	}

}
