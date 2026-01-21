package basics;
import java.util.*;

public class LeapYearCheck {

	public static void main(String[] args) {
//		Leap Year Check
		
		Scanner Entry=new Scanner(System.in);
		System.out.println("Enter Year");
		int Year=Entry.nextInt();
		System.out.println("Year : "+Year);
		
		if((Year%4 ==0 && Year%100 !=0) || Year%400==0){
			System.out.println(Year + " is Leap Year");
		}else {
			System.out.println(Year + " is Non-Leap Year");
		}
       Entry.close();
	}

}
