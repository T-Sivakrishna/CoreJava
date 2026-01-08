package basics;
import java.util.*;

public class Operators {

	public static void main(String[] args) {
//		Operators:Operators are used to perform certain actions like add,sub,mul,div module, etc...
//		1.Arthmetic Operator(+,-,*,%)
		Scanner input = new Scanner(System.in);
//		Input
		System.out.println("Enter Number a:");
		int a=input.nextInt();
		System.out.println("Enter Number b: ");
		int b=input.nextInt();
//		Output
		System.out.println("\na :"+ a);
		System.out.println("b :"+ b);
		System.out.println("\n--------Arithmetic Operator----------\n");
		System.out.println("a+b :" + (a+b));
		System.out.println("a-b :" + (a-b));
		System.out.println("a*b :" + (a*b));
		System.out.println("a/b :" + (a/b));
		System.out.println("a%b :" + (a%b));
//		2.Realtional Operators(<,>,<=,>=,!=,==)
		System.out.println("\n--------Relational Operator----------\n");
		System.out.println("a<b  :"+(a<b));
		System.out.println("a>b  :"+(a>b));
		System.out.println("a<=b :"+(a<=b));
		System.out.println("a>=b :"+(a>=b));
		System.out.println("a!=b :"+(a!=b));
		System.out.println("a==b :"+(a==b));
//		3.Logical Operator(&&,||,!,^)
		System.out.println("\n--------Logical Operator----------\n");
		System.out.println("Logical AND   :"+((a>b) && b>0));
		System.out.println("Logical OR    :"+((a<b)|| b>5));
		System.out.println("Logical XOR   :"+((a<b) ^ (b>0)));
		System.out.println("Logical NOT   :"+ !(a==b));
//		4.Bitwise Operator(&,|,~,<<,>>)
		System.out.println("\n--------BitWise Operator----------\n");
		System.out.println("a&b : "+(a&b));
		System.out.println("a|b : "+(a|b));
		System.out.println("a^b : "+(a^b));
		System.out.println("a<<b: "+(a<<b));
		System.out.println("a>>b: "+(a>>b));
		System.out.println("~a  : " +(~a));
//		5.Increment Operator(++ , Prefix ++a, Postfix a++)
		System.out.println("\n--------Increment Operator----------\n");
		System.out.println("PreIncrement: "+(++a));
		System.out.println("PostIncrement : "+(a++));
//		6.Decrement Operator (--,Prefix --b,Postfix b--)
		System.out.println("\n--------Decrement Operator----------\n");
		System.out.println("PreDecrement: "+(--b));
		System.out.println("PostDecrement : "+(b--));
//		7.Conditional Operator(conditon ? expression : expression )
		System.out.println("\n--------Conditional Operator----------\n");
		System.out.println(a>b ? "a is  greater " : "b is greater ");
		System.out.println(a<b ? "a is  Smaller" : "b is Smaller");
//		8. Assginment Operator(+=,-=,*=,/=,%=)
		System.out.println("\n--------Assignment Operator----------\n");
		System.out.println("Enter x value");
		int x=input.nextInt() ;
		System.out.println("x : " +x);
		System.out.println("Enter y value");
		int y=input.nextInt() ;
		System.out.println("y : "+y);
		System.out.println("x+=y :" + (x+=y));
		System.out.println("x-=y :" + (x-=y));
		System.out.println("x*=y :" + (x*=y));
		System.out.println("x/=y :" + (x/=y));
		System.out.println("x%=y :" + (x%=y));
	
		input.close();
	}

}
