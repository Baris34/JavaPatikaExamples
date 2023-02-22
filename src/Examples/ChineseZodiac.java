package Examples;

import java.util.Scanner;

public class ChineseZodiac {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Doğum tarihinizi giriniz : ");
		int tarih=scan.nextInt();
		if (tarih%12==0) {
			System.out.println("Maymun");
		}
		else if (tarih%12==1) {
			System.out.println("Horoz");
		}
		else if (tarih%12==2) {
			System.out.println("Köpek");
		}
		else if (tarih%12==3) {
			System.out.println("Domuz");
		}
		else if (tarih%12==4) {
			System.out.println("Fare");
		}
		else if (tarih%12==5) {
			System.out.println("Öküz");
		}
		else if (tarih%12==6) {
			System.out.println("Kaplan");
		}
		else if (tarih%12==7) {
			System.out.println("Tavşan");
		}
		else if (tarih%12==8) {
			System.out.println("Ejderha");
		}
		else if (tarih%12==9) {
			System.out.println("Yılan");
		}
		else if (tarih%12==10) {
			System.out.println("At");
		}
		else if (tarih%12==11) {
			System.out.println("Koyun");
		}
	}

}
