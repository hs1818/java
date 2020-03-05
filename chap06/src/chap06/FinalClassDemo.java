package chap06;

public class FinalClassDemo {
	public static void main(String[] args) {
		Best b =new Best();
	}
}

class Good{
	
}

class Better extends Good {
	
}
final class Best extends Better { //final = 상속안됨
	
}

/*Best클래스는 final키워드를 사용하여 상속을 할 수 없도록 막았기 때문에 오류
class NumberOne extends Best {
	
} */
