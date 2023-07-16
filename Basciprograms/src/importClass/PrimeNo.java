package importClass;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int i ;
		
		for (i = 2; i < num; i++) {
			if (num%i==0) {
				break ;
				
			}
			
		}
		if (i==num) {
			System.out.println("It is Prime Number");
			
		}
		else {
			System.out.println("It is not Prime Number");
		}
		
	}

}
