package compiler.IR;

public class NPProtInfo extends IR{

	String name;
	int length;

	public NPProtInfo(String name, int length){
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
