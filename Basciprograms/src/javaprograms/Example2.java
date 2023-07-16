package javaprograms;

public class Example2 {
	
	static int a = 20 ;
	int b = 30 ;

	public static void main(String[] args) {
		System.out.println("Program Starts");
		int a = 10 ;
		System.out.println("Local var: "+a);
		System.out.println("Static global var: "+Example2.a);
		Example2 ref = new Example2();
		System.out.println("Non-static global var: "+ref.b);
		ref.b = 100 ;
		System.out.println("Updated Non-static value: "+ref.b);
		System.out.println("Program Ends");
	

	}

}
