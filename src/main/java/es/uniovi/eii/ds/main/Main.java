package es.uniovi.eii.ds.main;

import java.util.*;

import es.uniovi.eii.ds.interpreter.*;
import es.uniovi.eii.ds.interpreter.ast.*;

public class Main {

	public static void main(String[] args) {

		/*
		    read width;
		    read height;
		    area = height * width / 2;
		    print area + 10;
		 */

		// Build the AST for the program above
		List<Statement> statements = new ArrayList<>();
		statements.add(new Read(new Variable("width"))); // read width;
		statements.add(new Read(new Variable("height"))); // read height;

		// area = height * width / 2;
		Product prod = new Product(new Variable("height"), new Variable("width"));
		statements.add(new Assignment(new Variable("area"), new Division(prod, new IntegerLiteral("2"))));

		// print area + 10;
		statements.add(new Print(new Sum(new Variable("area"), new IntegerLiteral("10"))));
		Program program = new Program(statements);

		System.out.println("\n--- Recursive printing");
		RecursivePrint recursivePrint = new RecursivePrint();
		recursivePrint.visit(program);

		// ! This version does not compile
		System.out.println("\n--- Ideal version (does not compile)");
		// IdealPrint idealPrint = new IdealPrint();
		// idealPrint.visit(program);

		// ? TO DO (1): Implement the Visitor pattern to make this work
		System.out.println("\n--- Printing with Visitor");
		// Visitor printVisitor = new PrintVisitor();
		// program.accept(printVisitor, null);

		// ? TO DO (2): Once you have printed the program, interpret it
		// ?           (create a new visitor to execute the program)
		// System.out.println("\n--- Execution");

		// ...
	}
}