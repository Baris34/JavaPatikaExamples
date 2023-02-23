package Examples;

import java.util.Scanner;

public class KuvvetBulma {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Üs giriniz : ");
		int us=scan.nextInt();
		
		int carp=1;
		for (int i = 1; i <= us; i*=4) {
		System.out.println(i);
		}
		System.out.println("------------");
		for (int i = 1; i < us; i*=5) {
			System.out.println(i);
		}
	
	}
		
		
	}


