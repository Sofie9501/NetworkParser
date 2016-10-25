package compiler.IR;

public class NPIPv4Proto extends IR{
	
	String proto;
	NPProtname prot;
	int number;
	
	public NPIPv4Proto(String proto, NPProtname prot, int number) {
		this.proto = proto;
		this.prot = prot;
		this.number = number;
	}
	
	public String getProto() {
		return proto;
	}
	
	public NPProtname getProt() {
		return prot;
	}
	
	public int getNumber() {
		return number;
	}
	
	
		
	
}
