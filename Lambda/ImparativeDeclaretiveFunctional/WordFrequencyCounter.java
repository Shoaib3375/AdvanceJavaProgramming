package Lambda.ImparativeDeclaretiveFunctional;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordFrequencyCounter {
	static Map<String,Long> countFrequency(List<String> words){
		Map<String, Long> frequencyMap =  new HashMap<>();
//		for (String word : words){
//			if(!frequencyMap.containsKey(word)){
//				frequencyMap.put(word,0L);
//			}
//			frequencyMap.compute(word, (k, oldCound) -> oldCound + 1);
//		}
//		return frequencyMap;
		for (String word :words){
			frequencyMap.merge(word,1L, Long::sum);
		}
		return frequencyMap;
	}

	public static void main(String[] args) {
		List<String> words = Arrays.asList("Hello", "World","Bangladesh", "Dhaka", "Hello", "Java", "Lambda");
		Map<String, Long> wordFrequency = countFrequency(words);
		System.out.println(wordFrequency);
	}
}
