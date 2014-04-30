import java.util.*;
import java.io.*;

public class FtC {
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
				int fahrenheit = dataFile.nextInt();
				
				double buffer = (((double)fahrenheit - 32.0)*(5.0/9.0));
				System.out.println(buffer);
				int celsius = 0;
				if((buffer-(int)buffer)>= 0.5 || ((buffer < 0) && (buffer-(int)buffer)<= 0.5)){
					celsius = (int)Math.ceil(buffer);
				} else {
					celsius = (int)Math.floor(buffer);
				}
				writer.print(celsius+" ");


			}
		}catch(IOException e){
			System.exit(0);
		} finally {	
			writer.close();
		}
	}
}