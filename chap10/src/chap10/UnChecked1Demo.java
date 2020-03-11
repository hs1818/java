package chap10;
import java.util.StringTokenizer;
public class UnChecked1Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Time is Money";
		StringTokenizer  st = new StringTokenizer(s);
		
		while(st.hasMoreTokens( )) {
			System.out.print(st.nextToken()+ "+");
		}
		System.out.println(st.nextToken());
	}

}
