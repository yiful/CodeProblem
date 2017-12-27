package assign1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;

public class MyList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

	private static HashSet<ArrayList<Integer>> getPermutationSet(HashSet<ArrayList<Integer>> set, int num){
		HashSet<ArrayList<Integer>> set2 = new HashSet<ArrayList<Integer>>();
		for(ArrayList<Integer> list : set) {
			for(int i = 0; i<list.size(); i++) {
				ArrayList<Integer> list2 = list; 
				list2.add(i, num); 
				set2.add(list2); 
			}
		}
		return set2; 
	}
	
/*	private static HashSet<ArrayList<Integer>> getPermutationSet(int[] array){
		if(array.length == 1) {
			HashSet<ArrayList<Integer>> set = new HashSet<ArrayList<Integer>>(); 
			ArrayList<Integer> list = new ArrayList<Integer>(); 
			list.add(array[0]);
			set.add(list); 
			return set; 
		}
		
	}*/
}
