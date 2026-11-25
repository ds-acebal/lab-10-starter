package es.uniovi.eii.ds.interpreter.ast;

public class IntegerLiteral implements Expression {
	
	public String value;

	public IntegerLiteral(String value) {
		this.value = value;
	}
}
