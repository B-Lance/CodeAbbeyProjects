import java.util.*;
import java.io.*;

public class MedianOfThree {
	public static void main(String[] args) {
		Scanner dataFile = null;
		
		try{
			File plik = new File("data.txt");
			dataFile = new Scanner(plik);
		}catch(FileNotFoundException e){
			System.out.println("File Not Found!");
			System.exit(0);
		}

		PrintWriter writer = null;
		try{
			writer = new PrintWriter("result.txt", "UTF-8");
			int iterations = dataFile.nextInt();
			for (int i=1; i <= iterations; i++){
				int first = dataFile.nextInt();
				int second = dataFile.nextInt();
				int third = dataFile.nextInt();
				
				int minimum = Math.min(Math.min(first, second), third);
				int maximum = Math.max(Math.max(first, second), third);
				if (first != minimum && first != maximum) {
					writer.print(first + " ");
				} else if (second != minimum && second != maximum) {
					writer.print(second + " ");
				} else {
					writer.print(third + " ");
				}
			
			}
		}catch(IOException e){
			System.exit(0);
		} finally {	
			writer.close();
		}
	}
}