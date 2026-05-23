package Arrays;
import java.util.*;

public class Reverse_Array {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int size=input.nextInt();
		if(size<=0) {
			System.out.println("Out of Bound Exception 0 size");
			input.close();
			return;
		}
		System.out.println("enter array elements");
	
		int arr[]=new int[size];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=input.nextInt();
			System.out.print(arr[i]);
		}
//		Dynamic Reverse 
		System.out.println("\n reverse array");
		for(int i=size -1;i>=0;i--) {
			System.out.println(arr[i]+ " ");
		}
		input.close();
//		
//		Hard coded Reverse  
//		Method 2
		int array[]= {1,2,3,4,5,6,7};
		System.out.println("Before reverse");
		for(int i=0;i<array.length;i++) {
			
			System.out.print(array[i]+" ");
		}
//		reverse array
		System.out.println("\narray reversing");
		for(int i=array.length-1;i>=0;i--) {
			System.out.print(array[i]+" ");
		}
		
	}

}
