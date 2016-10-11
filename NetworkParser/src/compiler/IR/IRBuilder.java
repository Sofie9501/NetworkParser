package compiler.IR;

import java.util.Iterator;
import java.util.LinkedList;

import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import compiler.Frontend.NetworkParserBaseVisitor;
import compiler.Frontend.NetworkParserParser.DateContext;
import compiler.Frontend.NetworkParserParser.DumplineContext;
import compiler.Frontend.NetworkParserParser.EntriesContext;
import compiler.Frontend.NetworkParserParser.EntryContext;
import compiler.Frontend.NetworkParserParser.FlagvaluesContext;
import compiler.Frontend.NetworkParserParser.Ipv4Context;
import compiler.Frontend.NetworkParserParser.Ipv4contentContext;
import compiler.Frontend.NetworkParserParser.Ipv4fieldsContext;
import compiler.Frontend.NetworkParserParser.Ipv4flagsContext;
import compiler.Frontend.NetworkParserParser.Ipv4idContext;
import compiler.Frontend.NetworkParserParser.Ipv4offsetContext;
import compiler.Frontend.NetworkParserParser.Ipv4protoContext;
import compiler.Frontend.NetworkParserParser.Ipv4tosContext;
import compiler.Frontend.NetworkParserParser.Ipv4ttlContext;
import compiler.Frontend.NetworkParserParser.LengthContext;
import compiler.Frontend.NetworkParserParser.MacContext;
import compiler.Frontend.NetworkParserParser.PacketContext;
import compiler.Frontend.NetworkParserParser.ProtinfoContext;
import compiler.Frontend.NetworkParserParser.ProtnameContext;
import compiler.Frontend.NetworkParserParser.TagContext;
import compiler.Frontend.NetworkParserParser.TimeContext;
import compiler.Frontend.NetworkParserParser.TypeContext;
import compiler.Frontend.NetworkParserVisitor;

public class IRBuilder extends AbstractParseTreeVisitor<IR> implements NetworkParserVisitor<IR> {


	public NPEntries visitEntries(EntriesContext ctx) {
		LinkedList<NPEntry> list = new LinkedList<NPEntry>();
		
		for (EntryContext entryCtx : ctx.entry()) {
			list.add(visitEntry(entryCtx));
		}
		
		return new NPEntries(list);
	}

	public NPEntry visitEntry(EntryContext ctx) {
		return new NPEntry(visitDate(ctx.date()),visitTime(ctx.time()), visitPacket(ctx.packet()));
	}

	
	public NPDate visitDate(DateContext ctx) {
		return new NPDate(Integer.parseInt(ctx.day.getText()), Integer.parseInt(ctx.month.getText()), Integer.parseInt(ctx.year.getText()));
	}
	
	public NPTime visitTime(TimeContext ctx) {
		return new NPTime(Integer.parseInt(ctx.hour.getText()), Integer.parseInt(ctx.minute.getText()), Integer.parseInt(ctx.seconds.getText()), Integer.parseInt(ctx.miliseconds.getText()));
	}

	public NPPacket visitPacket(PacketContext ctx) {
		return new NPPacket(visitMac(ctx.mac(0)), visitMac(ctx.mac(1)), visitType(ctx.type()), visitIpv4content(ctx.ipv4content()), Integer.parseInt(ctx.length().NUMBER().getText()));
	}

	public NPMac visitMac(MacContext ctx) {
		return new NPMac(ctx.getText());
	}

	public NPType visitType(TypeContext ctx) {
		return new NPType(ctx.getText());
	}

	public NPIPv4Content visitIpv4content(Ipv4contentContext ctx) {
		LinkedList<NPDump> list = new LinkedList<NPDump>();
		
		for (DumplineContext dumpCtx : ctx.dumpline()) {
			list.add(visitDumpline(dumpCtx));
		}
		
		return new NPIPv4Content(visitIpv4fields(ctx.fields), ctx.from.getText(), ctx.to.getText(), visitProtinfo(ctx.prot), list);
	}

	public NPIPv4Fields visitIpv4fields(Ipv4fieldsContext ctx) {
		return new NPIPv4Fields(ctx.tos.getText(), ctx.ttl.getText(), ctx.id.getText(), ctx.offset.getText(), visitIpv4flags(ctx.flags), visitIpv4proto(ctx.proto), Integer.parseInt(ctx.length().NUMBER().getText()));
	}

	public NPIPv4Proto visitProtinfo(ProtinfoContext ctx) {
		return new NPIPv4Proto(ctx.protname().getText(), Integer.parseInt(ctx.length().NUMBER().getText()));
	}

	public NPDump visitDumpline(DumplineContext ctx) {
		return new NPDump(ctx.getText());
	}

	public IR visitIpv4tos(Ipv4tosContext ctx) {
		return null;
	}

	public IR visitIpv4ttl(Ipv4ttlContext ctx) {
		return null;
	}

	public IR visitLength(LengthContext ctx) {
		return null;
	}

	public IR visitIpv4id(Ipv4idContext ctx) {
		return null;
	}

	public IR visitIpv4offset(Ipv4offsetContext ctx) {
		return null;
	}
	
	public NPIPv4Flags visitIpv4flags(Ipv4flagsContext ctx) {
		return new NPIPv4Flags(ctx.flagvalues().getText());
	}

	@Override
	public IR visitIpv4proto(Ipv4protoContext ctx) {
		// TODO Auto-generated method stub
		return super.visitIpv4proto(ctx);
	}

	@Override
	public IR visitIpv4(Ipv4Context ctx) {
		// TODO Auto-generated method stub
		return super.visitIpv4(ctx);
	}

	@Override
	public IR visitFlagvalues(FlagvaluesContext ctx) {
		// TODO Auto-generated method stub
		return super.visitFlagvalues(ctx);
	}

	@Override
	public IR visitProtname(ProtnameContext ctx) {
		// TODO Auto-generated method stub
		return super.visitProtname(ctx);
	}

	@Override
	public IR visitTag(TagContext ctx) {
		// TODO Auto-generated method stub
		return super.visitTag(ctx);
	}

	@Override
	protected IR aggregateResult(IR aggregate, IR nextResult) {
		// TODO Auto-generated method stub
		return super.aggregateResult(aggregate, nextResult);
	}

	@Override
	protected IR defaultResult() {
		// TODO Auto-generated method stub
		return super.defaultResult();
	}

	@Override
	protected boolean shouldVisitNextChild(RuleNode node, IR currentResult) {
		// TODO Auto-generated method stub
		return super.shouldVisitNextChild(node, currentResult);
	}

	@Override
	public IR visit(ParseTree tree) {
		// TODO Auto-generated method stub
		return super.visit(tree);
	}

	@Override
	public IR visitChildren(RuleNode arg0) {
		// TODO Auto-generated method stub
		return super.visitChildren(arg0);
	}

	@Override
	public IR visitErrorNode(ErrorNode node) {
		// TODO Auto-generated method stub
		return super.visitErrorNode(node);
	}

	@Override
	public IR visitTerminal(TerminalNode node) {
		// TODO Auto-generated method stub
		return super.visitTerminal(node);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}



}
