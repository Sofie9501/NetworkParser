package compiler;

import compiler.Exceptions.CompilerError;
import compiler.Exceptions.ParseError;
import compiler.Exceptions.TypeCheckerException;
import compiler.IR.IR;
import compiler.Phases.Frontend;

public class Compiler {

	private static String filename;
	private static String outputfilename;
		
	private static boolean debug;
	
	private static String[] arguments={ "" };
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Compiler c = new Compiler(args);
			IR ir = c.generateIR();
			c.analyseIR(ir);
			
//			c.generateCode(ir);
			
		} 
		catch (CompilerError e) {
			System.err.println(e.getMessage());
			System.exit(-1);
		}
	}

	public Compiler(String[] args) throws CompilerError {
		//
		// here we should inspect the arguments
		//

		if (args.length==0) {
			help();
		}

		filename = null;
		debug = true;

		for (int i=0;i<args.length;i++) {
			String arg = args[i];
			if (arg.charAt(0)!='-') {

				//
				// store the filename
				//

				filename = args[i];
				outputfilename = filename.substring(0, filename.lastIndexOf('.'))+".asm";
			} else {
				if (arg.equals("-v")) {
					debug=true;
					continue;
				}
				if (arg.equals("-o")) {

					if (i==args.length) {
						throw new CompilerError("argument for -o is missing");
					}
					
					outputfilename = args[i++];
					continue;
				}
				if (arg.equals("--")) {
					// from here on the arguments should go to the program
					
					Compiler.arguments = new String[(args.length - i - 1)];
					for (int ai = i+1; ai<args.length; ai++) {
						Compiler.arguments[ai-i-1] = args[ai];
					}
					break;
				}
			}
		}
		
		if (filename == null) {
			throw new CompilerError("No filename specified");
		}

	}

	public IR generateIR() throws CompilerError
	{
		IR ir=null;
		
		System.out.print("Parsing... ");

		try {
			ir = Frontend.parse(filename);
		} catch (ParseError e) {
			throw new CompilerError("Parse Error: "+e.getMessage());
		}
		
		System.out.println("done.");

		if (isDebug()) {
			PrettyPrint.print(ir);
		}
				
		System.out.println("done.");
		
		return ir;
	}

	public void analyseIR(IR ir) throws CompilerError
	{		
		System.out.println("Analysing... ");

		try {
			IPCounter.print(ir);
			IntrusionAnalyser.analyse(ir);
			IntrusionAnalyserV2.analyse(ir);
			
		} catch (Exception e) {
			throw new CompilerError("Exception "+ e.getMessage());
		}

		System.out.println("done.");				
	}
	
//	public void generateCode(IR ir) throws CompilerError
//	{
//				
//		System.out.println("Generating code... ");
//
//		try {
//			Backend.generateCode(ir);
//		} catch (CodeGenException e) {
//			throw new CompilerError("CodeGenError "+e.getMessage());
//		}
//		
//		System.out.println("done.");
//	}
//	
	private void help() {
		
		System.err.println("\n");
		System.err.println("MiniJava compiler\n");
		System.err.println("====================\n\n");
		System.err.println("Invoke with \"java -jar path/to/jar/file \" or via GUI.");
		System.err.println("arguments: [-v] filename\n\n");
		System.err.println("  -v            be verbose\n");
		System.err.println("  filename      source filename\n");
		System.exit(-1);
	}

	public static String getFilename() {
		return filename;
	}

	public static String getOutputfilename() {
		return outputfilename;
	}

	public static String[] getArguments() {
		return arguments;
	}

	public static boolean isDebug() {
		return debug;
	}
	
}
