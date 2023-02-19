package Examples;

import java.util.Scanner;

public class KDV_Hesap {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Para miktarını giriniz : ");
		double para = scan.nextDouble();
		double kdv_orani;
		double kdv_tutar;
		System.out.println("KDV'siz fiyat = "+para);
		if (para>1000) {
			kdv_orani=0.08;
			kdv_tutar=para*kdv_orani;
			para+=kdv_tutar;
			System.out.println("KDV'li fiyat = "+para);
			System.out.println("KDV oranı = "+kdv_tutar);
			
		}
		else {
			kdv_orani=0.18;
			kdv_tutar=para*kdv_orani;
			para+=kdv_tutar;
			System.out.println("KDV'li fiyat = "+para);
			System.out.println("KDV oranı = "+kdv_tutar);
			
		}
		
		
		
	}

}
