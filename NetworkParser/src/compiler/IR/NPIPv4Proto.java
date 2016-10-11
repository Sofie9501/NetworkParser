package compiler.IR;

public class NPIPv4Proto extends IR{
	
	String name;
	int length;
	public NPIPv4Proto(String name, int length) {
		super();
		this.name = name;
		this.length = length;
	}
	public String getName() {
		return name;
	}
	public int getLength() {
		return length;
	}
	
}
