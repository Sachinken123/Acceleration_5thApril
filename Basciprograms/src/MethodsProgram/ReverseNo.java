package MethodsProgram;

public class ReverseNo {
	public static int reverse(int num) {
		int reverse = 0 ;
		while (num>0) {
		
			int rem = num % 10 ;
			reverse =(reverse * 10) + rem ;
			num /= 10 ;
			
		}
		return reverse ;
	}
	
	public static void main(String[] args) {
		int result = reverse(1234);
		System.out.println("Reverse of number is :"+result);
		
		//System.out.println(reverse(12345));
	
		
	}

}
