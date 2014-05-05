import java.util.*;
import java.io.*;

public class Average {

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
				int sum = 0;
				int counter = 0;
				int number = dataFile.nextInt();
				while(number != 0){
					sum += number;
					counter++;
					number = dataFile.nextInt();
				}
				//System.out.println(counter);
				double average = (double)sum/(double)counter;
				int rounded = 0;
				if((average-(int)average)>= 0.5 || ((average< 0) && (average-(int)average)<= 0.5)){
					rounded = (int)Math.ceil(average);
				} else {
					rounded = (int)Math.floor(average);
				}
				//System.out.println(rounded);
				writer.print(rounded+" ");

			}
		}catch(IOException e){
			System.exit(0);
		} finally {	
			writer.close();
		}
	}
}