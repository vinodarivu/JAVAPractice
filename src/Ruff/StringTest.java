package Ruff;

public class StringTest {
	static String name = "Vinod";
	String name1 = "Vinod";
	String name2 = "Vinod";
	String name3 = new String("Vinod");
	String name4 = new String("Vinod").intern();

	public static void main(String args[]) {
		StringTest s = new StringTest();
		System.out.println("static=>" + name + ",hshcode==>" + (name.hashCode()));
		System.out.println("non static=>" + s.name1 + ",hshcode==>" + (s.name1.hashCode()));
		System.out.println("non static name2=>" + s.name2 + ",hshcode==>" + (s.name2.hashCode()));
		System.out.println("non static name3 new String=>" + s.name3 + ",hshcode==>" + (s.name3.hashCode()));
		System.out.println("non static name4 new String INTERN=>" + s.name4 + ",hshcode==>" + (s.name4.hashCode()));
		System.out.println("===============================");
		System.out.println("name==s.name1==>" + (name == s.name1));
		System.out.println("name==s.name2==>" + (name == s.name2));
		System.out.println("name==s.name3==>" + (name == s.name3));
		System.out.println("name==s.name4==>" + (name == s.name4));

		System.out.println("s.name1==s.name2==>" + (s.name1 == s.name2));
		System.out.println("===============================");
		System.out.println("name.equals(s.name1)==>" + name.equals(s.name1));
		System.out.println("name.equals(s.name2)==>" + name.equals(s.name2));
		System.out.println("name.equals(s.name3)==>" + name.equals(s.name3));
		System.out.println("name.equals(s.name4)==>" + name.equals(s.name4));
		

	}

}
