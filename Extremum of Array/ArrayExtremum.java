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
			//	System.out.println("oink! " + i + " " +array[i]);
			}
			writer.print(array[299]);
		}catch(IOException e){
			System.out.println("File Already Exists! Delete before executing");
			System.exit(0);
		} finally {	
			writer.close();
		}
	}
}