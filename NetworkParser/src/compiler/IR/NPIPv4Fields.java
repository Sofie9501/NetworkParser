package compiler.IR;

public class NPIPv4Fields extends IR{
	
	NPIPv4Flags flags;
	NPIPv4Proto proto;
	NPIpv4tos tos; 
	NPIpv4ttl ttl; 
	NPIpv4id id; 
	NPIpv4offset offset;
	NPLength length;
	

	public NPIPv4Fields(NPIpv4tos tos, NPIpv4ttl ttl, NPIpv4id id, NPIpv4offset offset, NPIPv4Flags flags, NPIPv4Proto proto, NPLength length) {
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

	public NPIpv4tos getTos() {
		return tos;
	}

	public NPIpv4ttl getTtl() {
		return ttl;
	}

	public NPIpv4id getId() {
		return id;
	}

	public NPIpv4offset getOffset() {
		return offset;
	}

	public NPLength getLength() {
		return length;
	}



}
