package com.springcore.test.practice;

import java.util.*;

public class test {

	static void FirstNoreapatChar(String str) {

		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		for (int i = 0; i < str.length(); i++) {
			map.put(str.charAt(i), map.containsKey(str.charAt(i)) ? map.get(str.charAt(i)) + 1 : 1);
		}

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				System.out.print(entry.getKey());
			}
		}
		// throw new RuntimeException("did not find any non repeated character");
	}

	static void ComparetwoArray(char[] arr1, char[] arr2) {
		int flag = 0;
		if (arr1.length != arr2.length)
			System.out.print("length not equal");
		else {
			System.out.println("length equal");

			for (int i = 0; i < arr1.length; i++) {
				if (arr1[i] != arr2[i]) {
					System.out.println("not equal");
					flag = 1;
					break;

				}

			}
			if (flag == 0)
				System.out.println("all char equal");

		}

	}

	static void removeDuplicate(String arr2) {
		char[] arr3 = arr2.toCharArray();
		Set<Character> set = new HashSet<Character>();

		for (int i = 0; i < arr3.length; i++) {
			set.add(arr3[i]);
		}
		char[] arr4 = new char[arr3.length];
		int j = 0;

		for (Character c : set) {
			arr4[j++] = c;

		}

		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr4[i] + " ");
		}

	}

	static void checkArray(char[] carr) {
		for (int i = 0; i < carr.length; i++) {
			char c = carr[i];
			if ((int) c >= 65 && (int) c <= 90 || (int) c >= 97 && (int) c <= 122) {
				// System.out.print(c+" ");
			}

			else {
				// System.out.print(Integer.valueOf(carr[i])-48+" ");
				System.out.print(carr[i] + " ");
			}

			// altenative
			if (Character.isDigit(c)) {
				System.out.print(carr[i] + " ");
			}

		}
	}

	static void countOccurance(String str, char chr) {

		System.out.print(str.chars().filter(ch -> ch == chr).count());

	}

	static void removeSpace(String str) {
		StringBuilder str1 = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				str1.append(str.charAt(i));
			}
		}
		System.out.print(str1);

	}

	static void OnlyDigitString() {
		Scanner sc = new Scanner(System.in);
		String[] sarr = new String[3];

		for (int i = 0; i < 3; i++) {
			sarr[i] = sc.next();
		}

		for (int i = 0; i < sarr.length; i++) {
			char[] ch = sarr[i].toCharArray();
			for (int j = 0; j < ch.length; j++) {

				if (Character.isDigit(ch[j])) {
					System.out.println(sarr[i]);
					break;

				}
			}
		}

	}

	static void checkContain(String s1, String s2) {
		if (s1.contains(s2)) {
			System.out.print(true);
		} else
			System.out.print(false);

		// alternative method
		int j = 0;
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) == s2.charAt(j)) {
				int k = i, len = 0;
				for (int p = 0; p < s2.length(); p++) {
					if (s1.charAt(k) == s2.charAt(p)) {
						len++;
						k++;

					}
					if (len == s2.length()) {
						System.out.print(" match");
						break;
					}
				}
			}
		}

	}

	static void removeCharacter(String str, char c) {
		char[] ch = str.toCharArray();
		StringBuilder st = new StringBuilder();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] != c) {
				st.append(ch[i]);
			}
		}
		System.out.print(st);
	}

	static void mostRepeatedCharacter(String str) {
		int maxVal = 0;
		char maxKey='a';
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		
		for (int i = 0; i < str.length(); i++) {

			if (map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
				if (maxVal < map.get(str.charAt(i))) {
					maxKey = str.charAt(i);
					maxVal = map.get(str.charAt(i));

				}
			} else {
				map.put(str.charAt(i), 1);
			}

		}

		System.out.print(maxKey+" "+maxVal);
		// throw new RuntimeException("did not find any non repeated character");
	}
	
	
	static void TwoSum() {
		int nums[]= {3,2,4,3};
		int target=6;
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		int n=nums.length;
		for(int i=0;i<n;i++) {
			int com=target-nums[i];
			if(map.containsKey(com)) {
				System.out.println(map.get(com));;
			}
			//System.out.println(map.get(com));;
			map.put(nums[i], i);
		}
	}

	public static void main(String[] args) {
		String str = "aasddfee";
		// FirstNoreapatChar(str);

		char[] arr1 = { 'a', 'b', 'c', 'd', 'e', 'o' };
		char[] arr2 = { 'a', 'b', 'c', 'd', 'e' };

		// ComparetwoArray(arr1, arr2);

		String arr3 = "abcdee";
		// removeDuplicate(arr3);

		// contain array number or not

		char[] carr = { 'a', '2', '4', 'D', '0', '9' };
		// checkArray(carr);

		// top 2 number
		String st2 = "DIPAK PAUL";
		// countOccurance(st2, 'D');

		String st33 = "dipak  paul kumar ";
		// removeSpace(st33);

		// OnlyDigitString();

		String st55 = "3";
		// System.out.print(Integer.parseInt(st55));
		int g = 5;
		// System.out.print(String.valueOf(g));

		// checkContain("dipakfpak", "pal");

		String arr7 = "abcdee";
		// removeCharacter(arr7,'d');

		String arr8 = "abcdeefye";
		//mostRepeatedCharacter(arr8);
		
		TwoSum();

	}

}
