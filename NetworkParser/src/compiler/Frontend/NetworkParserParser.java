package compiler.Frontend;

// Generated from C:\Users\s140330\Downloads\NetworkParser.g4 by ANTLR 4.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class NetworkParserParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__28=1, T__27=2, T__26=3, T__25=4, T__24=5, T__23=6, T__22=7, T__21=8, 
		T__20=9, T__19=10, T__18=11, T__17=12, T__16=13, T__15=14, T__14=15, T__13=16, 
		T__12=17, T__11=18, T__10=19, T__9=20, T__8=21, T__7=22, T__6=23, T__5=24, 
		T__4=25, T__3=26, T__2=27, T__1=28, T__0=29, NUMBER=30, MAC=31, BYTE=32, 
		WORD=33, HEX=34, HEXNUMBER=35, IPV4ADR=36;
	public static final String[] tokenNames = {
		"<INVALID>", "'ttl'", "'length'", "'PROTO'", "'id'", "'MF'", "'mf'", "'ICMP'", 
		"'offset'", "'tos'", "'IPv4'", "'none'", "'flags'", "'('", "','", "'TCP'", 
		"'.'", "'NONE'", "':'", "'['", "']'", "'>'", "'df'", "'IGMP'", "'DF'", 
		"'proto'", "'ethertype'", "')'", "'-'", "'UDP'", "NUMBER", "MAC", "BYTE", 
		"WORD", "HEX", "HEXNUMBER", "IPV4ADR"
	};
	public static final int
		RULE_entries = 0, RULE_entry = 1, RULE_packet = 2, RULE_date = 3, RULE_time = 4, 
		RULE_mac = 5, RULE_type = 6, RULE_ipv4 = 7, RULE_tag = 8, RULE_length = 9, 
		RULE_ipv4content = 10, RULE_ipv4fields = 11, RULE_ipv4tos = 12, RULE_ipv4ttl = 13, 
		RULE_ipv4id = 14, RULE_ipv4offset = 15, RULE_ipv4flags = 16, RULE_flagvalues = 17, 
		RULE_ipv4proto = 18, RULE_protname = 19, RULE_protinfo = 20, RULE_dumpline = 21;
	public static final String[] ruleNames = {
		"entries", "entry", "packet", "date", "time", "mac", "type", "ipv4", "tag", 
		"length", "ipv4content", "ipv4fields", "ipv4tos", "ipv4ttl", "ipv4id", 
		"ipv4offset", "ipv4flags", "flagvalues", "ipv4proto", "protname", "protinfo", 
		"dumpline"
	};

	@Override
	public String getGrammarFileName() { return "NetworkParser.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public NetworkParserParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class EntriesContext extends ParserRuleContext {
		public EntryContext entry(int i) {
			return getRuleContext(EntryContext.class,i);
		}
		public List<EntryContext> entry() {
			return getRuleContexts(EntryContext.class);
		}
		public EntriesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entries; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParserListener ) ((NetworkParserListener)listener).enterEntries(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParserListener ) ((NetworkParserListener)listener).exitEntries(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NetworkParserVisitor ) return ((NetworkParserVisitor<? extends T>)visitor).visitEntries(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntriesContext entries() throws RecognitionException {
		EntriesContext _localctx = new EntriesContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_entries);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NUMBER) {
				{
				{
				setState(44); entry();
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EntryContext extends ParserRuleContext {
		public DateContext date() {
			return getRuleContext(DateContext.class,0);
		}
		public TimeContext time() {
			return getRuleContext(TimeContext.class,0);
		}
		public PacketContext packet() {
			return getRuleContext(PacketContext.class,0);
		}
		public EntryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParserListener ) ((NetworkParserListener)listener).enterEntry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParserListener ) ((NetworkParserListener)listener).exitEntry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NetworkParserVisitor ) return ((NetworkParserVisitor<? extends T>)visitor).visitEntry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntryContext entry() throws RecognitionException {
		EntryContext _localctx = new EntryContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_entry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50); date();
			setState(51); time();
			setState(52); packet();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PacketContext extends ParserRuleContext {
		public LengthContext length() {
			return getRuleContext(LengthContext.class,0);
		}
		public List<MacContext> mac() {
			return getRuleContexts(MacContext.class);
		}
		public MacContext mac(int i) {
			return getRuleContext(MacContext.class,i);
		}
		public Ipv4contentContext ipv4content() {
			return getRuleContext(Ipv4contentContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public PacketContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParserListener ) ((NetworkParserListener)listener).enterPacket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParserListener ) ((NetworkParserListener)listener).exitPacket(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NetworkParserVisitor ) return ((NetworkParserVisitor<? extends T>)visitor).visitPacket(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PacketContext packet() throws RecognitionException {
		PacketContext _localctx = new PacketContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_packet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54); mac();
			setState(55); match(21);
			setState(56); mac();
			setState(57); match(14);
			setState(58); match(26);
			setState(59); type();
			setState(60); match(14);
			setState(61); length();
			setState(62); match(18);
			setState(63); ipv4content();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DateContext extends ParserRuleContext {
		public Token day;
		public Token month;
		public Token year;
		public TerminalNode NUMBER(int i) {
			return getToken(NetworkParserParser.NUMBER, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(NetworkParserParser.NUMBER); }
		public DateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParserListener ) ((NetworkParserListener)listener).enterDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParserListener ) ((NetworkParserListener)listener).exitDate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NetworkParserVisitor ) return ((NetworkParserVisitor<? extends T>)visitor).visitDate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DateContext date() throws RecognitionException {
		DateContext _localctx = new DateContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_date);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65); ((DateContext)_localctx).day = match(NUMBER);
			setState(66); match(28);
			setState(67); ((DateContext)_localctx).month = match(NUMBER);
			setState(68); match(28);
			setState(69); ((DateContext)_localctx).year = match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TimeContext extends ParserRuleContext {
		public Token hour;
		public Token minute;
		public Token seconds;
		public Token miliseconds;
		public TerminalNode NUMBER(int i) {
			return getToken(NetworkParserParser.NUMBER, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(NetworkParserParser.NUMBER); }
		public TimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParserListener ) ((NetworkParserListener)listener).enterTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParserListener ) ((NetworkParserListener)listener).exitTime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NetworkParserVisitor ) return ((NetworkParserVisitor<? extends T>)visitor).visitTime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeContext time() throws RecognitionException {
		TimeContext _localctx = new TimeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_time);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71); ((TimeContext)_localctx).hour = match(NUMBER);
			setState(72); match(18);
			setState(73); ((TimeContext)_localctx).minute = match(NUMBER);
			setState(74); match(18);
			setState(75); ((TimeContext)_localctx).seconds = match(NUMBER);
			setState(76); match(16);
			setState(77); ((TimeContext)_localctx).miliseconds = match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MacContext extends ParserRuleContext {
		public TerminalNode MAC() { return getToken(NetworkParserParser.MAC, 0); }
		public MacContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mac; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParserListener ) ((NetworkParserListener)listener).enterMac(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParserListener ) ((NetworkParserListener)listener).exitMac(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NetworkParserVisitor ) return ((NetworkParserVisitor<? extends T>)visitor).visitMac(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MacContext mac() throws RecognitionException {
		MacContext _localctx = new MacContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_mac);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79); match(MAC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public Ipv4Context ipv4() {
			return getRuleContext(Ipv4Context.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParserListener ) ((NetworkParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParserListener ) ((NetworkParserListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NetworkParserVisitor ) return ((NetworkParserVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81); ipv4();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ipv4Context extends ParserRuleContext {
		public TagContext tag() {
			return getRuleContext(TagContext.class,0);
		}
		public Ipv4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ipv4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParserListener ) ((NetworkParserListener)listener).enterIpv4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParserListener ) ((NetworkParserListener)listener).exitIpv4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NetworkParserVisitor ) return ((NetworkParserVisitor<? extends T>)visitor).visitIpv4(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ipv4Context ipv4() throws RecognitionException {
		Ipv4Context _localctx = new Ipv4Context(_ctx, getState());
		enterRule(_localctx, 14, RULE_ipv4);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83); match(10);
			setState(84); tag();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TagContext extends ParserRuleContext {
		public TerminalNode HEXNUMBER() { return getToken(NetworkParserParser.HEXNUMBER, 0); }
		public TagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParserListener ) ((NetworkParserListener)listener).enterTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParserListener ) ((NetworkParserListener)listener).exitTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NetworkParserVisitor ) return ((NetworkParserVisitor<? extends T>)visitor).visitTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagContext tag() throws RecognitionException {
		TagContext _localctx = new TagContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_tag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86); match(13);
			setState(87); match(HEXNUMBER);
			setState(88); match(27);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LengthContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(NetworkParserParser.NUMBER, 0); }
		public LengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_length; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParserListener ) ((NetworkParserListener)listener).enterLength(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParserListener ) ((NetworkParserListener)listener).exitLength(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NetworkParserVisitor ) return ((NetworkParserVisitor<? extends T>)visitor).visitLength(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LengthContext length() throws RecognitionException {
		LengthContext _localctx = new LengthContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_length);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90); match(2);
			setState(91); match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ipv4contentContext extends ParserRuleContext {
		public Ipv4fieldsContext fields;
		public Token from;
		public Token to;
		public ProtinfoContext prot;
		public DumplineContext dump;
		public DumplineContext dumpline(int i) {
			return getRuleContext(DumplineContext.class,i);
		}
		public TerminalNode IPV4ADR(int i) {
			return getToken(NetworkParserParser.IPV4ADR, i);
		}
		public ProtinfoContext protinfo() {
			return getRuleContext(ProtinfoContext.class,0);
		}
		public Ipv4fieldsContext ipv4fields() {
			return getRuleContext(Ipv4fieldsContext.class,0);
		}
		public List<TerminalNode> IPV4ADR() { return getTokens(NetworkParserParser.IPV4ADR); }
		public List<DumplineContext> dumpline() {
			return getRuleContexts(DumplineContext.class);
		}
		public Ipv4contentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ipv4content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParserListener ) ((NetworkParserListener)listener).enterIpv4content(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParserListener ) ((NetworkParserListener)listener).exitIpv4content(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NetworkParserVisitor ) return ((NetworkParserVisitor<? extends T>)visitor).visitIpv4content(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ipv4contentContext ipv4content() throws RecognitionException {
		Ipv4contentContext _localctx = new Ipv4contentContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ipv4content);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93); ((Ipv4contentContext)_localctx).fields = ipv4fields();
			setState(94); ((Ipv4contentContext)_localctx).from = match(IPV4ADR);
			setState(95); match(21);
			setState(96); ((Ipv4contentContext)_localctx).to = match(IPV4ADR);
			setState(97); match(18);
			setState(98); ((Ipv4contentContext)_localctx).prot = protinfo();
			setState(100); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(99); ((Ipv4contentContext)_localctx).dump = dumpline();
				}
				}
				setState(102); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==HEXNUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ipv4fieldsContext extends ParserRuleContext {
		public Ipv4tosContext tos;
		public Ipv4ttlContext ttl;
		public Ipv4idContext id;
		public Ipv4offsetContext offset;
		public Ipv4flagsContext flags;
		public Ipv4protoContext proto;
		public LengthContext length() {
			return getRuleContext(LengthContext.class,0);
		}
		public Ipv4tosContext ipv4tos() {
			return getRuleContext(Ipv4tosContext.class,0);
		}
		public Ipv4offsetContext ipv4offset() {
			return getRuleContext(Ipv4offsetContext.class,0);
		}
		public Ipv4ttlContext ipv4ttl() {
			return getRuleContext(Ipv4ttlContext.class,0);
		}
		public Ipv4flagsContext ipv4flags() {
			return getRuleContext(Ipv4flagsContext.class,0);
		}
		public Ipv4idContext ipv4id() {
			return getRuleContext(Ipv4idContext.class,0);
		}
		public Ipv4protoContext ipv4proto() {
			return getRuleContext(Ipv4protoContext.class,0);
		}
		public Ipv4fieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ipv4fields; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParserListener ) ((NetworkParserListener)listener).enterIpv4fields(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParserListener ) ((NetworkParserListener)listener).exitIpv4fields(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NetworkParserVisitor ) return ((NetworkParserVisitor<? extends T>)visitor).visitIpv4fields(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ipv4fieldsContext ipv4fields() throws RecognitionException {
		Ipv4fieldsContext _localctx = new Ipv4fieldsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_ipv4fields);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104); match(13);
			setState(105); ((Ipv4fieldsContext)_localctx).tos = ipv4tos();
			setState(106); match(14);
			setState(107); ((Ipv4fieldsContext)_localctx).ttl = ipv4ttl();
			setState(108); match(14);
			setState(109); ((Ipv4fieldsContext)_localctx).id = ipv4id();
			setState(110); match(14);
			setState(111); ((Ipv4fieldsContext)_localctx).offset = ipv4offset();
			setState(112); match(14);
			setState(113); ((Ipv4fieldsContext)_localctx).flags = ipv4flags();
			setState(114); match(14);
			setState(115); ((Ipv4fieldsContext)_localctx).proto = ipv4proto();
			setState(116); match(14);
			setState(117); length();
			setState(118); match(27);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ipv4tosContext extends ParserRuleContext {
		public TerminalNode HEXNUMBER() { return getToken(NetworkParserParser.HEXNUMBER, 0); }
		public Ipv4tosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ipv4tos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParserListener ) ((NetworkParserListener)listener).enterIpv4tos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParserListener ) ((NetworkParserListener)listener).exitIpv4tos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NetworkParserVisitor ) return ((NetworkParserVisitor<? extends T>)visitor).visitIpv4tos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ipv4tosContext ipv4tos() throws RecognitionException {
		Ipv4tosContext _localctx = new Ipv4tosContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ipv4tos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120); match(9);
			setState(121); match(HEXNUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ipv4ttlContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(NetworkParserParser.NUMBER, 0); }
		public Ipv4ttlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ipv4ttl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParserListener ) ((NetworkParserListener)listener).enterIpv4ttl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParserListener ) ((NetworkParserListener)listener).exitIpv4ttl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NetworkParserVisitor ) return ((NetworkParserVisitor<? extends T>)visitor).visitIpv4ttl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ipv4ttlContext ipv4ttl() throws RecognitionException {
		Ipv4ttlContext _localctx = new Ipv4ttlContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_ipv4ttl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123); match(1);
			setState(124); match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ipv4idContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(NetworkParserParser.NUMBER, 0); }
		public Ipv4idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ipv4id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParserListener ) ((NetworkParserListener)listener).enterIpv4id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParserListener ) ((NetworkParserListener)listener).exitIpv4id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NetworkParserVisitor ) return ((NetworkParserVisitor<? extends T>)visitor).visitIpv4id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ipv4idContext ipv4id() throws RecognitionException {
		Ipv4idContext _localctx = new Ipv4idContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_ipv4id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126); match(4);
			setState(127); match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ipv4offsetContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(NetworkParserParser.NUMBER, 0); }
		public Ipv4offsetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ipv4offset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParserListener ) ((NetworkParserListener)listener).enterIpv4offset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParserListener ) ((NetworkParserListener)listener).exitIpv4offset(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NetworkParserVisitor ) return ((NetworkParserVisitor<? extends T>)visitor).visitIpv4offset(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ipv4offsetContext ipv4offset() throws RecognitionException {
		Ipv4offsetContext _localctx = new Ipv4offsetContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_ipv4offset);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129); match(8);
			setState(130); match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ipv4flagsContext extends ParserRuleContext {
		public FlagvaluesContext flagvalues() {
			return getRuleContext(FlagvaluesContext.class,0);
		}
		public Ipv4flagsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ipv4flags; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParserListener ) ((NetworkParserListener)listener).enterIpv4flags(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParserListener ) ((NetworkParserListener)listener).exitIpv4flags(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NetworkParserVisitor ) return ((NetworkParserVisitor<? extends T>)visitor).visitIpv4flags(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ipv4flagsContext ipv4flags() throws RecognitionException {
		Ipv4flagsContext _localctx = new Ipv4flagsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_ipv4flags);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132); match(12);
			setState(133); match(19);
			setState(134); flagvalues();
			setState(135); match(20);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FlagvaluesContext extends ParserRuleContext {
		public FlagvaluesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flagvalues; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParserListener ) ((NetworkParserListener)listener).enterFlagvalues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParserListener ) ((NetworkParserListener)listener).exitFlagvalues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NetworkParserVisitor ) return ((NetworkParserVisitor<? extends T>)visitor).visitFlagvalues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FlagvaluesContext flagvalues() throws RecognitionException {
		FlagvaluesContext _localctx = new FlagvaluesContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_flagvalues);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 5) | (1L << 6) | (1L << 11) | (1L << 17) | (1L << 22) | (1L << 24))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ipv4protoContext extends ParserRuleContext {
		public ProtnameContext protname() {
			return getRuleContext(ProtnameContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(NetworkParserParser.NUMBER, 0); }
		public Ipv4protoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ipv4proto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParserListener ) ((NetworkParserListener)listener).enterIpv4proto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParserListener ) ((NetworkParserListener)listener).exitIpv4proto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NetworkParserVisitor ) return ((NetworkParserVisitor<? extends T>)visitor).visitIpv4proto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ipv4protoContext ipv4proto() throws RecognitionException {
		Ipv4protoContext _localctx = new Ipv4protoContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_ipv4proto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			_la = _input.LA(1);
			if ( !(_la==3 || _la==25) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(140); protname();
			setState(141); match(13);
			setState(142); match(NUMBER);
			setState(143); match(27);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProtnameContext extends ParserRuleContext {
		public ProtnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParserListener ) ((NetworkParserListener)listener).enterProtname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParserListener ) ((NetworkParserListener)listener).exitProtname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NetworkParserVisitor ) return ((NetworkParserVisitor<? extends T>)visitor).visitProtname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProtnameContext protname() throws RecognitionException {
		ProtnameContext _localctx = new ProtnameContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_protname);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 7) | (1L << 15) | (1L << 23) | (1L << 29))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProtinfoContext extends ParserRuleContext {
		public LengthContext length() {
			return getRuleContext(LengthContext.class,0);
		}
		public ProtnameContext protname() {
			return getRuleContext(ProtnameContext.class,0);
		}
		public ProtinfoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protinfo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParserListener ) ((NetworkParserListener)listener).enterProtinfo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParserListener ) ((NetworkParserListener)listener).exitProtinfo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NetworkParserVisitor ) return ((NetworkParserVisitor<? extends T>)visitor).visitProtinfo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProtinfoContext protinfo() throws RecognitionException {
		ProtinfoContext _localctx = new ProtinfoContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_protinfo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147); protname();
			setState(148); match(14);
			setState(149); length();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DumplineContext extends ParserRuleContext {
		public TerminalNode HEXNUMBER() { return getToken(NetworkParserParser.HEXNUMBER, 0); }
		public DumplineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dumpline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParserListener ) ((NetworkParserListener)listener).enterDumpline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParserListener ) ((NetworkParserListener)listener).exitDumpline(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NetworkParserVisitor ) return ((NetworkParserVisitor<? extends T>)visitor).visitDumpline(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DumplineContext dumpline() throws RecognitionException {
		DumplineContext _localctx = new DumplineContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_dumpline);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(151); match(HEXNUMBER);
			setState(152); match(18);
			setState(154); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(153);
					matchWildcard();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(156); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=1 && _alt!=-1 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3&\u00a1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\7\2\60\n\2\f\2"+
		"\16\2\63\13\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\6\fg\n\f\r\f\16\fh\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3"+
		"\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\6\27\u009d\n\27"+
		"\r\27\16\27\u009e\3\27\3\u009e\30\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,\2\5\7\2\7\b\r\r\23\23\30\30\32\32\4\2\5\5\33\33\6\2\t\t\21"+
		"\21\31\31\37\37\u008d\2\61\3\2\2\2\4\64\3\2\2\2\68\3\2\2\2\bC\3\2\2\2"+
		"\nI\3\2\2\2\fQ\3\2\2\2\16S\3\2\2\2\20U\3\2\2\2\22X\3\2\2\2\24\\\3\2\2"+
		"\2\26_\3\2\2\2\30j\3\2\2\2\32z\3\2\2\2\34}\3\2\2\2\36\u0080\3\2\2\2 \u0083"+
		"\3\2\2\2\"\u0086\3\2\2\2$\u008b\3\2\2\2&\u008d\3\2\2\2(\u0093\3\2\2\2"+
		"*\u0095\3\2\2\2,\u0099\3\2\2\2.\60\5\4\3\2/.\3\2\2\2\60\63\3\2\2\2\61"+
		"/\3\2\2\2\61\62\3\2\2\2\62\3\3\2\2\2\63\61\3\2\2\2\64\65\5\b\5\2\65\66"+
		"\5\n\6\2\66\67\5\6\4\2\67\5\3\2\2\289\5\f\7\29:\7\27\2\2:;\5\f\7\2;<\7"+
		"\20\2\2<=\7\34\2\2=>\5\16\b\2>?\7\20\2\2?@\5\24\13\2@A\7\24\2\2AB\5\26"+
		"\f\2B\7\3\2\2\2CD\7 \2\2DE\7\36\2\2EF\7 \2\2FG\7\36\2\2GH\7 \2\2H\t\3"+
		"\2\2\2IJ\7 \2\2JK\7\24\2\2KL\7 \2\2LM\7\24\2\2MN\7 \2\2NO\7\22\2\2OP\7"+
		" \2\2P\13\3\2\2\2QR\7!\2\2R\r\3\2\2\2ST\5\20\t\2T\17\3\2\2\2UV\7\f\2\2"+
		"VW\5\22\n\2W\21\3\2\2\2XY\7\17\2\2YZ\7%\2\2Z[\7\35\2\2[\23\3\2\2\2\\]"+
		"\7\4\2\2]^\7 \2\2^\25\3\2\2\2_`\5\30\r\2`a\7&\2\2ab\7\27\2\2bc\7&\2\2"+
		"cd\7\24\2\2df\5*\26\2eg\5,\27\2fe\3\2\2\2gh\3\2\2\2hf\3\2\2\2hi\3\2\2"+
		"\2i\27\3\2\2\2jk\7\17\2\2kl\5\32\16\2lm\7\20\2\2mn\5\34\17\2no\7\20\2"+
		"\2op\5\36\20\2pq\7\20\2\2qr\5 \21\2rs\7\20\2\2st\5\"\22\2tu\7\20\2\2u"+
		"v\5&\24\2vw\7\20\2\2wx\5\24\13\2xy\7\35\2\2y\31\3\2\2\2z{\7\13\2\2{|\7"+
		"%\2\2|\33\3\2\2\2}~\7\3\2\2~\177\7 \2\2\177\35\3\2\2\2\u0080\u0081\7\6"+
		"\2\2\u0081\u0082\7 \2\2\u0082\37\3\2\2\2\u0083\u0084\7\n\2\2\u0084\u0085"+
		"\7 \2\2\u0085!\3\2\2\2\u0086\u0087\7\16\2\2\u0087\u0088\7\25\2\2\u0088"+
		"\u0089\5$\23\2\u0089\u008a\7\26\2\2\u008a#\3\2\2\2\u008b\u008c\t\2\2\2"+
		"\u008c%\3\2\2\2\u008d\u008e\t\3\2\2\u008e\u008f\5(\25\2\u008f\u0090\7"+
		"\17\2\2\u0090\u0091\7 \2\2\u0091\u0092\7\35\2\2\u0092\'\3\2\2\2\u0093"+
		"\u0094\t\4\2\2\u0094)\3\2\2\2\u0095\u0096\5(\25\2\u0096\u0097\7\20\2\2"+
		"\u0097\u0098\5\24\13\2\u0098+\3\2\2\2\u0099\u009a\7%\2\2\u009a\u009c\7"+
		"\24\2\2\u009b\u009d\13\2\2\2\u009c\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e"+
		"\u009f\3\2\2\2\u009e\u009c\3\2\2\2\u009f-\3\2\2\2\5\61h\u009e";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}