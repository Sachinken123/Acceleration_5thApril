package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListInSet {

	public static void main(String[] args) {
		List<String> string = new ArrayList<String>();
		string.add("Java");
		string.add("Manual");
		string.add("Selenium");
		string.add("Java");
		string.add("C++");
		string.add("Python");
		string.add("C++");
		string.add("Ruby");
		
		System.out.println("List elements are :"+string);
		
		Set<String> elements = new HashSet<String>(string);
		System.out.println("Set elements are :"+elements);
		
	}

}
