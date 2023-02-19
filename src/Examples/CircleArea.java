package Examples;

import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Yarıçap değerini giriniz : ");
		int r=scan.nextInt();
		System.out.print("Merkez açı ölçüsünü giriniz : ");
		int a = scan.nextInt();
		
		final double PI_SAYISI=3.14;
		double area=(PI_SAYISI * (r*r) * a) / 360;
		System.out.println("Daire diliminin alanı = "+area);
		
		
	}

}
