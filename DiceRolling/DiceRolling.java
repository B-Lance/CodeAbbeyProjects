import java.util.*;
import java.io.*;


public class DiceRolling {
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
				String buffer = dataFile.next().trim();
				double value = Double.parseDouble(buffer);
				//multiplying by desired number of points on dice
				//Whole algorithm: FLOOR(x *(B - A) + A)
				value = (value*6);
				//Decimal value must be FLOORED (not rounded) to get desired integer value
				int rounded = (int)value;
				rounded++;
				writer.print(rounded+" ");
			
			}
		}catch(IOException e){
			System.exit(0);
		} finally {	
			writer.close();
		}
	}
}