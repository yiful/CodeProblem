package Two;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "aam"; 
		Map<String, Integer> map = getPermutations(string);
		for(Entry<String, Integer> entry: map.entrySet()) {
			System.out.println(entry.getKey());
		}
	}
	static Map<String, Integer> getPermutations(String string){
		Map<String, Integer> map = new HashMap<String, Integer>(); 
		if(string.length() == 1) {
			map.put(string, 1); 
		}else {
			map = getPermutations(string.substring(0, string.length()-1), string.substring(string.length()-1));
		}
		return map; 
	}
	
	static Map<String, Integer> getPermutations(String string, String string2){
		Map<String, Integer> map = new HashMap<String, Integer>();
		String newString="";
		Map<String, Integer> string1Map = getPermutations(string); 
		for(Entry<String, Integer> entry : string1Map.entrySet()) {
			string = entry.getKey(); 
			for(int i = 0; i < string.length(); i ++) {
				newString = string.substring(0, i) + string2 + string.substring(i); 
			//	System.out.println(newString);
				if(!map.containsKey(newString)) {
					map.put(newString, 1);
				}
			}
			newString = string + string2;
			if(!map.containsKey(newString)) {
				map.put(newString, 1);
			}
		//	System.out.println(newString);
		}
		return map; 
	}
}
