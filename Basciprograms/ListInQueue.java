//Q.}write a java program to add list in queue ?
package Collection;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ListInQueue {

	public static void main(String[] args) {
		List<Integer> num = new LinkedList<>();
		num.add(2);
		num.add(1);
		num.add(3);
		num.add(4);
		num.add(5);
		
		System.out.println("Print the list values :"+num);
		
		Queue<Integer> que = new LinkedList<>(num);
		System.out.println("Print Queue :"+que);

	}

}
