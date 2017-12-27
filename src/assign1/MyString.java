package assign1;

import java.nio.channels.NonWritableChannelException;
import java.util.ArrayList;
import java.util.HashSet;

import javax.print.attribute.PrintJobAttributeSet;

public class MyString {

	public static void main(String[] args) {
		String string = "aacca";
		//System.out.println(isStringPalindrome("b"));
		System.out.println(getPalinPartition(string));
	}

	private static String removeChar(String string, char c) {
		String s2 = string; 
		for(int i=0; i<s2.length(); i++) {
			if(s2.charAt(i)==c) {
				s2 = s2.substring(0, i)+s2.substring(i+1); 
			}
		}
		return s2;
	}

	private static HashSet<String> getPalinPartition(String string) {
		HashSet<String> set = new HashSet<String>(); 
		for(int i = 0; i<string.length(); i++) {
			for(int j = i; j<string.length(); j++) {
				String s = string.substring(i, j+1);
				if(isStringPalindrome(s))set.add(s);
			}
		}
		return set;
	}
	
	private static boolean isStringPalindrome(String string) {
		for(int i = 0; i<string.length()/2; i++) {
			if(string.charAt(i)!=string.charAt(string.length()-i-1)) {
				return false; 
			}
		}
		return true; 
	}
}
