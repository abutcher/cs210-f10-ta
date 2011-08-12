package edu.wvu.mix.abutcher.Statement;

import java.io.IOException;
import java.util.regex.Pattern;

import jline.ConsoleReader;

import edu.wvu.mix.abutcher.*;

import antlr.RecognitionException;

public abstract class CS210_Tester implements Statement {
	public static void main(String[] args) throws RecognitionException,
			org.antlr.runtime.RecognitionException, IOException {

		ConsoleReader reader = new ConsoleReader();
		reader.setBellEnabled(false);
	
		String prompt = "$> ";
		String line;
		String fullLine = "";
		
		while ((line = reader.readLine(prompt)) != null) {
			if (!Pattern.matches(".*;$", line)) {
				fullLine += line.replace('\n', ' ') + " ";
				prompt = "> ";
				continue;
			} else {
				fullLine += line + " ";
			}
			
			Statement result = Evaluator.Evaluate(fullLine);
			System.out.println("This is a grammatically correct \'" + result.toString() + "\' statement.");
			result.operation();
			
			fullLine = "";
			prompt = "$> ";
		}
	}
}
