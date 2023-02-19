package Examples;

import java.util.Scanner;

public class BodyMassİndex {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
		double boy = scan.nextDouble();
		System.out.print("Lütfen kilonuzu giriniz : ");
		int kilo=scan.nextInt();
		double index = kilo/(boy*boy);
		System.out.println("Vücut Kitle İndeksiniz : "+index);
	}

}
