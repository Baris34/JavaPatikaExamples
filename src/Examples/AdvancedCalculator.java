package Examples;

import java.util.Iterator;
import java.util.Scanner;

public class AdvancedCalculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int select;
		do {
			System.out.println("1-Toplama İşlemi\n"
					+ "2-Çıkarma İşlemi\n"
					+ "3-Çarpma İşlemi\n"
					+ "4-Bölme İşlemi\n"
					+ "5-Üslü Sayı Hesaplama\n"
					+ "6-Faktoriyel Hesaplama\n"
					+ "7-Mod Alma\n"
					+ "8-Dikdörtgen Alan ve Çevre Hesabı\n"
					+ "0-Çıkış Yap");
			System.out.print("Bir işlem giriniz : ");
			select=scan.nextInt();
			switch (select) {
			case 1:
				plus();
				break;
			case 2:
				minus();
				break;
			case 3:
				times();
				break;
			case 4:
				divided();
				break;
			case 5:
				power();
				break;
			case 6:
				factorial();
				break;
			case 7:
				mod();
				break;
			case 8:
				area();
				break;
			case 0:
				break;
			default:
				System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
				break;
			}
		} while (select!=0);
	}
	static void plus() {

		Scanner scan = new Scanner(System.in);
		int num,result =0;
		System.out.print("Kaç adet sayı gireceksiniz : ");
		int counter =scan.nextInt();
		for (int i = 1; i <= counter; i++) {
			System.out.print(i+". sayı =");
			num=scan.nextInt();
			result+=num;
		}
		System.out.println("Sonuç : "+result);
	}
	static void minus() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Kaç adet sayı gireceksiniz : ");
		int counter =scan.nextInt();
		int result=0,num;
		for (int i = 1; i <=counter; i++) {
			System.out.print(i+". sayı =");
			num=scan.nextInt();
			result-=num;
		}
		System.out.println("Sonuç : "+result);
		
	}
	static void times() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Kaç adet sayı gireceksiniz : ");
		int counter =scan.nextInt();
		int num,result=1;
		for (int i = 1; i <=counter; i++) {
			System.out.print(i+". sayı =");
			num=scan.nextInt();
			result*=num;
		}
		System.out.println("Sonuç : "+result);
	}
	static void divided() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Kaç adet sayı gireceksiniz : ");
		int counter =scan.nextInt();
		int num;double result=0.0;
		for (int i = 1; i <= counter; i++) {
			System.out.print(i+". sayı =");
			num=scan.nextInt();
			if (num==0) {
				System.out.println("Böleni 0 giremezsiniz.");
				break;
			}
			if (i==1) {
				result=num;
				continue;
			}
			result/=num;
		}
		System.out.println("Sonuç : "+result);
		
		
	}
	static void power() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Taban değerini giriniz : ");
		int base =scan.nextInt();
		System.out.print("Üs değerini giriniz : ");
		int exponent=scan.nextInt();
		int result =1;
		
		for (int i = 0; i <exponent; i++) {
			result*=base;
		}
		System.out.println(result);
		
	}
	static void factorial() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Faktoriyelini öğrenmek istediğniiz sayıyı giriniz : ");
		int fakt=scan.nextInt();
		int result =1;
		for (int i = 1; i <= fakt; i++) {
			result*=i;	
		}
		System.out.println("Sonuç : "+result);
	}
	static void area() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Kısa kenar uzunluğunu giriniz : ");
		int k1=scan.nextInt();
		System.out.print("Uzun kenar uzunluğunu giriniz : ");
		int k2=scan.nextInt();
		
		int area =k1*k2;
		int env=(k1*2)+(k2*2);
		System.out.println("Area = "+area+" Env="+env);
		
	}
	static void mod() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Modunu almak istediğiniz sayıyı giriniz : ");
		int num=scan.nextInt();
		System.out.print("Mod olarak girmek istediğiniz sayıyı giriniz : ");
		int mod=scan.nextInt();
		
		int result = num%mod;
		System.out.println("Result : "+result);
		
		
		
	}
}

