import java.util.*;
import java.io.*;

public class SumOfDigits {
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
				int mulitplicant = dataFile.nextInt();
				int multiplier = dataFile.nextInt();
				int element = dataFile.nextInt();
				int primalSum = mulitplicant * multiplier + element;
				int desiredSum = 0;
				while(primalSum/10 != 0){
					desiredSum += primalSum%10;
					primalSum = primalSum/10;			
				}
				desiredSum += primalSum;
				writer.print(desiredSum + " ");
			}
		}catch(IOException e){
			System.exit(0);
		} finally {	
			writer.close();
		}
	}
}