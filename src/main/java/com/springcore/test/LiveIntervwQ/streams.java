package com.springcore.test.LiveIntervwQ;

import java.util.stream.Collectors;
import java.util.*;

public class streams {

	static void VowelFider() {
		// Find Vowel Count in String using Java 8
		String str = "dipak Apaul DIaoPAK";

		// List<Character> vowel = Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I',
		// 'O', 'U');
		// We can also apply filer with list like filter(vowel::contains)

		long vowelcount = str.chars().mapToObj(c -> (char) c).filter(e -> "aeiouAEIOU".contains(e.toString())).count();

		Map<Character, Long> charCounts = str.chars().mapToObj(c -> (char) c)
				.filter(e -> "aeiouAEIOU".contains(e.toString()))
				.collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		charCounts.forEach((c, count) -> System.out.println(c + ": " + count));

		System.out.print("No of vowel : " + vowelcount);
	}

	static void FilterEvenAndDoSqaure() {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

		List<Integer> evenNum = list.stream().filter(n -> n % 2 == 0).map(n -> n * n).collect(Collectors.toList());
		System.out.print(evenNum);
	}

	static void SumOfSquare() {
		List<Integer> list = Arrays.asList(1, 2, 3, 4);

		int sumSqr = list.stream().mapToInt(n -> n * n).sum();
		System.out.print(sumSqr);

		// List<Integer> pp= list.stream().map(n->n*n).collect(Collectors.toList());
		// System.out.print(pp);

	}

	static void sortList() {
		List<String> list = Arrays.asList("rrrr", "wwwww", "aaaa", "bbbb");

		List<String> sortedList = list.stream().sorted().collect(Collectors.toList());
		System.out.print(sortedList);
	}

	static void DoubleEachElement() {
		List<Integer> list = Arrays.asList(1, 2, 3, 4);

		List<Integer> list2 = list.stream().map(n -> n * n).collect(Collectors.toList());
		System.out.print(list2);
	}

	static void FindDistinctElement() {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 1, 2);

		List<Integer> list2 = list.stream().distinct().collect(Collectors.toList());
		System.out.print(list2);
	}

	static void GroupByLength() {
		List<String> list = Arrays.asList("rrrr", "wwwww", "aaaa", "bbbb");

		Map<Integer, List<String>> group = list.stream().collect(Collectors.groupingBy(String::length));
		System.out.print(group);
	}

	static void RemoveElementWithStream() {
		List<String> list = Arrays.asList("rrzzrr", "wwwww", "aazzaa", "bbbb");
		String zz = "zz";
		List<String> group = list.stream().filter(w -> !w.contains(zz)).collect(Collectors.toList());
		System.out.print(group);
	}

	static void JointListWithStream() {
		List<String> list = Arrays.asList("dipak", "kumar", "paul");

		String JoinString = list.stream().collect(Collectors.joining(", "));
		System.out.println(JoinString);
	}

	static void SquareOfEvenElement() {
		List<Integer> list = Arrays.asList(1, 2, 3, 4);

		List<Integer> list2 = list.stream().filter(t -> t % 2 == 0).map(t -> t * t).collect(Collectors.toList());
		System.out.print(list2);
		int sum = list.stream().filter(t -> t % 2 == 0).mapToInt(t -> t * t).sum();
		System.out.print(sum);

	}

	static boolean RecursivePalindrome(int i, int j, String str) {
		if (i >= j) {
			return true;
		}
		if (str.charAt(i) != str.charAt(j)) {
			return false;
		}
		i++;
		j--;
		return RecursivePalindrome(i, j, str);
	}

	static void Unique_Intersection() {
		int[] first = { 1, 2, 3, 4, 5 };
		int[] sec = { 4, 5, 6, 7, 8 };
		List<Integer> l1 = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> l2 = Arrays.asList(4, 5, 6, 7, 8);

		Arrays.stream(first).filter(x -> Arrays.stream(sec).anyMatch(y -> y == x)).distinct()
				.forEach(System.out::println);

		l1.stream().filter(x -> l2.stream().anyMatch(y -> y == x)).distinct().forEach(System.out::println);
	}

	static void charOccurence() {
		String st = "xxxxx xxx dipak";
		String str = st.replaceAll("\\s", "");
		Map<String, Long> map = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(s -> s, Collectors.counting()));
		System.out.print(map);
	}

	static void wordOccurence() {
		String str = "dipak kamar paul paul";
		String[] word = str.split(" ");
		long count = Arrays.stream(word).filter(w -> w.equals("paul")).count();
		System.out.print(count);

		Map<String, Long> map = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(s -> s, Collectors.counting()));
		System.out.print(map);

	}

	static void find2ndHighestElement() {
		List<Integer> first = Arrays.asList(1, 2, 3, 4, 5);

		Optional<Integer> optional = first.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();

		System.out.print(optional);

		//print alternative
		String str = "abcdefghijkl";

		str.chars().filter(i -> i % 2 == 0).forEach(i -> System.out.print((char) i));

	}

	public static void main(String[] args) {
		// VowelFider();
		// FilterEvenAndDoSqaure();
		// SumOfSquare();
		// sortList();
		// DoubleEachElement();
		// FindDistinctElement();
		// GroupByLength();
		// RemoveElementWithStream();
		// JointListWithStream();
		// SquareOfEvenElement();
		// Unique_Intersection();
		// charOccurence();
		// wordOccurence();
		find2ndHighestElement();

		String st = "abrba";
		// System.out.print(RecursivePalindrome(0,st.length()-1,st));

	}

}
