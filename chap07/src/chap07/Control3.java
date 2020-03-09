package chap07;

//인터페이스 끼리 상속
public interface Control3 extends Control1, Control2{
	void ChannelUp();
	void ChannelDown();
}
