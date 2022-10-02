package day1;
import java.util.*;
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner d=new Scanner(System.in);
System.out.println("Enter year:");
int year=d.nextInt();
if(year%4==0&&year%100!=0||year%400==0) {
	System.out.println("Year is Leap Year");
}
else {
	System.out.println("Year is not Leap Year");
}
	}

}
