package Examples;

import java.util.Scanner;

public class PerfectNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Bir sayı giriniz: ");
		int num=scan.nextInt();
		int top=0;
		for (int i = 1; i < num; i++) {
			if (num%i==0) {
				top+=i;
			}
		}
		if (top==num) {
			System.out.println(num+" Mükemmel sayıdır");
		}
		else {
			System.out.println(num+" Mükemmel sayı değildir");
		}
	}

}
