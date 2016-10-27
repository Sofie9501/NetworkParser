package compiler.IR.support;

import compiler.Exceptions.VisitorException;
import compiler.IR.NPDate;
import compiler.IR.NPDump;
import compiler.IR.NPEntries;
import compiler.IR.NPEntry;
import compiler.IR.NPFlagValues;
import compiler.IR.NPIPv4Content;
import compiler.IR.NPIPv4Fields;
import compiler.IR.NPIPv4Flags;
import compiler.IR.NPIPv4Proto;
import compiler.IR.NPIpv4;
import compiler.IR.NPIpv4id;
import compiler.IR.NPIpv4offset;
import compiler.IR.NPIpv4tos;
import compiler.IR.NPIpv4ttl;
import compiler.IR.NPLength;
import compiler.IR.NPMac;
import compiler.IR.NPPacket;
import compiler.IR.NPProtInfo;
import compiler.IR.NPProtname;
import compiler.IR.NPTag;
import compiler.IR.NPTime;
import compiler.IR.NPType;

public abstract class IRElementVisitor<T> {
	
	public abstract T visitEntries(NPEntries e) throws VisitorException;
	public abstract T visitEntry(NPEntry e) throws VisitorException;
	public abstract T visitDate(NPDate e) throws VisitorException;
	public abstract T visitTime(NPTime e) throws VisitorException;
	public abstract T visitIpv4(NPIpv4 e) throws VisitorException;
	public abstract T visitPacket(NPPacket e) throws VisitorException;
	public abstract T visitMac(NPMac e) throws VisitorException;
	public abstract T visitType(NPType e) throws VisitorException;
	public abstract T visitIPv4Content(NPIPv4Content e) throws VisitorException;
	public abstract T visitIPv4Fields(NPIPv4Fields e) throws VisitorException;
	public abstract T visitProtInfo(NPProtInfo e) throws VisitorException;
	public abstract T visitDump(NPDump e) throws VisitorException;
	public abstract T visitIpv4tos(NPIpv4tos e) throws VisitorException;
	public abstract T visitIpv4ttl(NPIpv4ttl e) throws VisitorException;
	public abstract T visitIpv4id(NPIpv4id e) throws VisitorException;
	public abstract T visitIpv4offset(NPIpv4offset e) throws VisitorException;
	public abstract T visitIpv4flags(NPIPv4Flags e) throws VisitorException;
	public abstract T visitFlagValues(NPFlagValues e) throws VisitorException;
	public abstract T visitIpv4Proto(NPIPv4Proto e) throws VisitorException;
	public abstract T visitProtname(NPProtname e) throws VisitorException;
	public abstract T visitLength(NPLength e) throws VisitorException;
	public abstract T visitTag(NPTag e) throws VisitorException;
	
}
