// Generated from C:\Users\s140330\Downloads\NetworkParser.g4 by ANTLR 4.1
package compiler.Frontend;
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
		T__26=1, T__25=2, T__24=3, T__23=4, T__22=5, T__21=6, T__20=7, T__19=8, 
		T__18=9, T__17=10, T__16=11, T__15=12, T__14=13, T__13=14, T__12=15, T__11=16, 
		T__10=17, T__9=18, T__8=19, T__7=20, T__6=21, T__5=22, T__4=23, T__3=24, 
		T__2=25, T__1=26, T__0=27, NUMBER=28, MAC=29, BYTE=30, WORD=31, HEX=32, 
		HEXNUMBER=33, PROTO=34, IPV4ADR=35, REST=36, WHITESPACE=37;
	public static final String[] tokenNames = {
		"<INVALID>", "'ttl'", "'length'", "'id'", "'MF'", "'mf'", "'ICMP'", "'offset'", 
		"'tos'", "'IPv4'", "'none'", "'flags'", "'('", "','", "'TCP'", "'.'", 
		"'NONE'", "':'", "'['", "']'", "'>'", "'df'", "'IGMP'", "'DF'", "'ethertype'", 
		"')'", "'-'", "'UDP'", "NUMBER", "MAC", "BYTE", "WORD", "HEX", "HEXNUMBER", 
		"PROTO", "IPV4ADR", "REST", "WHITESPACE"
	};
	public static final int
		RULE_entries = 0, RULE_entry = 1, RULE_packet = 2, RULE_date = 3, RULE_time = 4, 
		RULE_mac = 5, RULE_day = 6, RULE_month = 7, RULE_year = 8, RULE_hour = 9, 
		RULE_minute = 10, RULE_seconds = 11, RULE_miliseconds = 12, RULE_to = 13, 
		RULE_from = 14, RULE_type = 15, RULE_ipv4 = 16, RULE_tag = 17, RULE_length = 18, 
		RULE_ipv4content = 19, RULE_ipv4fields = 20, RULE_ipv4tos = 21, RULE_ipv4ttl = 22, 
		RULE_ipv4id = 23, RULE_ipv4offset = 24, RULE_ipv4flags = 25, RULE_flagvalues = 26, 
		RULE_ipv4proto = 27, RULE_protname = 28, RULE_protinfo = 29, RULE_dumpline = 30;
	public static final String[] ruleNames = {
		"entries", "entry", "packet", "date", "time", "mac", "day", "month", "year", 
		"hour", "minute", "seconds", "miliseconds", "to", "from", "type", "ipv4", 
		"tag", "length", "ipv4content", "ipv4fields", "ipv4tos", "ipv4ttl", "ipv4id", 
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
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NUMBER) {
				{
				{
				setState(62); entry();
				}
				}
				setState(67);
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
			setState(68); date();
			setState(69); time();
			setState(70); packet();
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
			setState(72); mac();
			setState(73); match(20);
			setState(74); mac();
			setState(75); match(13);
			setState(76); match(24);
			setState(77); type();
			setState(78); match(13);
			setState(79); length();
			setState(80); match(17);
			setState(81); ipv4content();
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
		public YearContext year() {
			return getRuleContext(YearContext.class,0);
		}
		public MonthContext month() {
			return getRuleContext(MonthContext.class,0);
		}
		public DayContext day() {
			return getRuleContext(DayContext.class,0);
		}
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
			setState(83); year();
			setState(84); match(26);
			setState(85); month();
			setState(86); match(26);
			setState(87); day();
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
		public MilisecondsContext miliseconds() {
			return getRuleContext(MilisecondsContext.class,0);
		}
		public MinuteContext minute() {
			return getRuleContext(MinuteContext.class,0);
		}
		public SecondsContext seconds() {
			return getRuleContext(SecondsContext.class,0);
		}
		public HourContext hour() {
			return getRuleContext(HourContext.class,0);
		}
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
			setState(89); hour();
			setState(90); match(17);
			setState(91); minute();
			setState(92); match(17);
			setState(93); seconds();
			setState(94); match(15);
			setState(95); miliseconds();
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
			setState(97); match(MAC);
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

	public static class DayContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(NetworkParserParser.NUMBER, 0); }
		public DayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_day; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParserListener ) ((NetworkParserListener)listener).enterDay(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParserListener ) ((NetworkParserListener)listener).exitDay(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NetworkParserVisitor ) return ((NetworkParserVisitor<? extends T>)visitor).visitDay(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DayContext day() throws RecognitionException {
		DayContext _localctx = new DayContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_day);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99); match(NUMBER);
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

	public static class MonthContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(NetworkParserParser.NUMBER, 0); }
		public MonthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_month; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParserListener ) ((NetworkParserListener)listener).enterMonth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParserListener ) ((NetworkParserListener)listener).exitMonth(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NetworkParserVisitor ) return ((NetworkParserVisitor<? extends T>)visitor).visitMonth(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MonthContext month() throws RecognitionException {
		MonthContext _localctx = new MonthContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_month);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101); match(NUMBER);
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

	public static class YearContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(NetworkParserParser.NUMBER, 0); }
		public YearContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_year; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParserListener ) ((NetworkParserListener)listener).enterYear(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParserListener ) ((NetworkParserListener)listener).exitYear(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NetworkParserVisitor ) return ((NetworkParserVisitor<? extends T>)visitor).visitYear(this);
			else return visitor.visitChildren(this);
		}
	}

	public final YearContext year() throws RecognitionException {
		YearContext _localctx = new YearContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_year);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103); match(NUMBER);
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

	public static class HourContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(NetworkParserParser.NUMBER, 0); }
		public HourContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hour; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParserListener ) ((NetworkParserListener)listener).enterHour(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParserListener ) ((NetworkParserListener)listener).exitHour(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NetworkParserVisitor ) return ((NetworkParserVisitor<? extends T>)visitor).visitHour(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HourContext hour() throws RecognitionException {
		HourContext _localctx = new HourContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_hour);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105); match(NUMBER);
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

	public static class MinuteContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(NetworkParserParser.NUMBER, 0); }
		public MinuteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParserListener ) ((NetworkParserListener)listener).enterMinute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParserListener ) ((NetworkParserListener)listener).exitMinute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NetworkParserVisitor ) return ((NetworkParserVisitor<? extends T>)visitor).visitMinute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MinuteContext minute() throws RecognitionException {
		MinuteContext _localctx = new MinuteContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_minute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107); match(NUMBER);
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

	public static class SecondsContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(NetworkParserParser.NUMBER, 0); }
		public SecondsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seconds; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParserListener ) ((NetworkParserListener)listener).enterSeconds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParserListener ) ((NetworkParserListener)listener).exitSeconds(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NetworkParserVisitor ) return ((NetworkParserVisitor<? extends T>)visitor).visitSeconds(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SecondsContext seconds() throws RecognitionException {
		SecondsContext _localctx = new SecondsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_seconds);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109); match(NUMBER);
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

	public static class MilisecondsContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(NetworkParserParser.NUMBER, 0); }
		public MilisecondsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_miliseconds; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParserListener ) ((NetworkParserListener)listener).enterMiliseconds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParserListener ) ((NetworkParserListener)listener).exitMiliseconds(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NetworkParserVisitor ) return ((NetworkParserVisitor<? extends T>)visitor).visitMiliseconds(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MilisecondsContext miliseconds() throws RecognitionException {
		MilisecondsContext _localctx = new MilisecondsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_miliseconds);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111); match(NUMBER);
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

	public static class ToContext extends ParserRuleContext {
		public TerminalNode IPV4ADR() { return getToken(NetworkParserParser.IPV4ADR, 0); }
		public ToContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_to; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParserListener ) ((NetworkParserListener)listener).enterTo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParserListener ) ((NetworkParserListener)listener).exitTo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NetworkParserVisitor ) return ((NetworkParserVisitor<? extends T>)visitor).visitTo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ToContext to() throws RecognitionException {
		ToContext _localctx = new ToContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_to);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113); match(IPV4ADR);
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

	public static class FromContext extends ParserRuleContext {
		public TerminalNode IPV4ADR() { return getToken(NetworkParserParser.IPV4ADR, 0); }
		public FromContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParserListener ) ((NetworkParserListener)listener).enterFrom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParserListener ) ((NetworkParserListener)listener).exitFrom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NetworkParserVisitor ) return ((NetworkParserVisitor<? extends T>)visitor).visitFrom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromContext from() throws RecognitionException {
		FromContext _localctx = new FromContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_from);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115); match(IPV4ADR);
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
		enterRule(_localctx, 30, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117); ipv4();
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
		enterRule(_localctx, 32, RULE_ipv4);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119); match(9);
			setState(120); tag();
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
		enterRule(_localctx, 34, RULE_tag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122); match(12);
			setState(123); match(HEXNUMBER);
			setState(124); match(25);
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
		enterRule(_localctx, 36, RULE_length);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126); match(2);
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

	public static class Ipv4contentContext extends ParserRuleContext {
		public DumplineContext dumpline(int i) {
			return getRuleContext(DumplineContext.class,i);
		}
		public ToContext to() {
			return getRuleContext(ToContext.class,0);
		}
		public FromContext from() {
			return getRuleContext(FromContext.class,0);
		}
		public ProtinfoContext protinfo() {
			return getRuleContext(ProtinfoContext.class,0);
		}
		public Ipv4fieldsContext ipv4fields() {
			return getRuleContext(Ipv4fieldsContext.class,0);
		}
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
		enterRule(_localctx, 38, RULE_ipv4content);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129); ipv4fields();
			setState(130); to();
			setState(131); match(20);
			setState(132); from();
			setState(133); match(17);
			setState(134); protinfo();
			setState(136); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(135); dumpline();
				}
				}
				setState(138); 
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
		enterRule(_localctx, 40, RULE_ipv4fields);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140); match(12);
			setState(141); ipv4tos();
			setState(142); match(13);
			setState(143); ipv4ttl();
			setState(144); match(13);
			setState(145); ipv4id();
			setState(146); match(13);
			setState(147); ipv4offset();
			setState(148); match(13);
			setState(149); ipv4flags();
			setState(150); match(13);
			setState(151); ipv4proto();
			setState(152); match(13);
			setState(153); length();
			setState(154); match(25);
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
		enterRule(_localctx, 42, RULE_ipv4tos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156); match(8);
			setState(157); match(HEXNUMBER);
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
		enterRule(_localctx, 44, RULE_ipv4ttl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159); match(1);
			setState(160); match(NUMBER);
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
		enterRule(_localctx, 46, RULE_ipv4id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162); match(3);
			setState(163); match(NUMBER);
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
		enterRule(_localctx, 48, RULE_ipv4offset);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165); match(7);
			setState(166); match(NUMBER);
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
		enterRule(_localctx, 50, RULE_ipv4flags);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168); match(11);
			setState(169); match(18);
			setState(170); flagvalues();
			setState(171); match(19);
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
		enterRule(_localctx, 52, RULE_flagvalues);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 4) | (1L << 5) | (1L << 10) | (1L << 16) | (1L << 21) | (1L << 23))) != 0)) ) {
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
		public TerminalNode PROTO() { return getToken(NetworkParserParser.PROTO, 0); }
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
		enterRule(_localctx, 54, RULE_ipv4proto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175); match(PROTO);
			setState(176); protname();
			setState(177); match(12);
			setState(178); match(NUMBER);
			setState(179); match(25);
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
		enterRule(_localctx, 56, RULE_protname);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 14) | (1L << 22) | (1L << 27))) != 0)) ) {
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
		enterRule(_localctx, 58, RULE_protinfo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183); protname();
			setState(184); match(13);
			setState(185); length();
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
		enterRule(_localctx, 60, RULE_dumpline);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(187); match(HEXNUMBER);
			setState(188); match(17);
			setState(190); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(189);
					matchWildcard();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(192); 
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\'\u00c5\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\7\2B\n\2\f\2\16\2E\13\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3"+
		"\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3"+
		"\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\6\25\u008b\n\25\r\25\16\25"+
		"\u008c\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \6 \u00c1\n \r \16 \u00c2\3 \3"+
		"\u00c2!\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:"+
		"<>\2\4\7\2\6\7\f\f\22\22\27\27\31\31\6\2\b\b\20\20\30\30\35\35\u00a8\2"+
		"C\3\2\2\2\4F\3\2\2\2\6J\3\2\2\2\bU\3\2\2\2\n[\3\2\2\2\fc\3\2\2\2\16e\3"+
		"\2\2\2\20g\3\2\2\2\22i\3\2\2\2\24k\3\2\2\2\26m\3\2\2\2\30o\3\2\2\2\32"+
		"q\3\2\2\2\34s\3\2\2\2\36u\3\2\2\2 w\3\2\2\2\"y\3\2\2\2$|\3\2\2\2&\u0080"+
		"\3\2\2\2(\u0083\3\2\2\2*\u008e\3\2\2\2,\u009e\3\2\2\2.\u00a1\3\2\2\2\60"+
		"\u00a4\3\2\2\2\62\u00a7\3\2\2\2\64\u00aa\3\2\2\2\66\u00af\3\2\2\28\u00b1"+
		"\3\2\2\2:\u00b7\3\2\2\2<\u00b9\3\2\2\2>\u00bd\3\2\2\2@B\5\4\3\2A@\3\2"+
		"\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2D\3\3\2\2\2EC\3\2\2\2FG\5\b\5\2GH\5"+
		"\n\6\2HI\5\6\4\2I\5\3\2\2\2JK\5\f\7\2KL\7\26\2\2LM\5\f\7\2MN\7\17\2\2"+
		"NO\7\32\2\2OP\5 \21\2PQ\7\17\2\2QR\5&\24\2RS\7\23\2\2ST\5(\25\2T\7\3\2"+
		"\2\2UV\5\22\n\2VW\7\34\2\2WX\5\20\t\2XY\7\34\2\2YZ\5\16\b\2Z\t\3\2\2\2"+
		"[\\\5\24\13\2\\]\7\23\2\2]^\5\26\f\2^_\7\23\2\2_`\5\30\r\2`a\7\21\2\2"+
		"ab\5\32\16\2b\13\3\2\2\2cd\7\37\2\2d\r\3\2\2\2ef\7\36\2\2f\17\3\2\2\2"+
		"gh\7\36\2\2h\21\3\2\2\2ij\7\36\2\2j\23\3\2\2\2kl\7\36\2\2l\25\3\2\2\2"+
		"mn\7\36\2\2n\27\3\2\2\2op\7\36\2\2p\31\3\2\2\2qr\7\36\2\2r\33\3\2\2\2"+
		"st\7%\2\2t\35\3\2\2\2uv\7%\2\2v\37\3\2\2\2wx\5\"\22\2x!\3\2\2\2yz\7\13"+
		"\2\2z{\5$\23\2{#\3\2\2\2|}\7\16\2\2}~\7#\2\2~\177\7\33\2\2\177%\3\2\2"+
		"\2\u0080\u0081\7\4\2\2\u0081\u0082\7\36\2\2\u0082\'\3\2\2\2\u0083\u0084"+
		"\5*\26\2\u0084\u0085\5\34\17\2\u0085\u0086\7\26\2\2\u0086\u0087\5\36\20"+
		"\2\u0087\u0088\7\23\2\2\u0088\u008a\5<\37\2\u0089\u008b\5> \2\u008a\u0089"+
		"\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d"+
		")\3\2\2\2\u008e\u008f\7\16\2\2\u008f\u0090\5,\27\2\u0090\u0091\7\17\2"+
		"\2\u0091\u0092\5.\30\2\u0092\u0093\7\17\2\2\u0093\u0094\5\60\31\2\u0094"+
		"\u0095\7\17\2\2\u0095\u0096\5\62\32\2\u0096\u0097\7\17\2\2\u0097\u0098"+
		"\5\64\33\2\u0098\u0099\7\17\2\2\u0099\u009a\58\35\2\u009a\u009b\7\17\2"+
		"\2\u009b\u009c\5&\24\2\u009c\u009d\7\33\2\2\u009d+\3\2\2\2\u009e\u009f"+
		"\7\n\2\2\u009f\u00a0\7#\2\2\u00a0-\3\2\2\2\u00a1\u00a2\7\3\2\2\u00a2\u00a3"+
		"\7\36\2\2\u00a3/\3\2\2\2\u00a4\u00a5\7\5\2\2\u00a5\u00a6\7\36\2\2\u00a6"+
		"\61\3\2\2\2\u00a7\u00a8\7\t\2\2\u00a8\u00a9\7\36\2\2\u00a9\63\3\2\2\2"+
		"\u00aa\u00ab\7\r\2\2\u00ab\u00ac\7\24\2\2\u00ac\u00ad\5\66\34\2\u00ad"+
		"\u00ae\7\25\2\2\u00ae\65\3\2\2\2\u00af\u00b0\t\2\2\2\u00b0\67\3\2\2\2"+
		"\u00b1\u00b2\7$\2\2\u00b2\u00b3\5:\36\2\u00b3\u00b4\7\16\2\2\u00b4\u00b5"+
		"\7\36\2\2\u00b5\u00b6\7\33\2\2\u00b69\3\2\2\2\u00b7\u00b8\t\3\2\2\u00b8"+
		";\3\2\2\2\u00b9\u00ba\5:\36\2\u00ba\u00bb\7\17\2\2\u00bb\u00bc\5&\24\2"+
		"\u00bc=\3\2\2\2\u00bd\u00be\7#\2\2\u00be\u00c0\7\23\2\2\u00bf\u00c1\13"+
		"\2\2\2\u00c0\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c2"+
		"\u00c0\3\2\2\2\u00c3?\3\2\2\2\5C\u008c\u00c2";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}