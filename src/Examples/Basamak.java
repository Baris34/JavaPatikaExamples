package Examples;

import java.util.Scanner;

public class Basamak {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Basamak toplamını öğrenmek istediğiniz sayıyı giriniz : ");
		int num=scan.nextInt();
		int basamak,top=0;
		for (; num!=0; num/=10) {
			basamak=num%10;
			top+=basamak;
		}
		System.out.println("Basamakları toplamı = "+top);
	}

}
