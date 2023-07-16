package Array;

public class ArrayAverage {

	public static void main(String[] args) {
		int[] num = {1,2,-4,4,5,-3,25,-6};
		double sum = 0;
		double average ;
		for (int i = 0; i < num.length; i++) {
			sum = sum + i ;
		}
		int arraylength = num.length;
		 average = sum/arraylength ;
		System.out.println(sum);
		System.out.println(average);
	}

}
