package edu.wvu.mix.abutcher.Statement;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

import org.antlr.runtime.RecognitionException;

import edu.wvu.mix.abutcher.Evaluator;

public class ReadStatement implements Statement {

	public ReadStatement(String string) throws IOException, RecognitionException {
		FileReader infile = new FileReader(string.replaceAll("[\'\"]", ""));
		BufferedReader buffer = new BufferedReader(infile);
		
		String line;
		String fullLine = "";
		
		while ((line = buffer.readLine()) != null) {
			if (!Pattern.matches(".*;$", line)) {
				fullLine += line.replace('\n', ' ') + " ";
				continue;
			} else {
				fullLine += line + " ";
			}
			
			Statement result = Evaluator.Evaluate(fullLine);
			System.out.println("This is a grammatically correct \'" + result.toString() + "\' statement.");
			result.operation();
			fullLine = "";
		}
	}

	@Override
	public String toString() {
		return "READ";
	}

	@Override
	public void operation() {
		// TODO Auto-generated method stub

	}
}