package chap10;

public class EnglishScore implements Comparable<EnglishScore> {
	String name;
	int score;
	
	public EnglishScore(String name, int score) {
		this.name = name;
		this.score = score;
	}
	public String toString() {
		String str = name+ " " +score;
		return str;
	}
	
	public int compareTo(EnglishScore e) { 
//		EnglishScore es = (EnglishScore)e; //englishscore로 접근해서 안써도됨
		int result =0;
		
		if(score >e.score) {
			result =1;
		}
		else if(score ==e.score) {
			result =0;
		}
		else {
			result =-1;
		}
		return result;
	}
}
