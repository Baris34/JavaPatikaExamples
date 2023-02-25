package Examples;

import java.util.Scanner;

public class Ekok {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		
		System.out.print("Bir sayı giriniz : ");
		int num=scan.nextInt();
		System.out.print("Bir sayı daha giriniz : ");
		int num1=scan.nextInt();
		
		int ebob=1;
		int sayac=1;
		while (sayac<=num) {
			
			if (num%sayac==0&&num1%sayac==0) {
				ebob=sayac;
			}
			sayac++;
		}
		System.out.println("Girdiğiniz sayıların Ebob'u = "+ebob);
		int ekok=(num*num1)/ebob;
		System.out.println("Girdiğiniz sayıların Ekok'u = "+ekok);
	}

}
