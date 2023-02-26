package Examples;

import java.util.Scanner;

public class MinMax {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Kaç tane sayı gireceksin : ");
		int num=scan.nextInt();
		int max = 0,min = 0;
		for (int i = 0; i < num; i++) {
			System.out.print((i+1)+". sayıyı giriniz : ");
			int num1=scan.nextInt();
			if (num1>=max) {
				max=num1;
			}
			if (num1<=min) {
				min=num1;
			}
		}
		System.out.println("En büyük sayı: "+max);
		System.out.println("En küçük sayı: "+min);
	}

}
