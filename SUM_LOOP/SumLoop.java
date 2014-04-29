import java.util.*;

public class SumLoop {
	public static void main(String[] args) {
		Scanner adder = new Scanner(System.in);
		System.out.print("Input data:");
		String dataString = adder.nextLine();
		Scanner searcher = new Scanner(dataString);
		int sum = 0;
		do{
			sum = sum + searcher.nextInt();
			System.out.println(sum);
		}while(searcher.hasNextLine());	
		System.out.println("Sum is equal to:" + sum);
	}
