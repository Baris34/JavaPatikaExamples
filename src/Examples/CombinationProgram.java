package Examples;

import java.util.Scanner;

public class CombinationProgram {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Kombinasyon için N değerini girin : ");
		int n =scan.nextInt();
		System.out.print("R değerini giriniz : ");
		int r =scan.nextInt();
		int N=1,R=1,last=1;
		for (int i = 1; i <= n; i++) {
			N*=i;
		}
		for (int i = 1; i <=r; i++) {
			R*=i;
		}
		for (int i = 1; i <=(n-r); i++) {
			last*=i;
		}
		int comb=N/(R*last);
		System.out.println("Girdiğiniz sayının kombinasyonu = "+comb);
	}

}
