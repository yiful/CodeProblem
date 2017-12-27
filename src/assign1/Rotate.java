package assign1;

public class Rotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,2,3,4,5,6,7}; 
		int n = 3; 
		int[] array2 = rotateArray(array, 3);
		printArray(array2);
	}

	private static int[] rotateArray(int[] array, int n) {
		// TODO Auto-generated method stub
		int[] array2 = new int[array.length]; 
		for(int i = 0; i<n; i++) {
			array2[i] = array[array.length-n+i];
		}
		for(int i = n; i<array.length; i++) {
			array2[i] = array[i-n]; 
		}
		return array2;
	}

	private static void printArray(int[] array) {
		for(int i = 0; i < array.length; i ++) {
			System.out.print(array[i]+" ");
		}
	}
}
