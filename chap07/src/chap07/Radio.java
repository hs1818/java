package chap07;

public class Radio extends Controller{
	String name ="Radio";
	
	public Radio(boolean power) {
		super(power);
	}
	
	public String getName() {
		return this.name;
	}
}
