package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapSample {

	public static void main(String[] args) {
		// Requirement: Create single list from nested list of strings
	    List<List<String>> namesNested = Arrays.asList( 
	  	      Arrays.asList("A1", "A2"), 
	  	      Arrays.asList("B1", "B2"), 
	  	      Arrays.asList("C1", "C2"));
	    
  	    System.out.println(namesNested);

  	    // Old Java
	    List<String> namesList = new ArrayList<String>();
	    for (List<String> outerList : namesNested) {
	    	for (String innerList : outerList) {
		    	namesList.add(innerList);
	    	}
	    }
	    System.out.println(namesList);

	    // Java 8
  	    List<String> namesFlatStream = namesNested.stream()
  	      .flatMap(Collection::stream)
  	      .collect(Collectors.toList());
	  	    
  	    System.out.println(namesFlatStream);
	}

}
