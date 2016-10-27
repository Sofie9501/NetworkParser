package compiler.IR;

public class NPPacket extends IR{
	
	NPMac sender, receiver;
	NPType type;
	NPIPv4Content ipContent; 
	NPLength length;

	public NPPacket(NPMac sender, NPMac receiver, NPType type, NPIPv4Content ipContent, NPLength length) {
		super();
		this.sender = sender;
		this.receiver = receiver;
		this.type = type;
		this.ipContent = ipContent;
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

	public NPLength getLength() {
		return length;
	}

}
