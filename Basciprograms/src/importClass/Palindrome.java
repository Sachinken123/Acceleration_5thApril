package importClass;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Palindrome number: ");
		int num = sc.nextInt();
		int temp = num ;
		
		int reverse = 0 ;
		
		while (temp>0) {
			int rem = temp%10 ;
			reverse = (reverse*10)+rem;
			temp/=10;	
		}
		if (num==reverse) {
			System.out.println("It is palindrome Number !");	
		}
		else {
			System.out.println("It is not a Palindrome Number !");
		}

	}

}
