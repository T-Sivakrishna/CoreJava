package controlflow_loops;

import java.util.*; 

public class Switch_Case {

	public static void main(String[] args) {
//		Switch Case
		Scanner input=new Scanner(System.in);
		System.out.println("Enter colour :");
		String Colour=input.next();
		System.out.println("Colour :"+Colour);
		
		switch(Colour.toLowerCase()) {
		case "red"  :System.out.println("You have entered "+ Colour);break;
		case"green" :System.out.println("You have entered "+ Colour);break;
		case"yellow":System.out.println("You have entered "+Colour);break;
		case"blue"  :System.out.println("You have entered "+ Colour);break;
		default:
			System.out.println("Invalid Colour");
		}
		input.close();
	}

}

