package edu.wvu.mix.abutcher.Statement;

public class ExitStatement implements Statement {
	@Override
	public String toString() {
		return "EXIT";
	}
	
	@Override
	public void operation() {
		System.exit(0);
	}
}
