package compiler.IR;

import java.util.LinkedList;

public class NPIPv4Content extends IR{
	
	NPIPv4Fields fields;
	String sender, receiver;
	NPIPv4Proto protInfo;
	LinkedList<NPDump> dumps;
	
	public NPIPv4Content(NPIPv4Fields fields, String sender, String receiver, NPIPv4Proto npiPv4Proto,
			LinkedList<NPDump> dumps) {
		super();
		this.fields = fields;
		this.sender = sender;
		this.receiver = receiver;
		this.protInfo = npiPv4Proto;
		this.dumps = dumps;
	}

	public NPIPv4Fields getFields() {
		return fields;
	}

	public String getSender() {
		return sender;
	}

	public String getReceiver() {
		return receiver;
	}

	public NPIPv4Proto getProtInfo() {
		return protInfo;
	}

	public LinkedList<NPDump> getDumps() {
		return dumps;
	}
	
}
