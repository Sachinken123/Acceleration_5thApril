package Array;

public class ArrayExample1 {

	public static void main(String[] args) {
		int [] num = {10,20,30,40,50} ;
	
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
			
		}
		System.out.println("***************");
		
		String[] s1 = {"Sachin","Adinath","Dipak","Yuvraj"};
		System.out.println(s1[0]);
		System.out.println(s1[1]);
		System.out.println(s1[2]);
		System.out.println(s1[3]);
		 s1[1] = "Adiii" ;
		 System.out.println(s1[1]);
		 
		 System.out.println("**********************");
		 
		 for (int i = 0; i <  s1.length; i++) {
			 System.out.println(s1[i]);
			
		}
		 System.out.println("************************");
		 // for each loop
		 for (String s: s1) {
			 System.out.println(s);
			
		}
			   

	}

}
