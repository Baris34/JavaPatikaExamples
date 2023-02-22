package Examples;

import java.util.Scanner;

public class PlaneTicket {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double amount,discount;
		System.out.print("Mesafeyi KM cinsinden giriniz : ");
		int km=scan.nextInt();
		System.out.print("Yaşınızı giriniz : ");
		int age=scan.nextInt();

		System.out.print("Yolculuk tipini giriniz (1=> Tek Yön , 2=> Gidiş Dönüş) : ");
		int tip=scan.nextInt();
		
		if (km<0||age<0||!(tip==1||tip==2)) {
			System.out.println("Hatalı veri girdiniz!");
		}else {
		amount=km*0.10;
		if (age<12) {
			discount=amount*0.5;
			amount-=discount;
		}
		else if (age<24) {
			discount=amount*0.1;
			amount-=discount;
		}
		else if (age>=66) {
			discount=amount*0.3;
			amount-=discount;
		}
		if (tip==2) {
			discount=amount*0.2;
			amount-=discount;
			System.out.println("Toplam tutar = "+amount*2+"TL");
		}else {
			System.out.println("Toplam Tutar = "+amount+"TL");
		}
		}
	}

}
