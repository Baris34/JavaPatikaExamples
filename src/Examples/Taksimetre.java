package Examples;

import java.util.Scanner;

public class Taksimetre {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Gidilen KM miktarını giriniz : ");
		int km = scan.nextInt();
		double perkm=2.20,total=10;
		
		total+=km*perkm;
		System.out.println("Toplam Ödenecek Tutar = "+total);
		
		
	}

}
