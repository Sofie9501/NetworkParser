package compiler.IR;

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
		return new NPEntry(visitDate(ctx.date())/*,visitTime(ctx.time()), visitPacket(ctx.packet())*/);
	}

	
	public NPDate visitDate(DateContext ctx) {
		return new NPDate(Integer.parseInt(ctx.NUMBER().get(0).getText()), Integer.parseInt(ctx.NUMBER().get(1).getText()), Integer.parseInt(ctx.NUMBER().get(2).getText()));
	}
	
	
	
	@Override
	public IR visitIpv4ttl(Ipv4ttlContext ctx) {
		// TODO Auto-generated method stub
		return super.visitIpv4ttl(ctx);
	}

	@Override
	public IR visitIpv4flags(Ipv4flagsContext ctx) {
		// TODO Auto-generated method stub
		return super.visitIpv4flags(ctx);
	}

	@Override
	public IR visitDumpline(DumplineContext ctx) {
		// TODO Auto-generated method stub
		return super.visitDumpline(ctx);
	}

	@Override
	public IR visitLength(LengthContext ctx) {
		// TODO Auto-generated method stub
		return super.visitLength(ctx);
	}

	@Override
	public IR visitPacket(PacketContext ctx) {
		// TODO Auto-generated method stub
		return super.visitPacket(ctx);
	}

	@Override
	public IR visitType(TypeContext ctx) {
		// TODO Auto-generated method stub
		return super.visitType(ctx);
	}

	@Override
	public IR visitIpv4id(Ipv4idContext ctx) {
		// TODO Auto-generated method stub
		return super.visitIpv4id(ctx);
	}

	@Override
	public IR visitMac(MacContext ctx) {
		// TODO Auto-generated method stub
		return super.visitMac(ctx);
	}

	@Override
	public IR visitIpv4offset(Ipv4offsetContext ctx) {
		// TODO Auto-generated method stub
		return super.visitIpv4offset(ctx);
	}

	@Override
	public IR visitProtinfo(ProtinfoContext ctx) {
		// TODO Auto-generated method stub
		return super.visitProtinfo(ctx);
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
	public IR visitIpv4tos(Ipv4tosContext ctx) {
		// TODO Auto-generated method stub
		return super.visitIpv4tos(ctx);
	}

	@Override
	public IR visitProtname(ProtnameContext ctx) {
		// TODO Auto-generated method stub
		return super.visitProtname(ctx);
	}

	@Override
	public IR visitIpv4content(Ipv4contentContext ctx) {
		// TODO Auto-generated method stub
		return super.visitIpv4content(ctx);
	}

	@Override
	public IR visitIpv4fields(Ipv4fieldsContext ctx) {
		// TODO Auto-generated method stub
		return super.visitIpv4fields(ctx);
	}

	@Override
	public IR visitTime(TimeContext ctx) {
		// TODO Auto-generated method stub
		return super.visitTime(ctx);
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
