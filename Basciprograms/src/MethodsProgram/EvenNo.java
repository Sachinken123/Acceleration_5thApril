package MethodsProgram;

public class EvenNo {
	static void even(int num1 , int num2){
		for (int i = num1; i <= num2; i++) {
			if (i%2==0) {
				System.out.println("It is even number :"+i);
			}
			else {
				System.out.println("It is not even number :"+i);
			}
			
		}
		
	}

	public static void main(String[] args) {
		even(10, 30);
		

	}

}
