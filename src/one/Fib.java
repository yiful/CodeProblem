package one;

public class Fib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10; 
		for(int i=1; i<n+1; i++) {
			System.out.print(getFib(i)+" ");
		}
	}
	
	static int getFib(int i) {
		if(i == 1) {
			return 0;
		}
		if(i == 2) {
			return 1;  
		}
		return(getFib(i-1)+getFib(i-2)); 
	}

}
