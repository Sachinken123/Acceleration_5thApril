//Q.4}Write a java program to check Leap Year ?
package Ifelse;

public class LeapYear {

	public static void main(String[] args) {
		int year = 2004 ;
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
		{
			System.out.println("It is a Leap Year :"+year);
			
		} 
		else 
		{
			System.out.println("It is not a Leap Year :"+year);

		}
	 

	}

}
