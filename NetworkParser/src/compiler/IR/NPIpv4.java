package compiler.IR;

public class NPIpv4 extends IR{

	String ipv;
	NPTag tag;

	public NPIpv4(String ipv, NPTag tag) {
		this.ipv = ipv;
		this.tag = tag;
	}
	
	public String getIpv() {
		return ipv;
	}
	
	public NPTag getTag() {
		return tag;
	}
	
	
	
}
