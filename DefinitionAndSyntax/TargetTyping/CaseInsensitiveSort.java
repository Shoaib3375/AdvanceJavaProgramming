package DefinitionAndSyntax.TargetTyping;

import java.util.*;

public class CaseInsensitiveSort {

	public static void main(String[] args) {
		// Sample list of strings
		List<String> names = Arrays.asList("Banana", "apple", "Orange", "grape", "Apple");

		// Create a comparator using lambda that ignores case
		Comparator<String> comparator = String::compareToIgnoreCase;

		// Sort the list using the comparator
		names.sort(comparator);

		// Print the sorted list
		System.out.println("Sorted list (case-insensitive):");
		for (String name : names) {
			System.out.println(name);
		}
	}
}
