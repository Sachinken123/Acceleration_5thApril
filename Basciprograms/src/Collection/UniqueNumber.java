// Q.}Write a java program to get the unique elements only from the list 
package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueNumber {

	public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);
        numbers.add(4);
        numbers.add(1);

        List<Integer> uniqueElements = getUniqueElements(numbers);
        System.out.println("Unique Elements: " + uniqueElements);
    }

    public static List<Integer> getUniqueElements(List<Integer> list) {
        Set<Integer> uniqueSet = new HashSet<>(list);
        return new ArrayList<>(uniqueSet);
    }



}
