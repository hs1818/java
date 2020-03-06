package chap06;

public class FinalMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WorldChess w =new WorldChess();
		w.getFirstPlayer();
	}

}

class Chess {
	enum ChessPlayer {
		WHITE, BLACK, BLUE, GREEN, RED
	}
	
	final ChessPlayer getFirstPlayer() {
		return ChessPlayer.WHITE;
	}
}

class WorldChess extends Chess {
//	ChessPlayer getFirstPlayer() {} //final이라 오버라이딩 안됨
}
