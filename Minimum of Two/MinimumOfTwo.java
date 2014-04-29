import java.util.*;
import java.io.*;

public class MinimumOfTwo {
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
				/*if (second > first) {
					writer.print(first + " ");
				} else {
					writer.print(second + " ");
				}
				*/
				writer.print(Math.min(first, second) + " ");
			}
		}catch(IOException e){
			System.out.println("File Already Exists! Delete before executing");
			System.exit(0);
		} finally {	
			writer.close();
		}
	}
}