package chap11;

public class Person {
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name =name;
		this.age = age;
	}
	
	public int hashCode() {
		return name.hashCode() +age;
	}
	
	public boolean equals(Object obj) {
		boolean result =false;
		
		if(obj instanceof Person) {
			Person p = (Person) obj;
			if(name.equals(p.name) && age ==p.age) {
				result =true;
			}
		}
		return result;
	}
	
	public String toString() {
		return "Person["+name+", "+ age + "]";
	}
}
