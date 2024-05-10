package com.springcore.test.practice;

import java.util.Arrays;

public class test3 {
	
	public static int compareVersions(String a, String b) 
    {
		
		System.out.println(a+"     "+b);
        //StringBuilder w1=new StringBuilder();
        String[] w1=a.split(".");
        for(int i=0;i<w1.length;i++) {
        	System.out.println(w1[i]);
        }
        
        String w2=Arrays.toString(b.split("."));
        int flag=0,flag2=0;
        //if(w1.length()==w2.length()){
       //     flag=1;
       // }
        //System.out.println(w1);
       // System.out.println(w1);
       // System.out.println(w2);
        //System.out.println("cc"+w1.compareTo(w2)+"cc");
        //if(w1.compareTo(w2)==0) flag2=1;

        if(flag2==1 && flag==1) return 1;
        else return 0;
    }

	public static void main(String[] args) {
		compareVersions("a.df.er","a.dfer");

	}

}
