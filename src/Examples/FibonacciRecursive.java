package Examples;

import java.util.Scanner;

public class FibonacciRecursive {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Öğrenmek istediğiniz elemanı giriniz : ");
		int a =scan.nextInt();
		System.out.println(Fibonacci(a));
	}
	static int Fibonacci(int a) {
		if (a==1||a==2) {
			return 1;
		}
		else {
			return Fibonacci(a-1)+Fibonacci(a-2);
		}
	}
}
