//Q.5} Swap two numbers using temporary variable ?
package javaprograms;

public class SwapNo {

	public static void main(String[] args) {
		int a = 10 , b = 30 , temp  ;
		
		System.out.println("Before swaping :"+a+ " & "+b);
		
		temp = a ;
		a = b ;
		b = temp ;
		
		System.out.println("After Swaping :"+a+ " & "+b);
		
		

	}

}
