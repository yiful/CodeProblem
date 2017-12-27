package one;

import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getMinDistance("C:\\Users\\Yifu\\Desktop\\codeInterview.txt"); 

	}
	
	static float getMinDistance(String path) {
		File file = new File(path);
		ArrayList xList = new ArrayList<Integer>();
		ArrayList yList = new ArrayList<Integer>(); 
		try {
			Scanner scanner = new Scanner(file);
			while(scanner.hasNextLine()) {
				String string = scanner.nextLine(); 
				if(string.contains(" ")) {
					String[] strings = string.split(" "); 
					xList.add(Integer.valueOf(strings[0])); 
					yList.add(Integer.valueOf(strings[1])); 
				}
			}
			calculateMinDist(xList, yList); 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		
		return 0; 
	}
	
	static void calculateMinDist(ArrayList<Integer> xList, ArrayList<Integer> yList) {
		double min = Integer.MAX_VALUE; 
		for(int i = 0; i < xList.size()-1; i++) {
			for(int j = i+1; j < yList.size(); j++) {
				double dis = Math.sqrt(square(xList.get(i) - xList.get(j))+square(yList.get(i)-yList.get(j)));
				if(dis<min) {
					min = dis; 
				}
			}
		}
		if(min > 10000) {
			System.out.println("INFINITY");
		}else {
			System.out.printf("%.4f", min);
		}
	}
	
	static float square(int i) {
		return i*i; 
	}
}
