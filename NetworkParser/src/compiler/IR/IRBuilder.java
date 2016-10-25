package compiler.IR;

import java.util.LinkedList;

import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import compiler.Frontend.NetworkParserParser.DateContext;
import compiler.Frontend.NetworkParserParser.DayContext;
import compiler.Frontend.NetworkParserParser.DumplineContext;
import compiler.Frontend.NetworkParserParser.EntriesContext;
import compiler.Frontend.NetworkParserParser.EntryContext;
import compiler.Frontend.NetworkParserParser.FlagvaluesContext;
import compiler.Frontend.NetworkParserParser.FromContext;
import compiler.Frontend.NetworkParserParser.HourContext;
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
import compiler.Frontend.NetworkParserParser.MilisecondsContext;
import compiler.Frontend.NetworkParserParser.MinuteContext;
import compiler.Frontend.NetworkParserParser.MonthContext;
import compiler.Frontend.NetworkParserParser.PacketContext;
import compiler.Frontend.NetworkParserParser.ProtinfoContext;
import compiler.Frontend.NetworkParserParser.ProtnameContext;
import compiler.Frontend.NetworkParserParser.SecondsContext;
import compiler.Frontend.NetworkParserParser.TagContext;
import compiler.Frontend.NetworkParserParser.TimeContext;
import compiler.Frontend.NetworkParserParser.ToContext;
import compiler.Frontend.NetworkParserParser.TypeContext;
import compiler.Frontend.NetworkParserParser.YearContext;
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
		return new NPDate(Integer.parseInt(ctx.day().getText()), Integer.parseInt(ctx.month().getText()), Integer.parseInt(ctx.year().getText()));
	}

	public NPTime visitTime(TimeContext ctx) {
		return new NPTime(Integer.parseInt(ctx.hour().getText()), Integer.parseInt(ctx.minute().getText()), Integer.parseInt(ctx.seconds().getText()), Integer.parseInt(ctx.miliseconds().getText()));
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

		return new NPIPv4Content(visitIpv4fields(ctx.ipv4fields()), ctx.from().getText(), ctx.to().getText(), visitProtinfo(ctx.protinfo()), list);
	}

	public NPIPv4Fields visitIpv4fields(Ipv4fieldsContext ctx) {
		return new NPIPv4Fields(visitIpv4tos(ctx.ipv4tos()), visitIpv4ttl(ctx.ipv4ttl()), visitIpv4id(ctx.ipv4id()), visitIpv4offset(ctx.ipv4offset()), 
				visitIpv4flags(ctx.ipv4flags()), visitIpv4proto(ctx.ipv4proto()), Integer.parseInt(ctx.length().NUMBER().getText()));
	}

	public NPProtInfo visitProtinfo(ProtinfoContext ctx) {
		return new NPProtInfo(ctx.protname().getText(), Integer.parseInt(ctx.length().NUMBER().getText()));
	}

	public NPDump visitDumpline(DumplineContext ctx) {
		return new NPDump(ctx.getText());
	}

	public NPIpv4tos visitIpv4tos(Ipv4tosContext ctx) {
		return new NPIpv4tos(ctx.getText());
	}

	public NPIpv4ttl visitIpv4ttl(Ipv4ttlContext ctx) {
		return new NPIpv4ttl(ctx.getText());
	}

	public NPIpv4id visitIpv4id(Ipv4idContext ctx) {
		return new NPIpv4id(ctx.getText());
	}

	public NPIpv4offset visitIpv4offset(Ipv4offsetContext ctx) {
		return new NPIpv4offset(ctx.getText());
	}

	public NPIPv4Flags visitIpv4flags(Ipv4flagsContext ctx) {
		return new NPIPv4Flags(ctx.flagvalues().getText());
	}

	public NPFlagValues visitFlagvalues(FlagvaluesContext ctx) {
		return new NPFlagValues(ctx.getText());
	}

	public NPIPv4Proto visitIpv4proto(Ipv4protoContext ctx) {
		return new NPIPv4Proto(ctx.PROTO().getText(), visitProtname(ctx.protname()),Integer.parseInt(ctx.NUMBER().getText()));
	}

	public NPProtname visitProtname(ProtnameContext ctx) {
		return new NPProtname(ctx.getText());
	}
	
	public NPLength visitLength(LengthContext ctx) {
		return new NPLength(Integer.parseInt(ctx.NUMBER().getText()));
	}

	public NPIpv4 visitIpv4(Ipv4Context ctx) {
		return new NPIpv4(ctx.getText().substring(0, 3), visitTag(ctx.tag()));
	}

	public NPTag visitTag(TagContext ctx) {
		return new NPTag(ctx.getText());
	}

	@Override
	protected IR aggregateResult(IR aggregate, IR nextResult) {
		return super.aggregateResult(aggregate, nextResult);
	}

	@Override
	protected IR defaultResult() {
		return super.defaultResult();
	}

	@Override
	protected boolean shouldVisitNextChild(RuleNode node, IR currentResult) {
		return super.shouldVisitNextChild(node, currentResult);
	}

	@Override
	public IR visit(ParseTree tree) {
		return super.visit(tree);
	}

	@Override
	public IR visitChildren(RuleNode arg0) {
		return super.visitChildren(arg0);
	}

	@Override
	public IR visitErrorNode(ErrorNode node) {
		return super.visitErrorNode(node);
	}

	@Override
	public IR visitTerminal(TerminalNode node) {
		return super.visitTerminal(node);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public String toString() {
		return super.toString();
	}

	@Override
	public IR visitYear(YearContext ctx) {
		return null;
	}

	@Override
	public IR visitSeconds(SecondsContext ctx) {
		return null;
	}

	@Override
	public IR visitHour(HourContext ctx) {
		return null;
	}

	@Override
	public IR visitFrom(FromContext ctx) {
		return null;
	}

	@Override
	public IR visitDay(DayContext ctx) {
		return null;
	}

	@Override
	public IR visitMiliseconds(MilisecondsContext ctx) {
		return null;
	}

	@Override
	public IR visitMinute(MinuteContext ctx) {
		return null;
	}

	@Override
	public IR visitMonth(MonthContext ctx) {
		return null;
	}

	@Override
	public IR visitTo(ToContext ctx) {
		return null;
	}



}
