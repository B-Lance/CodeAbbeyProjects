import java.util.*;
import java.io.*;

public class ArrayChecksum {
	public static void main(String[] args) {
		final int SEED = 113;
		final int LIMIT = 10000007;
		
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
			long[] array = new long[iterations+1];
			for (int i=0; i < iterations; i++){
				array[i] = dataFile.nextInt();
			}
			long result = 0;
			for (int i=0; i < iterations; i++){
				result = (result + array[i]) * SEED;
				result = result % LIMIT;
			}
			writer.print(result);

		} catch(IOException e) {
			System.exit(0);
		} finally {	
			writer.close();
		}
	}
}