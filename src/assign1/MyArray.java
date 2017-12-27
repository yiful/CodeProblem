package assign1;

public class MyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {5,7,7,8,10};
		int num = 8; 
		findStartEnd(array, num); 
	}

	private static void findStartEnd(int[] array, int num) {
		boolean flag = false; 
		int position=0; 
		for(int i = 0; i<array.length; i++) {
			if(array[i] == num) {
				if(flag == false) {
					flag = true;
					position = i;
					System.out.println(i);
				}else {
					position = i; 
				}
			}else {
				if(flag) {
					System.out.println(position);
					flag=false;
					break;
				}
			}
			
		}
	}
}
