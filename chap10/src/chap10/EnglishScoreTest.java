package chap10;
import java.util.Arrays;
public class EnglishScoreTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnglishScore[] ea = {new EnglishScore("김삿갓", 77), new EnglishScore("장영실", 88), 
				new EnglishScore("홍길동", 99)};
		System.out.println("영어 최고점수: " +findBest(ea).toString());
		}
	public static EnglishScore findBest(EnglishScore[]a) {
		EnglishScore best =a[0]; //데이터 초기화 하려고 넣음(의미없음)
		Arrays.sort(a);
		
		best = a[a.length-1];
		return best;
	}

}
