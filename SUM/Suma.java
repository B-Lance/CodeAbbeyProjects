import java.util.*;

public class Suma {
	public long Suma(long a, long b){
		return a+b;
	}

	public static void main(String[] args){
		Suma a = new Suma();
		long first = 0;
		long second = 0;
		Scanner get = new Scanner(System.in);
		first = get.nextLong();
		second = get.nextLong();
		System.out.println(a.Suma(first, second));
	}
}