package chap11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Question22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Person> set = new HashSet<Person>();
		set.add(new Person("김열공", 20));
		set.add(new Person("최고봉", 56));
		set.add(new Person("우등생", 16));
		set.add(new Person("나자바", 35));
		
		for(Person p :set) {
			System.out.println(p.name + ":" +p.age);
		}
		
		Iterator<Person> iterator = set.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
	}
	

}
