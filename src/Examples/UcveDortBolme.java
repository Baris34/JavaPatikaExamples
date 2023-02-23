package Examples;

import java.util.Iterator;
import java.util.Scanner;

public class UcveDortBolme {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Sayı giriniz : ");
		int sayi=scan.nextInt();
		int ort=0,sayac=0;
		for (int i = 1; i <= sayi; i++) {
			if ((i%3==0)&&(i%4==0)) {
				ort+=i;
				sayac++;
			}
		}
		ort=ort/sayac;
		System.out.println("Girilen sayıların ortalaması = "+ort);
		
		
	}

}
