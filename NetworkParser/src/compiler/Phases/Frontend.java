package compiler.Phases;

import java.io.IOException;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.tree.ParseTree;

import compiler.Exceptions.CompilerError;
import compiler.Exceptions.ParseError;
import compiler.Frontend.NetworkParserLexer;
import compiler.Frontend.NetworkParserParser;
import compiler.IR.IR;
import compiler.IR.IRBuilder;
import compiler.IR.NPEntries;

public class Frontend {

	public static IR parse(String filename) throws ParseError, CompilerError {
		
		ParseTree parseTree = null;
		
		try{
			
			// open the input file
			CharStream input = new ANTLRFileStream(filename);
			
			// create a lexer/scanner
			NetworkParserLexer lex = new NetworkParserLexer(input);
			
			// get the stream of tokens from the scanner
			CommonTokenStream tokens = new CommonTokenStream(lex);
			
			// create a parser
			NetworkParserParser parser = new NetworkParserParser(tokens);
			
			// and parse
			parseTree = parser.entries();
			
			// if we found errors, throw an exception
			if (parser.getNumberOfSyntaxErrors()>0) {
				throw new ParseError("Found "+parser.getNumberOfSyntaxErrors()+" error" + 
						((parser.getNumberOfSyntaxErrors()>1)?"s":"") +".");
			}
		} catch (IOException e) {
			throw new CompilerError(e.getMessage());
		} catch (RecognitionException e) {
			throw new ParseError(e.getMessage());
		}
		
		IRBuilder builder = new IRBuilder();
		
		return new IR((NPEntries)builder.visit(parseTree));
		
	}
}
