package MethodsProgram;

public class PalindromeNo
{
	static boolean palNum(int num)
	{
		int reverse = 0 ;
		int temp = num ;
		while (temp != 0)
		{
			int rem = temp%10 ;
			reverse = (reverse * 10) + rem ;
			temp/=10 ;
	
		}
		return palNum ;
		
		if (temp == reverse ) {
			System.out.println("It is Palindrome");
			
		}
		
	}
	
	public static void main(String[] args) {
		boolean result = palNum(121);
		System.out.println(result);
	
	}

}
