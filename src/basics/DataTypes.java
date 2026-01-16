package basics;

import  java.util.*;

public class DataTypes {

	public static void main(String[] args) {
		// Various kinds of dataTypes
//		Int,Float,Char,String,shortInt,LongInt,Double,Arrays,Boolean,Byte
		
System.out.println("\n-------------Primitive DataTypes-------------\n");
      
byte smallnum=127;
short mediumNum=32767;
int DefaultNum=987654210;
long longNum=908732465256664342L;
boolean isFlag=false;
float Pie=3.14f;
double Price=565.18d;
char Letter='S';

System.out.println("byte   : "+smallnum);
System.out.println("short  : "+mediumNum);
System.out.println("int    : "+DefaultNum);
System.out.println("long   : "+longNum);
System.out.println("boolean: "+isFlag);
System.out.println("float  : "+Pie);
System.out.println("double : "+Price);
System.out.println("char   : "+Letter);

System.out.println("\n--------------Non-Primitive DataTypes--------------\n");

String Name="Java Programming";
System.out.println("String : "+Name);

String Cart[]= {"Chips","Choclates","Cakes","Popcorn"};
int Cost[]= {20,90,150,45};
float Discount[]= {3.2f,2.2f,18.7f,0.4f};
double Total[]= {16.98,87.8,132.30,44.96};
System.out.println("\n------Indexing Method------\n");
System.out.println("item     : " + Cart[3]);
System.out.println("Cost     : " +Cost[3]);
System.out.println("Discount :" + Discount[3]);
System.out.println("Total    :" + Total[3]);
System.out.println("\n---------Looping Method------\n");
for(int i=0; i<Cart.length;i++) {
	System.out.println("Cart     :"+Cart[i]);
	System.out.println("Cost     : "+Cost[i]);
	System.out.println("Discount : "+Discount[i]);
	System.out.println("Total    : "+Total[i]+"\n");
}
System.out.println("\n------Reverse Array-------\n");
for (int i=Cart.length-1;i>=0; i--) {
	System.out.println(Cart[i]);
	System.out.println(Cost[i]);
	System.out.println(Discount[i]);
	System.out.println(Total[i]+"\n");
}
  }

}
