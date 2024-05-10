package com.springcore.test.intervw;

public class PrintEvenLengthWord {
	
	
	public static void PrintEvenLength(String str) {
		String[] arr=str.split(" ");
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i].length()%2==0) {
				System.out.print(arr[i]+" "+arr[i].length()+" \n");
			}
			}
	}

	public static void main(String[] args) {
		String str="hell world dip xxxx xx";
		PrintEvenLength(str);

	}

}
