import java.util.*;
import java.io.*;

public class Vowel_Count {
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
		final char[] VOWELS = {'a','e','i','o','y','u'};
		try{
			writer = new PrintWriter("result.txt", "UTF-8");
			int iterations = Integer.parseInt(dataFile.nextLine());
			for (int i=1; i <= iterations; i++){
				String sentence = dataFile.nextLine();
				int counter = 0;
				for(int j=0; j < sentence.length() ; j++){
					for (int k=0; k < 6; k++){
						if(sentence.charAt(j) == VOWELS[k]){
							counter = counter + 1;
						}
					}	
				}
				writer.print(counter+" ");
			}
		}catch(IOException e){
			System.out.println("File Already Exists! Delete before executing");
			System.exit(0);
		} finally {	
			writer.close();
		}
	}
}