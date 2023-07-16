package importClass;
import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		int reverse = 0 ;
		
		for (int i = num; i != 0; i/=10) {
			
			int rem = i%10 ;
			reverse =(reverse*10)+rem;
			
		}
		System.out.println("Reverse number is: "+reverse);

	}

}
