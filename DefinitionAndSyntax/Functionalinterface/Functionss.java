package DefinitionAndSyntax.Functionalinterface;



public class Functionss {
	public static void main(String[] args) {
		Converter uppercaseConverter = String::toUpperCase;
		String hello = uppercaseConverter.apply("Hello");
		System.out.println(hello);
	}
}

