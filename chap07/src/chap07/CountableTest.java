package chap07;

public class CountableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Countable[] m = {new Bird("뻐꾸기"), new Bird("독수리"), //부모인터페이스 m
				new Tree("사과나무"), new Tree("밤나무") };
		
		for(Countable e :m) {
			e.count();
		}
		
		for(int i =0; i<m.length; i++) {
			if(m[i] instanceof Bird) {
				Bird b = (Bird)m[i]; //강제형변
				b.fly();
			}
			else {
				Tree b = (Tree)m[i];
				b.ripen();
			}
			
		}
		
		
		}
	}


