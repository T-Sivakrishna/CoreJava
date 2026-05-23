package Arrays;
import java.util.*;

public class SingleDimension_Array {

	public static void main(String[] args) {
		
// SUM of single Dimension Array
		Scanner input=new Scanner(System.in);
		System.out.println("Enter array size");
		int size=input.nextInt();
		if(size<=0) {
					
			System.out.println("Array out of Bound Exception Enter the size above 0 ");
			input.close();
			return;
		}
		System.out.println("Enter array elements");
		
		int array[]=new int[size];
		
			
		for(int i=0;i<size;i++) {
			array[i]=input.nextInt();
		 
		}
		
		int sum=0;
		int min=array[0];
		int max=array[0];
		int evenCount =0;
		int oddCount=0;
		int count=0;
		
		
		for(int i=0;i<array.length;i++) {
			sum +=array[i];
//			Count of array Elements
			count++;
				
				
//			Minimum element in single-dimensional array
			if(array[i]<min) {
				min=array[i];
			}
//			Maximum element in single-dimensional array
			if(array[i]>max) {
				max=array[i];
			}
			
//			Even and Odd elements in the array
			if(array[i] %2 ==0) {
				evenCount++;
			}else {
				oddCount++;
			}
			
		}
		System.out.println("count :"+ count);
		System.out.println("Sum :"+ sum);
		System.out.println("Min :"+ min);
		System.out.println("Max :"+ max);
		System.out.println("even Count :"+ evenCount);
		System.out.println("Odd  Count  :"+ oddCount);
		
			
		input.close();

	}

}
