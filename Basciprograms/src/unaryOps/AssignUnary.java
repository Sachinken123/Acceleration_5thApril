package unaryOps;

public class AssignUnary {

	public static void main(String[] args) {
		int a = 0 , b ;
		b = a++ + ++a + ++a + a ;
     // a = 0   +  2  +  3  + 3
	 // a = 1      2     3    3
		System.out.println(a); // 3
		System.out.println(b); // 8
		System.out.println("***********************");
		
		 a = 0 ;
		 b = a-- + --a + --a + a ;
	  // a = 0   + -2  + -3  + -3
	  // a = -1    -2    -3    -3
		 System.out.println(a);
		 System.out.println(b);
		 System.out.println("**********************");
		 
		 a = 0 ;
		 b = --a + --a + --a + a  + ++a + a++ ;
	  // a = -1  + -2  + -3  + -3 + -2  + -2
	  // a = -1    -2    -3    -3   -2    -1
		 System.out.println(a);
		 System.out.println(b);
		 System.out.println("***********************");
		 
		 a = 0 ;
		 b = a-- + a  + ++a + a++ + ++a + a++ + a ;
	  // a = 0   + -1 + 0   + 0   + 2   + 2   + 3
	  // b = -1    -1   0     1     2     3     3
		 System.out.println(a);
		 System.out.println(b);		 
				 
		
	}

}
