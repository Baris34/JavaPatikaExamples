package Examples;

import java.util.Scanner;

public class Desen {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayı girin : ");
		int n= scan.nextInt();
		Metot(n);
	}
	static void Metot(int n) {
		System.out.print(n+	" ");
		if (n<=0) {
			return;
		}
		else {
			Metot(n-5);
			System.out.print(n+" ");
		}
	}

}
