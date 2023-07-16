// Q.2} Reverse a number using a while loop in java ?
package Whileloop;

public class ReverseNo {

	public static void main(String[] args) {
		int num = 12345 ;
		int reverse = 0 ;
		while (num > 0) {
			int rem = num%10 ;
			reverse = (reverse * 10) + rem ;
			num /= 10 ;
		}
		System.out.println(reverse);

	}

}
