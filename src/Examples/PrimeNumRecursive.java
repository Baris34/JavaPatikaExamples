package Examples;

import java.util.Scanner;

public class PrimeNumRecursive {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Sayı gir : ");
		int num = scan.nextInt();
		if (PrimeNum(num, num/2)) {
			System.out.println(num+" Asal Sayidir...");
		}
		else {
			System.out.println(num+" Asal Degildir...");
		}
	}
	static boolean PrimeNum(int a,int divider) {
		if (a<2) {
		return false;
		}
		else if (divider==1){
			return true;
		}
		else {
			if (a%divider==0) {
				return false;
			}
			else {
				return PrimeNum(a, divider-1);
			}
		}
	}
	
	
	
}
