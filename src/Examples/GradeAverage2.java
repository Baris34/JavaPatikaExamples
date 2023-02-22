package Examples;

import java.util.Scanner;

public class GradeAverage2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int mat,fizik,kimya,turkce,muzik;
		double ort=0;
			
		
		System.out.print("Matematik notunuzu giriniz : ");
		mat=scan.nextInt();
		System.out.print("Fizik notunuzu giriniz : ");
		fizik=scan.nextInt();
		System.out.print("Kimya notunuzu giriniz : ");
		kimya=scan.nextInt();
		System.out.print("Türkçe notunuzu giriniz : ");
		turkce=scan.nextInt();
		System.out.print("Müzik notunuzu giriniz : ");
		muzik=scan.nextInt();
		
		if ((mat>=0&&mat<=100)||(fizik>=0&&fizik<=100)||(kimya>=0&&kimya<=100)||(turkce>=0&&turkce<=100)||(muzik>=0||muzik<=100)) {
			ort=(mat+fizik+kimya+turkce+muzik)/5;
		}
		else {
			ort=(mat+fizik+kimya+turkce)/5;
		}
		if (ort>55) {
			System.out.println("Geçtiniz Tebrikler!");
		}
		else {
			System.out.println("Kaldınız!");
		}
		
		
		
	}

}
