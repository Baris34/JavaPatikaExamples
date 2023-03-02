package Examples;

public class Fibonacci {

	public static void main(String[] args) {
		int fib=0,fib1=1,temp;
		for (int i = 0; i < 9; i++) {
			temp=fib+fib1;
			fib=fib1;
			fib1=temp;
			System.out.print(fib1+" ");
		}
	}

}
