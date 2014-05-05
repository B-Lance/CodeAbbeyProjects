import java.util.*;
import java.io.*;
import java.lang.*;


public class WSD {
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
				String number = dataFile.next().trim();
				int weightenedSum = 0;
				int position = 1;
					for (int j=0; j < number.length(); j++){
						Character digitAsString = (char)(number.charAt(j));
						int digit = Character.getNumericValue(digitAsString);
						weightenedSum = weightenedSum + (digit * position);
						position++;
					}
				writer.print(weightenedSum + " ");
			}
		}catch(IOException e){
			System.exit(0);
		} finally {	
			writer.close();
		}
	}
}