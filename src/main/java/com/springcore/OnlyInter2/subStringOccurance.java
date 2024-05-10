package com.springcore.OnlyInter2;

import java.util.LinkedHashMap;
import java.util.Map;

public class subStringOccurance {

	public static void main(String[] args) {

		String input = "abcaabcabcaabbabcaa";
		// find the occurence of abc ,bca, aa
		Map<String, Integer> sequenceCount = new LinkedHashMap<String, Integer>();

		// Iterate over the string and count occurrences of each sequence
		for (int i = 0; i < input.length() - 2; i++) {
			String sequence = input.substring(i, i + 3); // Extract a sequence of length 3
			if (sequence.equals("bca") || sequence.equals("abc"))
				sequenceCount.put(sequence, sequenceCount.getOrDefault(sequence, 0) + 1);

		}

		for (int i = 0; i < input.length() - 1; i++) {

			String sequence1 = input.substring(i, i + 2); // Extract a sequence of length 2
			if (sequence1.equals("aa"))
				sequenceCount.put(sequence1, sequenceCount.getOrDefault(sequence1, 0) + 1);
		}

		// Print the counts of all sequences
		for (Map.Entry<String, Integer> entry : sequenceCount.entrySet()) {

			System.out.println(entry.getKey() + " - " + entry.getValue() + " times");
		}

	}

}
