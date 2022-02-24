package lambda;

import java.util.Arrays;
import java.util.List;

public class ForEachSample {
	public static void main(String[] args) {
		// Requirement: Loop through list of integers
		List<Integer> nums = Arrays.asList(1,2,3,4,5);
		
		// Very Old Java
		for(int i = 0; i < nums.size(); i++) {
			System.out.println(nums.get(i));
		}
		
		// Old Java
		for (int i : nums) {
			System.out.println(i);
		}
		
		// Java 8
		nums.forEach(num -> System.out.println(num));
		
	}
}
