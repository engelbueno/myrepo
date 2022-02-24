package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortSample {

	public static void main(String[] args) {
		// Requirement: Sort list of cities by name in ascending order
		List<String> cities = new ArrayList<String>();
		cities.add("Manila");
		cities.add("Cebu");
		cities.add("Bacoor");
		
		SortSample sort = new SortSample();

		// Old Java
		sort.sortNormal(cities);		
		System.out.println(cities);
				
	}
	// Old Java
	private void sortNormal(List<String> cities) {
		Collections.sort(cities, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
	}
}
