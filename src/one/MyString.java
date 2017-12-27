package one;

public class MyString {
	static boolean isPalindrone;
	public static void main(String[] args) {
		final String string = "abcd"; 
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				isPalindrone = palindrone(string); 
				System.out.println(isPalindrone);
			}
		};
		new Thread(runnable).start();
		
	}
	
	static boolean palindrone(String s) {
		for(int i = 0; i < s.length()/2; i ++) {
			if(! (s.charAt(i) == s.charAt(s.length()-1-i))) {
				return false; 
			}
		}
		return true;
	}
}
