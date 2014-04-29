import java.util.*;
import java.io.*;

public class SumLoop2 {
	public static void main(String[] args) {
		Scanner dataFile = null;
		
		try{
			File plik = new File("data.txt");
			dataFile = new Scanner(plik);
		}catch(FileNotFoundException e){
			System.out.println("File Not Found!");
			System.exit(0);
		}

		long sum = 0;
		int iterations = dataFile.nextInt();
		for (int i=1; i <= iterations; i++){
			System.out.println(sum);
			sum = sum + dataFile.nextInt();
		}
		
		System.out.println("Sum equals: " + sum);
	}
}