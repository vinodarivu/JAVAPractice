package Ruff;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArrayNumberSorting {

	
	public static void main(String args[]) {
		List<Integer> ls = new ArrayList<Integer>();
		ls.add(4);
		ls.add(6);
		ls.add(1);
		ls.add(100);
		ls.add(400);
		ls.add(77);
		ls.add(66);
		ls.add(33);
		
		List<String> name = new ArrayList<>();
		name.add("vinod");
		name.add("aravindh");
		name.add("ganesh");
		name.add("suresh");
		name.add("deepak");
		name.add("sunil");
		name.add("agastya");
		
		StreamSort ss = new StreamSort();
		ss.setAge(30);
		ss.setName("Sunil");
		ss.setSchool("madhuravani");
		StreamSort ss1 = new StreamSort();
		ss1.setAge(32);
		ss1.setName("Vinodh");
		ss1.setSchool("madhuravani");
		
		StreamSort ss2 = new StreamSort();
		ss2.setAge(2);
		ss2.setName("Agastya");
		ss2.setSchool("Oxford");
		
		StreamSort ss3 = new StreamSort();
		ss3.setAge(1);
		ss3.setName("Suresh");
		ss3.setSchool("University");
		
		
		List<StreamSort> obj = new ArrayList<>();
		obj.add(ss);
		obj.add(ss1);
		obj.add(ss2);
		obj.add(ss3);
		
		 obj.stream()
         .sorted(Comparator.comparingInt(StreamSort::getAge))
         .forEach(System.out::println);
		
		 
		 obj.stream()
         .sorted(Comparator.comparing(StreamSort::getName))
         .forEach(System.out::println);
		
		
		
		
		
		
		ls.stream().sorted().forEach(System.out::println);
		name.stream().sorted().forEach(System.out::println);
		
		
	}
}

class StreamSort {
	
	String name;
	Integer age;
	String school;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	
	
}
