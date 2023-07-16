//Q.3}Java program to check Palindrome number ?
package Whileloop;

public class PalindromNo {

	public static void main(String[] args) {
		int num = 141 ;
		int temp = num ;
		int reverse = 0 ;
		while (temp > 0) {
			
			int rem = temp % 10 ;
			reverse =(reverse * 10) + rem ;
			temp /= 10 ;
		}
		if (num == reverse) {
			System.out.println("It is palindrome number :"+reverse);
			
		}
		else
		{
			System.out.println("It is not a Palindrome number :"+reverse);
		}
	
	}

}
