package practice;

import java.util.HashSet;
import java.util.Set;

public class UniqueElements {

	public static void main(String[] args) {
		Set<Integer> Num  = new HashSet<Integer>();
		Num.add(1);
		Num.add(1);
		Num.add(2);
		Num.add(3);
		Num.add(4);
		Num.add(5);
		Num.add(3);
		Num.add(6);
		System.out.println("Set print unique element :"+Num);
		

	}

}
