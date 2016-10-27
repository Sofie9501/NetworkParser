package compiler;

import java.io.PrintStream;
import compiler.Exceptions.VisitorException;
import compiler.IR.IR;
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
import compiler.IR.support.IRElementVisitor;

public class PrettyPrint extends IRElementVisitor<Integer>{



	private class PrettyPrinter {

		private PrintStream ps;
		private int indent=0;
		private int width=2;
		private boolean isindented = false;

		public PrettyPrinter() {
			this(System.out);
		}

		public PrettyPrinter(PrintStream ps) {
			this.ps = ps;
		}

		public void in() {
			indent+=width;
		}

		public void out() {
			indent-=width;
			if (indent<0) {
				indent=0;
			}
		}

		private void indent() {
			if (isindented) return;
			for (int i=0;i<this.indent;i++) ps.print(' ');
			isindented=true;
		}

		public void println(String s) {
			this.indent();
			ps.println(s);
			isindented=false;
		}

		public void print(String s) {
			this.indent();
			ps.print(s);
		}
	}


	private PrettyPrinter pp = new PrettyPrinter();

	@Override
	public Integer visitEntries(NPEntries e) throws VisitorException {

		for (NPEntry c : e.getEntriesList()) {
			visitEntry(c);
		}
		return null;
	}



	@Override
	public Integer visitEntry(NPEntry e) throws VisitorException {
		pp.print("Entry ");
		pp.println(" {");
		pp.in();
		visitDate(e.getDate());
		visitTime(e.getTime());
		visitPacket(e.getPacket());
		pp.out();
		pp.println("}");
		return null;
	}

	@Override
	public Integer visitDate(NPDate e) throws VisitorException {
		pp.print("Date ");
		pp.println(" {");
		pp.println(" Day: " + String.valueOf(e.getDay()));
		pp.println(" Month: " + String.valueOf(e.getMonth()));
		pp.println(" Year: " + String.valueOf(e.getYear()));
		pp.println(" }");
		return null;
	}

	@Override
	public Integer visitTime(NPTime e) throws VisitorException {
		pp.print("Time ");
		pp.println(" {");
		pp.println(" Hour: " + String.valueOf(e.getHour()));
		pp.println(" Miute: " + String.valueOf(e.getMinute()));
		pp.println(" Seconds: " + String.valueOf(e.getSecond()));
		pp.println(" Milliseconds: " + String.valueOf(e.getMilisecond()));
		pp.println(" }");
		return null;
	}

	@Override
	public Integer visitPacket(NPPacket e) throws VisitorException {
		pp.print(" Packet ");
		pp.println(" {");
		pp.in();
		visitMac(e.getSender());
		pp.print(" > ");
		visitMac(e.getReceiver());
		visitType(e.getType());
		visitLength(e.getLength());
		visitIPv4Content(e.getIpContent());
		pp.println(" }");
		return null;
	}

	@Override
	public Integer visitMac(NPMac e) throws VisitorException {
		pp.print(" MAC: ");
		pp.println(" {");
		pp.println(e.getAddress());
		pp.println(" }");
		return null;
	}

	@Override
	public Integer visitType(NPType e) throws VisitorException {
		pp.print(" Type: ");
		pp.println(" {");
		pp.println(e.getType());
		pp.println(" }");
		return null;
	}

	@Override
	public Integer visitIPv4Content(NPIPv4Content e) throws VisitorException {
		pp.print(" IPv4Content: ");
		pp.println(" {");
		pp.in();
		visitIPv4Fields(e.getFields());
		pp.println(e.getSender());
		pp.print(" > ");
		pp.println(e.getReceiver());
		visitProtInfo(e.getProtInfo());
		for (NPDump c : e.getDumps()) {
			visitDump(c);
		}
		pp.println(" }");
		return null;
	}

	@Override
	public Integer visitIPv4Fields(NPIPv4Fields e) throws VisitorException {
		pp.print(" IPv4 Fields: ");
		pp.println(" {");
		pp.in();
		visitIpv4tos(e.getTos());
		visitIpv4ttl(e.getTtl());
		visitIpv4id(e.getId());
		visitIpv4offset(e.getOffset());
		visitIpv4flags(e.getFlags());
		visitIpv4Proto(e.getProto());
		visitLength(e.getLength());
		pp.println(" }");
		return null;
	}

	@Override
	public Integer visitProtInfo(NPProtInfo e) throws VisitorException {
		pp.print(" ProtInfo: ");
		pp.println(" {");
		pp.println(e.getName());
		pp.println(String.valueOf(e.getLength()));
		pp.println(" }");
		return null;
	}

	@Override
	public Integer visitDump(NPDump e) throws VisitorException {
		pp.print(" Dumplines: ");
		pp.println(" {");
		pp.println(e.getData());
		pp.println(" }");
		return null;
	}

	@Override
	public Integer visitIpv4tos(NPIpv4tos e) throws VisitorException {
		pp.print(" Tos: ");
		pp.println(" {");
		pp.print(e.getTos());
		pp.println(" }");
		return null;
	}

	@Override
	public Integer visitIpv4ttl(NPIpv4ttl e) throws VisitorException {
		pp.print(" Ttl: ");
		pp.println(" {");
		pp.print(e.getTtl());
		pp.println(" }");
		return null;
	}

	@Override
	public Integer visitIpv4id(NPIpv4id e) throws VisitorException {
		pp.print(" Id: ");
		pp.println(" {");
		pp.print(e.getId());
		pp.println(" }");
		return null;
	}

	@Override
	public Integer visitIpv4offset(NPIpv4offset e) throws VisitorException {
		pp.print(" Offset: ");
		pp.println(" {");
		pp.print(e.getOffset());
		pp.println(" }");
		return null;
	}

	@Override
	public Integer visitIpv4flags(NPIPv4Flags e) throws VisitorException {
		pp.print("IPv4 Flags: ");
		pp.println(" {");
		visitFlagValues(e.getValues());
		pp.println(" }");
		return null;
	}

	@Override
	public Integer visitFlagValues(NPFlagValues e) throws VisitorException {
		pp.print(" Flag Values: ");
		pp.println(" {");
		pp.print(e.getFlag());
		pp.println(" }");
		return null;
	}

	@Override
	public Integer visitIpv4Proto(NPIPv4Proto e) throws VisitorException {
		pp.print(" IPv4 Proto: ");
		pp.println(" {");
		pp.print(e.getProto());
		visitProtname(e.getProt());
		pp.print(String.valueOf(e.getNumber()));
		pp.println(" }");
		return null;
	}

	@Override
	public Integer visitProtname(NPProtname e) throws VisitorException {
		pp.print(" Pront Name: ");
		pp.println(" {");
		pp.print(e.getName());
		pp.println(" }");
		return null;
	}

	@Override
	public Integer visitLength(NPLength e) throws VisitorException {
		pp.print("Length: ");
		pp.println(" {");
		pp.print(String.valueOf(e.getNumber()));
		pp.println(" }");
		return null;
	}

	@Override
	public Integer visitTag(NPTag e) throws VisitorException {
		pp.print(" Tag: ");
		pp.println(" {");
		pp.print(e.getNumber());
		pp.println(" }");
		return null;
	}

	@Override
	public Integer visitIpv4(NPIpv4 e) throws VisitorException {
		pp.print(" IPv4: ");
		pp.println(" {");
		pp.print(e.getIpv());
		visitTag(e.getTag());
		pp.println(" }");
		return null;
	}




	public static void print(IR ir){
		try {
			new PrettyPrint().visitEntries(ir.getEntries());
		} catch (VisitorException e) {
			
			e.printStackTrace();
		}
	}

}
