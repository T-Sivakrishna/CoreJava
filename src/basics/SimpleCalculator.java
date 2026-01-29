package basics;

import java.util.*; 

public class SimpleCalculator {

	public static void main(String[] args) {
//		Simple Calculator
		
//		Input class
		 Scanner input=new Scanner(System.in);
	        System.out.println("Enter Num1 Values");	        
//	       num1 value      
	        double num1=input.nextDouble();
//     	   Operator 
	        System.out.println("Enter Operator '+','-','*','/','%'");
	        char operation=input.next().charAt(0);
//	         num2 value
	        System.out.println("Enter Num2 Values");
	        double num2=input.nextDouble();
	        
	      System.out.println();
	        
	      
	      
	        if (num1==(int)num1)
	        {
	            System.out.println((int)num1);
	        }else{
	            System.out.println(num1);
	        }
	        
	        if(!(operation == '+' || operation=='-' || operation == '*' || operation == '/' || operation =='%'))
	        {
	            System.out.println("Invalid operation");
	            return;            
	        }
	        
	        System.out.println(operation);
	        if (num2==(int)num2)
	        {
	            System.out.println((int)num2);
	        }else{
	            System.out.println(num2);
	        }
	        

	        System.out.println();
	        
	        
	        if((operation == '/' || operation == '%')&&(num2==0)) {
	        	System.out.println("Error");
	        	return;
	        }
	        
	        double result=0;
//	Calculation operation        
       switch(operation) {
         case '+' : result = num1+num2 ; break;
         case '-' : result = num1-num2 ; break;
         case '*' : result = num1*num2 ; break;
         case '/' : result = num1/num2 ; break;
         case '%' : result = num1%num2 ; break;
         default:
        	 System.out.println("Invalid Operator");
      }
//       result
       if(result == (long)result) {
    	   System.out.println((long)result);
       }else {
    	   System.out.println(result);   
       }
       input.close();
       
	}

}
