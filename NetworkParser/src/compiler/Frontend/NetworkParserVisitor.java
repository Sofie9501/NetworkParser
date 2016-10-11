package compiler.Frontend;

// Generated from C:\Users\s140330\Downloads\NetworkParser.g4 by ANTLR 4.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link NetworkParserParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface NetworkParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link NetworkParserParser#date}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate(@NotNull NetworkParserParser.DateContext ctx);

	/**
	 * Visit a parse tree produced by {@link NetworkParserParser#ipv4ttl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIpv4ttl(@NotNull NetworkParserParser.Ipv4ttlContext ctx);

	/**
	 * Visit a parse tree produced by {@link NetworkParserParser#ipv4flags}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIpv4flags(@NotNull NetworkParserParser.Ipv4flagsContext ctx);

	/**
	 * Visit a parse tree produced by {@link NetworkParserParser#dumpline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDumpline(@NotNull NetworkParserParser.DumplineContext ctx);

	/**
	 * Visit a parse tree produced by {@link NetworkParserParser#length}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLength(@NotNull NetworkParserParser.LengthContext ctx);

	/**
	 * Visit a parse tree produced by {@link NetworkParserParser#packet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPacket(@NotNull NetworkParserParser.PacketContext ctx);

	/**
	 * Visit a parse tree produced by {@link NetworkParserParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(@NotNull NetworkParserParser.TypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link NetworkParserParser#ipv4id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIpv4id(@NotNull NetworkParserParser.Ipv4idContext ctx);

	/**
	 * Visit a parse tree produced by {@link NetworkParserParser#mac}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMac(@NotNull NetworkParserParser.MacContext ctx);

	/**
	 * Visit a parse tree produced by {@link NetworkParserParser#ipv4offset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIpv4offset(@NotNull NetworkParserParser.Ipv4offsetContext ctx);

	/**
	 * Visit a parse tree produced by {@link NetworkParserParser#entry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntry(@NotNull NetworkParserParser.EntryContext ctx);

	/**
	 * Visit a parse tree produced by {@link NetworkParserParser#entries}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntries(@NotNull NetworkParserParser.EntriesContext ctx);

	/**
	 * Visit a parse tree produced by {@link NetworkParserParser#protinfo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtinfo(@NotNull NetworkParserParser.ProtinfoContext ctx);

	/**
	 * Visit a parse tree produced by {@link NetworkParserParser#ipv4proto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIpv4proto(@NotNull NetworkParserParser.Ipv4protoContext ctx);

	/**
	 * Visit a parse tree produced by {@link NetworkParserParser#ipv4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIpv4(@NotNull NetworkParserParser.Ipv4Context ctx);

	/**
	 * Visit a parse tree produced by {@link NetworkParserParser#flagvalues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlagvalues(@NotNull NetworkParserParser.FlagvaluesContext ctx);

	/**
	 * Visit a parse tree produced by {@link NetworkParserParser#ipv4tos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIpv4tos(@NotNull NetworkParserParser.Ipv4tosContext ctx);

	/**
	 * Visit a parse tree produced by {@link NetworkParserParser#protname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtname(@NotNull NetworkParserParser.ProtnameContext ctx);

	/**
	 * Visit a parse tree produced by {@link NetworkParserParser#ipv4content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIpv4content(@NotNull NetworkParserParser.Ipv4contentContext ctx);

	/**
	 * Visit a parse tree produced by {@link NetworkParserParser#ipv4fields}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIpv4fields(@NotNull NetworkParserParser.Ipv4fieldsContext ctx);

	/**
	 * Visit a parse tree produced by {@link NetworkParserParser#time}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime(@NotNull NetworkParserParser.TimeContext ctx);

	/**
	 * Visit a parse tree produced by {@link NetworkParserParser#tag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTag(@NotNull NetworkParserParser.TagContext ctx);
}