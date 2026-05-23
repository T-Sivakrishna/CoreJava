		package Arrays;
		import java.util.*;
		
		public class Linear_Search {
		
			public static void main(String[] args) {
				Scanner input=new Scanner(System.in);
				System.out.println("Enter Array Size");
				int size=input.nextInt();
				if(size<=0) {
					System.out.println("out of Bound Exception 0 size");
					input.close();
					return;
				}
				System.out.println("Enter Array Elements");
				int arr[]=new int[size];
				for (int i=0 ;i<size;i++) {
					arr[i]=input.nextInt();
					System.out.println(arr[i]);
				}
				System.out.println("Enter Search Element");
				int searchelement=input.nextInt();
				
				System.out.println("Element to search \n " +searchelement);
				
				 boolean Status=false;
				
				 for(int i=0 ;i<arr.length ;i++) {
					 if(arr[i]==searchelement) {
						 System.out.print(searchelement+" Element Found");
							 Status=true;
							 break; 
					 }
					
				 }
				 if(Status == false) {
					 System.out.print(searchelement+" Element Not Found");
					 
				 }
				 input.close();
			}
		
		}
