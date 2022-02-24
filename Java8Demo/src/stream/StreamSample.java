package stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSample {
	// Requirement: Get list of Senior Citizens and sort by age in ascending order
	public static void main(String[] args) {
		List<People> peopleList = new ArrayList<People>();
		peopleList.add(new People("Migs", 75));
		peopleList.add(new People("Arvie", 50));
		peopleList.add(new People("Jedid", 60));
		peopleList.add(new People("Vanna", 55));
		peopleList.add(new People("Gelo", 65));
		peopleList.add(new People("Jessica", 61));
		
		List<People> seniorList = getSeniorNamesByAgeSort(peopleList);
		for(People p : seniorList) {
			System.out.println(p.getName() + "=" + p.getAge());
		}
	}
	// Old Java
	private static List<People> getSeniorNamesByAgeSort(List<People> peopleList) {
		List<People> seniorPeopleList = new ArrayList<People>();
		for(People p : peopleList) {
			if (p.getAge() >= 60) {
				seniorPeopleList.add(p);
			}
		}
		Collections.sort(seniorPeopleList, new Comparator<People>() {

			@Override
			public int compare(People p1, People p2) {
				return Integer.compare(p1.getAge(), p2.getAge());
			}
			
		});
		return seniorPeopleList;
	}

}

class People {
	String name;
	int age;
	
	public People(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}