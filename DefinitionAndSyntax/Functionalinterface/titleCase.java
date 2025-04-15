package DefinitionAndSyntax.Functionalinterface;

public class titleCase {
	Converter titleCaseConverter = (String s)->{
		StringBuilder sb = new StringBuilder();
		boolean nextTitleCase = true;
		for(char c : s.toCharArray()) {
			if(Character.isSpaceChar(c)) {
				nextTitleCase = true;
			} else if (nextTitleCase) {
				c = Character.toTitleCase(c);
				nextTitleCase = false;
			}
			sb.append(c);
		}
		return sb.toString();
	};
	public String convertToTitleCase(String input) {
		return titleCaseConverter.apply(input);
	}

	public static void main(String[] args) {
		titleCase titleCaseInstance = new titleCase();
		String testInput = "this is a test string";
		String result = titleCaseInstance.convertToTitleCase(testInput);
		System.out.println("Input: " + testInput);
		System.out.println("Output: " + result);
	}

}
