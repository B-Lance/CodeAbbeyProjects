import java.util.*;
import java.io.*;

public class ArrayExtremum {
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
		int[] array = new int[300];
		try{
			writer = new PrintWriter("result.txt", "UTF-8");
			for (int i=0; i <= 299; i++){
				array[i] = dataFile.nextInt();
			}

			//max&min
			int bufferMIN = array[0];
			int bufferMAX = array[0];
			for (int i=0; i <= 299; i++){
				if(array[i] > bufferMAX){
					bufferMAX = array[i];
				} 
				if(array[i] < bufferMIN){
					bufferMIN = array[i];
				} 
			}
			writer.print(bufferMAX+" "+bufferMIN);
		}catch(IOException e){
			System.exit(0);
		} finally {	
			writer.close();
		}
	}
}