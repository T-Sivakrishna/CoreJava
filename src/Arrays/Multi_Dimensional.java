package Arrays;
import java.util.*;

public class Multi_Dimensional {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
			System.out.println("Enter array Size");
			int size1=input.nextInt();
			int size2=input.nextInt();
			if(size1<=0 || size2<=0) {
				System.out.println("Enter min rows and columns values 0 can't perform any action");
				input.close();
				return;
			}
			System.out.println("Enter array elements");
			
			int [][]arr=new int[size1][size2];
			for (int i=0 ; i<size1;i++) {
				for(int j=0; j<size2; j++) {
					arr[i][j]=input.nextInt();
//					System.out.println(arr[i][j]);
				}
				
			}
//			Specific Index print in 2D Array
			System.out.println(arr[0][1]+"\n");
			
//			Approch1 using For Each loop
			for(int []x:arr) {
				for(int val:x) {
					System.out.print(val+" ");
				}
				System.out.println();
			}
			
			
//			Approch2 Using For Loop
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[i].length;j++) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
			input.close();
	}

}
