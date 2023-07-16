package stringClass;

public class Example1 {

	public static void main(String[] args) {
		String s = "CoreJava Learning mode on";
		System.out.println("String: "+s);
		//It will print specific character
		System.out.println("Print 3rd no char: "+s.charAt(2));
		System.out.println("Print 6th no char: "+s.charAt(5));
		//It will print the length of string
		System.out.println("Print length of String: "+s.length());
		//it will print all the string in sequence
		for (int i = 0; i < s.length(); i++) {
			System.out.println("character at no "+i+" is "+s.charAt(i));
			
		}
		// it will print from 4th char to end of string
		System.out.println("SubString from index:- "+s.substring(4));
		// it will print upto our desired condition
		System.out.println("SubString from 4 to 8 :"+s.substring(4, 8));
		
		//concate :- Combination of two String
		String s1 = "Ahmedpur";
		String s2 = "Latur" ;
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("Combination of sting: "+s1.concat(s2));
		
		//It will show indexof string
		System.out.println("Index of given word: "+s.indexOf("mode")); //18
		System.out.println("index of a: "+s.indexOf('a', 3));

	}

}
