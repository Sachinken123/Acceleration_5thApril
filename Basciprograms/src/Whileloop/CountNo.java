//Q.1}Count number of digit in an integer using while loop ?

package Whileloop;

public class CountNo {
	
	public static void main(String[] args) {
		int num = 12345 ;
		int count = 0 ;
		while (num > 0) {
			num/=10 ;
		 count++ ;
	
		}
		System.out.println(count);

	}

}
