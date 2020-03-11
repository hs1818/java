package chap10;
import java.util.StringTokenizer;
public class TokenPrintTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "of the people, by the people, for the people";
		String token;
		
		StringTokenizer st = new StringTokenizer(s, ", ");
		
		//while(true)사용 시 무한루프로 동작해서 모든 문자열 출력 후 출력할거 없는데 st.nextToken()실행되서 오류
		while(true) {
			try {
				token =st.nextToken(); //다음 문자열을 출력
				System.out.println(token);
			}catch(Exception e) {
				break; //다 실행하고 나가려면 break
			}
			
			
		}
	}

}
