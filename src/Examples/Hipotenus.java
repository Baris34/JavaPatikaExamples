package Examples;

import java.util.Scanner;

public class Hipotenus {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("A kenarını giriniz : ");
		int a = scan.nextInt();
		System.out.print("B kenarını giriniz : ");
		int b = scan.nextInt();
		System.out.print("C kenarını giriniz : ");
		int c = scan.nextInt();
		
		int u =(a+b+c)/2;
		int cevre = 2*u;
		double alan =Math.sqrt(u*(u-a)*(u-b)*(u-c));
		System.out.println("Ücgenin alanı = "+alan );
		
		
	}

}
