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
				String buffer = dataFile.nextLine();
				float value = ;

			/*	double buffer = (double)first/(double)second;
				int rounded = 0;
				if((buffer-(int)buffer)>= 0.5 || ((buffer < 0) && (buffer-(int)buffer)<= 0.5)){
					rounded = (int)Math.ceil(buffer);
				} else {
					rounded = (int)Math.floor(buffer);
				}
				writer.print(rounded+" ");
			*/
			}
		}catch(IOException e){
			System.exit(0);
		} finally {	
			writer.close();
		}
	}
}