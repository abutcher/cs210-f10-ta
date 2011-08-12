package edu.wvu.mix.abutcher;

import java.io.IOException;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

import edu.wvu.mix.abutcher.Statement.Statement;

public class Evaluator {
	Statement st;

	public Evaluator(String string) throws RecognitionException, IOException {
		CharStream stream = new ANTLRStringStream(string);
		CS210_V1Lexer lexer = new CS210_V1Lexer(stream);
		
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		CS210_V1Parser parser = new CS210_V1Parser(tokens);			
		this.st = parser.rule();
	}
	
	public Statement getSt() {
		return st;
	}
	
	public static Statement Evaluate(String string) throws RecognitionException, IOException {
		return new Evaluator(string).getSt();
	}
}
