package es.uniovi.eii.ds.interpreter.ast;

public class Print implements Statement {

	public Expression expression;

	public Print(Expression expression) {
		this.expression = expression;
	}
}
