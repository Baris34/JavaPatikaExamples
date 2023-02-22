package Examples;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Sıcaklık değerini giriniz : ");
		double heat = scan.nextDouble();
		if (heat>=26) {
			System.out.println(heat+" bu sıcaklık 'Yüzme' için çok uygun.");
		}
		else if (heat>=15) {
			System.out.println(heat+" bu sıcaklık 'Piknik' için çok uygun.");
		}
		else if (heat>=5) {
			System.out.println(heat+" bu sıcaklık 'Sinema' için çok uygun.");
		}
		else if (heat<5) {
			System.out.println(heat+" bu sıcaklık 'Kayak' için çok uygun.");
		}
	}

}
