import java.util.*;
import java.io.*;

public class BMI {
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
			String d = dataFile.nextLine();
			int iterations = Integer.parseInt(d);
			for (int i=1; i <= iterations; i++){
				String string = dataFile.nextLine();
				String[] buffer = string.split("\\s+");
				int weight = Integer.parseInt(buffer[0]);
				float height = Float.parseFloat(buffer[1]);
				float bmi = (float)weight / (height*height);
				/*if (bmi < 18.5){
					writer.print("under ");
				} else if ((18.5 <= bmi ) && (bmi < 25.0)){
					writer.print("normal ");
				} else if ((25.0 <= bmi) && (bmi < 30.0)){
					writer.print("over ");
				} else {
					writer.print("obese ");
				}
				*/
				if (bmi < 25.0){
					if (bmi < 18.5){
						writer.print("under ");
					} else {
						writer.print("normal ");
					}
				} else if (bmi > 30.0) {
						writer.print("obese ");
				} else {
						writer.print("over ");
				}
				
			}
		}catch(IOException e){
			System.exit(0);
		} finally {	
			writer.close();
		}
	}
}