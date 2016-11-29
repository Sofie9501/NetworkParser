package compiler;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

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

public class IPCounter extends IRElementVisitor<Integer> {
	
	private static class Analyser {
		private PrintStream ps;
		
		public Analyser() {
			this(System.out);
		}

		public Analyser(PrintStream out) {
			this.ps = out;
		}
		
		public void printLine(String s) {
			ps.println(s);
		}
	}
	
	public static Analyser analyser = new Analyser();
	public static Map<String, Integer> map = new HashMap<>();
	
	public static void print() {
		Iterator it = map.entrySet().iterator();
		
		while(it.hasNext()) {
			Map.Entry pair = (Map.Entry) it.next();
			analyser.printLine(pair.getKey() + ": " + pair.getValue());
		}
	}
	
	@Override
	public Integer visitEntries(NPEntries e) throws VisitorException {

		for (NPEntry c : e.getEntriesList()) {
			visitEntry(c);
		}
		return null;
	}

	@Override
	public Integer visitEntry(NPEntry e) throws VisitorException {
		visitPacket(e.getPacket());
		return null;
	}

	@Override
	public Integer visitDate(NPDate e) throws VisitorException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer visitTime(NPTime e) throws VisitorException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer visitIpv4(NPIpv4 e) throws VisitorException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer visitPacket(NPPacket e) throws VisitorException {
		visitIPv4Content(e.getIpContent());
		return null;
	}

	@Override
	public Integer visitMac(NPMac e) throws VisitorException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer visitType(NPType e) throws VisitorException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer visitIPv4Content(NPIPv4Content e) throws VisitorException {
		int index = e.getSender().lastIndexOf(".");
		String sender = e.getSender().substring(0, index);
		
		index = e.getReceiver().lastIndexOf(".");
		String receiver = e.getReceiver().substring(0, index);
		
		String key = sender + " -> " + receiver;
		
		if(map.get(key) == null) {
			map.put(key, 1);
		}
		else {
			map.put(key, map.get(key)+1);
		}
		
		return null;
	}

	@Override
	public Integer visitIPv4Fields(NPIPv4Fields e) throws VisitorException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer visitProtInfo(NPProtInfo e) throws VisitorException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer visitDump(NPDump e) throws VisitorException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer visitIpv4tos(NPIpv4tos e) throws VisitorException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer visitIpv4ttl(NPIpv4ttl e) throws VisitorException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer visitIpv4id(NPIpv4id e) throws VisitorException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer visitIpv4offset(NPIpv4offset e) throws VisitorException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer visitIpv4flags(NPIPv4Flags e) throws VisitorException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer visitFlagValues(NPFlagValues e) throws VisitorException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer visitIpv4Proto(NPIPv4Proto e) throws VisitorException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer visitProtname(NPProtname e) throws VisitorException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer visitLength(NPLength e) throws VisitorException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer visitTag(NPTag e) throws VisitorException {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static void print(IR ir) {
		try {
			new IPCounter().visitEntries(ir.getEntries());
			print();
			
		} catch (VisitorException e) {
			e.printStackTrace();
		}
	}

}
