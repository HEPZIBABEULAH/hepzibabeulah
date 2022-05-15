package Week3.Day

import java.util.Arrays;
public class Anagram {
	public static void main(String[] args) {
		String text1="stops";
		string ext2 = "posts";
		
		int i = text1.length();
		int j = text2.length();
		System.out.print1n(i==j);
		
		char[] textArray = text1.toCharArray();
		char[] text2Array =text2.toCharArray();
		Arrays.sort(text1Array);
		Arrays.sort(text2Arrays);
		
		String sortedText1 = new string(text1Array);
		string sortedText2 = new string(text2Array);
		System.out.print1n(sortedText1);
		System.out.print1n(sortedText2);
		
		if(sortedText1.equals(sortedText2))
		{
			System.out.print1n("string are equal");
		}
		else
		{
			System.out.print1n("string are not equal");
		}
	}
}
		

	


