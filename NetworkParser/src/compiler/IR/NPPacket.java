package compiler.IR;

public class NPPacket {
	
	NPMac sender, receiver;
	NPType type;
	NPIPv4Content ipContent; 
	String ethertype;
	int length;
	public NPPacket(NPMac sender, NPMac receiver, NPType type, NPIPv4Content ipContent, String ethertype, int length) {
		super();
		this.sender = sender;
		this.receiver = receiver;
		this.type = type;
		this.ipContent = ipContent;
		this.ethertype = ethertype;
		this.length = length;
	}
	public NPMac getSender() {
		return sender;
	}
	public NPMac getReceiver() {
		return receiver;
	}
	public NPType getType() {
		return type;
	}
	public NPIPv4Content getIpContent() {
		return ipContent;
	}
	public String getEthertype() {
		return ethertype;
	}
	public int getLength() {
		return length;
	}

}
