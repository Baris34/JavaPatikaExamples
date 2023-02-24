package Examples;

import java.util.Scanner;

public class PowFor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Sayıyı giriniz : ");
		int num=scan.nextInt();
		System.out.print("Üs giriniz : ");
		int pow=scan.nextInt();
		int result=1;
		for (int i = 1; i <= pow; i++) {
			result*=num;
		}
		System.out.print(num+"^"+pow+"="+result);
		
		
	}

}
