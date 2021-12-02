package com.sonata;

public class OvaltoDollar {
	public static void main(String[] args) {

		String st = "abcdefghijklmnopqrstuvwxyz";

		char ch[]=st.toCharArray();
		for (int i = 0; i < ch.length; i++)
		{
			if (ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
			{
			ch[i]='$';
			}
			}
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
			}
			}
		}

