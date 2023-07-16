package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueElement {

	public static void main(String[] args) {
		List<Integer> num = new ArrayList<Integer>();
		num.add(2);
		num.add(3);
		num.add(1);
		num.add(4);
		num.add(5);
		num.add(2);
		num.add(1);
		
		System.out.println(num);
		Set<Integer> ref = new HashSet<>(num);
		System.out.println(ref);
		

	}

}
