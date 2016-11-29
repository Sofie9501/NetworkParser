// Generated from C:\Users\casdan\Downloads\NetworkParser.g4 by ANTLR 4.1
package compiler.Frontend;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link NetworkParserParser}.
 */
public interface NetworkParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link NetworkParserParser#date}.
	 * @param ctx the parse tree
	 */
	void enterDate(@NotNull NetworkParserParser.DateContext ctx);
	/**
	 * Exit a parse tree produced by {@link NetworkParserParser#date}.
	 * @param ctx the parse tree
	 */
	void exitDate(@NotNull NetworkParserParser.DateContext ctx);

	/**
	 * Enter a parse tree produced by {@link NetworkParserParser#ipv4ttl}.
	 * @param ctx the parse tree
	 */
	void enterIpv4ttl(@NotNull NetworkParserParser.Ipv4ttlContext ctx);
	/**
	 * Exit a parse tree produced by {@link NetworkParserParser#ipv4ttl}.
	 * @param ctx the parse tree
	 */
	void exitIpv4ttl(@NotNull NetworkParserParser.Ipv4ttlContext ctx);

	/**
	 * Enter a parse tree produced by {@link NetworkParserParser#ipv4flags}.
	 * @param ctx the parse tree
	 */
	void enterIpv4flags(@NotNull NetworkParserParser.Ipv4flagsContext ctx);
	/**
	 * Exit a parse tree produced by {@link NetworkParserParser#ipv4flags}.
	 * @param ctx the parse tree
	 */
	void exitIpv4flags(@NotNull NetworkParserParser.Ipv4flagsContext ctx);

	/**
	 * Enter a parse tree produced by {@link NetworkParserParser#year}.
	 * @param ctx the parse tree
	 */
	void enterYear(@NotNull NetworkParserParser.YearContext ctx);
	/**
	 * Exit a parse tree produced by {@link NetworkParserParser#year}.
	 * @param ctx the parse tree
	 */
	void exitYear(@NotNull NetworkParserParser.YearContext ctx);

	/**
	 * Enter a parse tree produced by {@link NetworkParserParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull NetworkParserParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NetworkParserParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull NetworkParserParser.TypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link NetworkParserParser#ipv4id}.
	 * @param ctx the parse tree
	 */
	void enterIpv4id(@NotNull NetworkParserParser.Ipv4idContext ctx);
	/**
	 * Exit a parse tree produced by {@link NetworkParserParser#ipv4id}.
	 * @param ctx the parse tree
	 */
	void exitIpv4id(@NotNull NetworkParserParser.Ipv4idContext ctx);

	/**
	 * Enter a parse tree produced by {@link NetworkParserParser#mac}.
	 * @param ctx the parse tree
	 */
	void enterMac(@NotNull NetworkParserParser.MacContext ctx);
	/**
	 * Exit a parse tree produced by {@link NetworkParserParser#mac}.
	 * @param ctx the parse tree
	 */
	void exitMac(@NotNull NetworkParserParser.MacContext ctx);

	/**
	 * Enter a parse tree produced by {@link NetworkParserParser#seconds}.
	 * @param ctx the parse tree
	 */
	void enterSeconds(@NotNull NetworkParserParser.SecondsContext ctx);
	/**
	 * Exit a parse tree produced by {@link NetworkParserParser#seconds}.
	 * @param ctx the parse tree
	 */
	void exitSeconds(@NotNull NetworkParserParser.SecondsContext ctx);

	/**
	 * Enter a parse tree produced by {@link NetworkParserParser#protinfo}.
	 * @param ctx the parse tree
	 */
	void enterProtinfo(@NotNull NetworkParserParser.ProtinfoContext ctx);
	/**
	 * Exit a parse tree produced by {@link NetworkParserParser#protinfo}.
	 * @param ctx the parse tree
	 */
	void exitProtinfo(@NotNull NetworkParserParser.ProtinfoContext ctx);

	/**
	 * Enter a parse tree produced by {@link NetworkParserParser#hour}.
	 * @param ctx the parse tree
	 */
	void enterHour(@NotNull NetworkParserParser.HourContext ctx);
	/**
	 * Exit a parse tree produced by {@link NetworkParserParser#hour}.
	 * @param ctx the parse tree
	 */
	void exitHour(@NotNull NetworkParserParser.HourContext ctx);

	/**
	 * Enter a parse tree produced by {@link NetworkParserParser#ipv4}.
	 * @param ctx the parse tree
	 */
	void enterIpv4(@NotNull NetworkParserParser.Ipv4Context ctx);
	/**
	 * Exit a parse tree produced by {@link NetworkParserParser#ipv4}.
	 * @param ctx the parse tree
	 */
	void exitIpv4(@NotNull NetworkParserParser.Ipv4Context ctx);

	/**
	 * Enter a parse tree produced by {@link NetworkParserParser#from}.
	 * @param ctx the parse tree
	 */
	void enterFrom(@NotNull NetworkParserParser.FromContext ctx);
	/**
	 * Exit a parse tree produced by {@link NetworkParserParser#from}.
	 * @param ctx the parse tree
	 */
	void exitFrom(@NotNull NetworkParserParser.FromContext ctx);

	/**
	 * Enter a parse tree produced by {@link NetworkParserParser#ipv4content}.
	 * @param ctx the parse tree
	 */
	void enterIpv4content(@NotNull NetworkParserParser.Ipv4contentContext ctx);
	/**
	 * Exit a parse tree produced by {@link NetworkParserParser#ipv4content}.
	 * @param ctx the parse tree
	 */
	void exitIpv4content(@NotNull NetworkParserParser.Ipv4contentContext ctx);

	/**
	 * Enter a parse tree produced by {@link NetworkParserParser#tag}.
	 * @param ctx the parse tree
	 */
	void enterTag(@NotNull NetworkParserParser.TagContext ctx);
	/**
	 * Exit a parse tree produced by {@link NetworkParserParser#tag}.
	 * @param ctx the parse tree
	 */
	void exitTag(@NotNull NetworkParserParser.TagContext ctx);

	/**
	 * Enter a parse tree produced by {@link NetworkParserParser#day}.
	 * @param ctx the parse tree
	 */
	void enterDay(@NotNull NetworkParserParser.DayContext ctx);
	/**
	 * Exit a parse tree produced by {@link NetworkParserParser#day}.
	 * @param ctx the parse tree
	 */
	void exitDay(@NotNull NetworkParserParser.DayContext ctx);

	/**
	 * Enter a parse tree produced by {@link NetworkParserParser#miliseconds}.
	 * @param ctx the parse tree
	 */
	void enterMiliseconds(@NotNull NetworkParserParser.MilisecondsContext ctx);
	/**
	 * Exit a parse tree produced by {@link NetworkParserParser#miliseconds}.
	 * @param ctx the parse tree
	 */
	void exitMiliseconds(@NotNull NetworkParserParser.MilisecondsContext ctx);

	/**
	 * Enter a parse tree produced by {@link NetworkParserParser#dumpline}.
	 * @param ctx the parse tree
	 */
	void enterDumpline(@NotNull NetworkParserParser.DumplineContext ctx);
	/**
	 * Exit a parse tree produced by {@link NetworkParserParser#dumpline}.
	 * @param ctx the parse tree
	 */
	void exitDumpline(@NotNull NetworkParserParser.DumplineContext ctx);

	/**
	 * Enter a parse tree produced by {@link NetworkParserParser#length}.
	 * @param ctx the parse tree
	 */
	void enterLength(@NotNull NetworkParserParser.LengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link NetworkParserParser#length}.
	 * @param ctx the parse tree
	 */
	void exitLength(@NotNull NetworkParserParser.LengthContext ctx);

	/**
	 * Enter a parse tree produced by {@link NetworkParserParser#packet}.
	 * @param ctx the parse tree
	 */
	void enterPacket(@NotNull NetworkParserParser.PacketContext ctx);
	/**
	 * Exit a parse tree produced by {@link NetworkParserParser#packet}.
	 * @param ctx the parse tree
	 */
	void exitPacket(@NotNull NetworkParserParser.PacketContext ctx);

	/**
	 * Enter a parse tree produced by {@link NetworkParserParser#ipv4offset}.
	 * @param ctx the parse tree
	 */
	void enterIpv4offset(@NotNull NetworkParserParser.Ipv4offsetContext ctx);
	/**
	 * Exit a parse tree produced by {@link NetworkParserParser#ipv4offset}.
	 * @param ctx the parse tree
	 */
	void exitIpv4offset(@NotNull NetworkParserParser.Ipv4offsetContext ctx);

	/**
	 * Enter a parse tree produced by {@link NetworkParserParser#minute}.
	 * @param ctx the parse tree
	 */
	void enterMinute(@NotNull NetworkParserParser.MinuteContext ctx);
	/**
	 * Exit a parse tree produced by {@link NetworkParserParser#minute}.
	 * @param ctx the parse tree
	 */
	void exitMinute(@NotNull NetworkParserParser.MinuteContext ctx);

	/**
	 * Enter a parse tree produced by {@link NetworkParserParser#entry}.
	 * @param ctx the parse tree
	 */
	void enterEntry(@NotNull NetworkParserParser.EntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link NetworkParserParser#entry}.
	 * @param ctx the parse tree
	 */
	void exitEntry(@NotNull NetworkParserParser.EntryContext ctx);

	/**
	 * Enter a parse tree produced by {@link NetworkParserParser#entries}.
	 * @param ctx the parse tree
	 */
	void enterEntries(@NotNull NetworkParserParser.EntriesContext ctx);
	/**
	 * Exit a parse tree produced by {@link NetworkParserParser#entries}.
	 * @param ctx the parse tree
	 */
	void exitEntries(@NotNull NetworkParserParser.EntriesContext ctx);

	/**
	 * Enter a parse tree produced by {@link NetworkParserParser#ipv4proto}.
	 * @param ctx the parse tree
	 */
	void enterIpv4proto(@NotNull NetworkParserParser.Ipv4protoContext ctx);
	/**
	 * Exit a parse tree produced by {@link NetworkParserParser#ipv4proto}.
	 * @param ctx the parse tree
	 */
	void exitIpv4proto(@NotNull NetworkParserParser.Ipv4protoContext ctx);

	/**
	 * Enter a parse tree produced by {@link NetworkParserParser#month}.
	 * @param ctx the parse tree
	 */
	void enterMonth(@NotNull NetworkParserParser.MonthContext ctx);
	/**
	 * Exit a parse tree produced by {@link NetworkParserParser#month}.
	 * @param ctx the parse tree
	 */
	void exitMonth(@NotNull NetworkParserParser.MonthContext ctx);

	/**
	 * Enter a parse tree produced by {@link NetworkParserParser#flagvalues}.
	 * @param ctx the parse tree
	 */
	void enterFlagvalues(@NotNull NetworkParserParser.FlagvaluesContext ctx);
	/**
	 * Exit a parse tree produced by {@link NetworkParserParser#flagvalues}.
	 * @param ctx the parse tree
	 */
	void exitFlagvalues(@NotNull NetworkParserParser.FlagvaluesContext ctx);

	/**
	 * Enter a parse tree produced by {@link NetworkParserParser#ipv4tos}.
	 * @param ctx the parse tree
	 */
	void enterIpv4tos(@NotNull NetworkParserParser.Ipv4tosContext ctx);
	/**
	 * Exit a parse tree produced by {@link NetworkParserParser#ipv4tos}.
	 * @param ctx the parse tree
	 */
	void exitIpv4tos(@NotNull NetworkParserParser.Ipv4tosContext ctx);

	/**
	 * Enter a parse tree produced by {@link NetworkParserParser#protname}.
	 * @param ctx the parse tree
	 */
	void enterProtname(@NotNull NetworkParserParser.ProtnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link NetworkParserParser#protname}.
	 * @param ctx the parse tree
	 */
	void exitProtname(@NotNull NetworkParserParser.ProtnameContext ctx);

	/**
	 * Enter a parse tree produced by {@link NetworkParserParser#ipv4fields}.
	 * @param ctx the parse tree
	 */
	void enterIpv4fields(@NotNull NetworkParserParser.Ipv4fieldsContext ctx);
	/**
	 * Exit a parse tree produced by {@link NetworkParserParser#ipv4fields}.
	 * @param ctx the parse tree
	 */
	void exitIpv4fields(@NotNull NetworkParserParser.Ipv4fieldsContext ctx);

	/**
	 * Enter a parse tree produced by {@link NetworkParserParser#time}.
	 * @param ctx the parse tree
	 */
	void enterTime(@NotNull NetworkParserParser.TimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NetworkParserParser#time}.
	 * @param ctx the parse tree
	 */
	void exitTime(@NotNull NetworkParserParser.TimeContext ctx);

	/**
	 * Enter a parse tree produced by {@link NetworkParserParser#to}.
	 * @param ctx the parse tree
	 */
	void enterTo(@NotNull NetworkParserParser.ToContext ctx);
	/**
	 * Exit a parse tree produced by {@link NetworkParserParser#to}.
	 * @param ctx the parse tree
	 */
	void exitTo(@NotNull NetworkParserParser.ToContext ctx);
}