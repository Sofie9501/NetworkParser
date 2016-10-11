package compiler.IR;

public class NPIPv4Fields extends IR{
	
	NPIPv4Flags flags;
	NPIPv4Proto proto;
	String tos, ttl, id, offset;
	int length;
	
	public NPIPv4Fields(String tos, String ttl, String id, String offset, NPIPv4Flags flags, NPIPv4Proto proto, 
			int length) {
		super();
		this.flags = flags;
		this.proto = proto;
		this.tos = tos;
		this.ttl = ttl;
		this.id = id;
		this.offset = offset;
		this.length = length;
	}

	public NPIPv4Flags getFlags() {
		return flags;
	}

	public NPIPv4Proto getProto() {
		return proto;
	}

	public String getTos() {
		return tos;
	}

	public String getTtl() {
		return ttl;
	}

	public String getId() {
		return id;
	}

	public String getOffset() {
		return offset;
	}

	public int getLength() {
		return length;
	}

}
