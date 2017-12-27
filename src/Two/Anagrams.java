package Two;

import java.awt.geom.FlatteningPathIterator;
import java.util.HashMap;
import java.util.Map;

import javax.swing.border.EtchedBorder;
import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class Anagrams {

	public static void main(String[] args) {
		String s1 = "fdsa";
		String s2 = "dsab"; 
		System.out.println(isAnagrams(s1, s2));
	//	System.out.println(deleteSpace("fdsa ds ds"));
	}

	private static boolean isAnagrams(String s1, String s2) {
		// TODO Auto-generated method stub
		s1 = s1.toLowerCase(); 
		s1 = deleteSpace(s1); 
		s2 = s2.toLowerCase(); 
		s2 = deleteSpace(s2); 
		if(s1.length() != s2.length()) {
			return false; //quick check
		}
		Map<Character, Integer> map1 = getCharMapFromString(s1); 
		Map<Character, Integer> map2 = getCharMapFromString(s2); 
		
		return compareTwoMaps(map1, map2);
	}
	
	private static boolean compareTwoMaps(Map<Character, Integer> map1, Map<Character, Integer> map2) {
		if(map1.size() != map2.size())return false; //quick check
		for(Map.Entry<Character, Integer> entry : map1.entrySet()) {
			if(entry.getValue()!=map2.get(entry.getKey())) {
				return false;
			}
		}
		return true;
	}

	private static Map<Character, Integer> getCharMapFromString(String string) {
		Map<Character, Integer> map = new HashMap<Character, Integer>(); 
		for(int i = 0; i<string.length(); i++) {
			char c = string.charAt(i);
			if(!map.containsKey(c)) {
				map.put(c, 1); 
			}else {
				map.put(c, map.get(c)+1); 
			}
		}
		return map; 
	}

	private static String deleteSpace(String s1) {
		for(int i = 0; i<s1.length()-1; i++) {
			if(s1.charAt(i) == ' ') {
				s1 = s1.substring(0, i) + s1.substring(i+1);
			}
		}
		return s1;
	}
	
}
