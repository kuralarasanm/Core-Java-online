package javaLearn;

class Students{
	String name;
	int age;
	static String teacher;
	void display(){
		System.out.println("name = "+name);
		System.out.println("age = "+age);
		System.out.println("teacher = "+teacher);
	}
	static {
		Students.teacher="nanthani";
	}
}
public class StaticKeyword {
	public static void main(String[] args) {
		Students s1=new Students();
		Students s2=new Students();
		s1.name="kural";
		s1.age=23;
//		s1.teacher="nanthani";//or
//		Students.teacher="nanthani";
		s2.name="kuralarasan";
		s2.age=23;
//		s2.teacher="karthi";
		s1.display();
		s2.display();
	}
}