package Examples;

import java.util.Scanner;

public class PowWithRecursive {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Taban giriniz : ");
		int base =scan.nextInt();
		System.out.print("Üs giriniz : ");
		int pow =scan.nextInt();
		System.out.println(Pow(base, pow));
	}
	static int Pow(int taban,int us) {
		if (us==0) {
			return 1;
		}
		else {
			return taban*Pow(taban,us-1);
		}
	}

}
