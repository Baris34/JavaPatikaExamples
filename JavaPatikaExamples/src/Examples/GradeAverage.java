package Examples;

import java.util.Scanner;

public class GradeAverage {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Matematik notunuzu giriniz : ");
		int mat_Not=scan.nextInt();
		System.out.print("Fizik notunuzu giriniz : ");
		int fizik_Not=scan.nextInt();
		System.out.print("Türkçe notunuzu giriniz : ");
		int turkce_Not=scan.nextInt();
		System.out.print("Kimya notunuzu giriniz : ");
		int kimya_Not=scan.nextInt();
		System.out.print("Müzik notunuzu giriniz : ");
		int muzik_Not=scan.nextInt();
		System.out.print("Tarih notunuzu giriniz : ");
		int tarih_Not=scan.nextInt();
		
		double ort = (mat_Not+fizik_Not+turkce_Not+kimya_Not+muzik_Not+tarih_Not)/6;
		System.out.println("Ortalamanız = "+ort);
		if (ort>60) {
			System.out.println("Sınıfı Geçtiniz!");
		}
		else {
			System.out.println("Sınıfta Kaldınız!");
		}
	}

}
