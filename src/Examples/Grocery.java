package Examples;

import java.util.Scanner;

public class Grocery {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("-------Hoşgeldiniz-------\n");
		System.out.print("Armut:2,14TL\nElma:3,67TL\nDomates:1,11TL\nMuz:0,95TL\nPatlıcan:5,00TL\n");
		System.out.print("------------------\n");
		System.out.print("Armut Kaç Kilo ? : ");
		int armut = scan.nextInt();
		System.out.print("Elma Kaç Kilo  ? : ");
		int elma =scan.nextInt();
		System.out.print("Domates Kaç Kilo ? : ");
		int domates = scan.nextInt();
		System.out.print("Muz Kaç Kilo ? : ");
		int muz = scan.nextInt();
		System.out.print("Patlıcan Kaç Kilo ? : ");
		int patlican=scan.nextInt();
		
		double total = (armut*2.14)+(elma*3.67)+(domates*1.11)+(muz*0.95)+(patlican*5.00);
		
		System.out.println("Toplam Tutar : "+total+" TL");
		
		
		
	}

}
