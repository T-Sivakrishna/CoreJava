package basics;

public class Variables {
//	Instance Variable: Declared in inside the class,Outside the Method
// consists of Default Value
//	Stored in Heap Memory
	int a;
	float  b;
	double c;
	boolean d ;
//	Static Variable
//	Declared inside the class 
//	one copy for  main method
	static double rating=5.86;
	static int subscri=563;
	
	public static void main(String[] args) {
//		Variables in java Programming
		System.out.println("\n--------Instance Variable-------\n");	
	Variables Inst=new Variables();
	
	System.out.println(Inst.a);
	System.out.println(Inst.b);
	System.out.println(Inst.c);
	System.out.println(Inst.d);
	
	System.out.println("\n--------Static Variable-------\n");
	
	System.out.println(Variables.rating);
	Variables.rating=66.6;
	System.out.println(Variables.rating);
	System.out.println(Variables.subscri);
		
	
//	Local Variable: 
//	Declared inside the method
//	Must be initialize  value
//	Stored in stack Memory
	System.out.println("\n--------Local Variable-------\n");
	int Price=4000;
	boolean Usable=true;
	float Discount=8.2f;
	double Total=3618.88;
	
	System.out.println(Price);
	System.out.println(Usable);
	System.out.println(Discount);
	System.out.println(Total);
	
	
	}

}
