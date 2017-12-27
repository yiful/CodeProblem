package assign1;


public class PicassoTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5; 
		picassoTri(n);
	}
	
	private static int[] picassoTri(int n) {
		if(n == 1) {
			printArray(new int[] {1});
			return (new int[] {1});
		}
		if(n==2) {
			printArray(new int[] {1});
			printArray(new int[] {1,1});
			return (new int[] {1,1});
		}
		int[] lastRow = picassoTri(n-1);
		int[] thisRow = new int[n]; 
		thisRow[0]=lastRow[0]; 
		thisRow[n-1]=lastRow[lastRow.length-1]; 
		for(int i = 1; i<n-1; i++) {
			thisRow[i] = lastRow[i-1]+lastRow[i]; 
		}
		printArray(thisRow);
		return thisRow;
	}
	
	private static void printArray(int[] array) {
		for(int num:array) {
			System.out.print(num+" ");
		}
		System.out.println();
	}
	
}
