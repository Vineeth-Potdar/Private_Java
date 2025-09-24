package oops;

public class Encap {
	public static void main(String[] args) {
		Student s = new Student();
		s.setName("Vineeth");
		s.setId(69);
		s.setAge(20);
		
		System.out.println("Name : "+s.getName());
		System.out.println("ID : "+s.getId());
		System.out.println("Age : "+s.getAge());
	}
}
   