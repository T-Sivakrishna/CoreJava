package basics;
import java.util.*;

public class TypeCasting {

	public static void main(String[] args) {
//		TypeCasting 
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a Value");
		int a=input.nextInt();
		System.out.println("Enter b Value");
		double b=input.nextDouble();
		System.out.println("a :"+a);
		System.out.println("b :"+b);
		System.out.print("---------TYPE CASTING-------\n");
//		Up Casting (Implicit Conversion)
		long A=a;
		System.out.println("A :"+A);
//		Down Casting (Explicit Conversion)
		float B=(float)b;
		System.out.println("B :"+B);
	}

}
