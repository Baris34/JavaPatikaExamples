package Examples;

import java.util.Scanner;

public class OddNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sayi,toplam=0;
		do {
			System.out.print("Bir sayı giriniz : ");
			sayi=scan.nextInt();
			if (sayi%2==0) {
				if (sayi%4==0) {
					toplam+=sayi;
				}
			}
			
		} while (sayi%2==0);
		
		System.out.println("Sayıların toplamı = "+toplam);
		
		
		
	}

}
