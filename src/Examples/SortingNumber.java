package Examples;

import java.util.Scanner;

public class SortingNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("İlk sayıyı giriniz : ");
		int num=scan.nextInt();
		System.out.print("İkinci sayıyı giriniz : ");
		int num2=scan.nextInt();
		System.out.print("Üçüncü sayıyı giriniz : ");
		int num3=scan.nextInt();
		
		if (num<num2&&num<num3) {
			if (num2<num3) {
				System.out.println(num+">"+num2+">"+num3);
			}
			else {
				System.out.println(num+"<"+num3+"<"+num2);
			}
		}
		else if (num2<num&&num2<num3) {
			if (num<num3) {
				System.out.println(num2+"<"+num+"<"+num3);
			}
			else if (num3<num) {
				System.out.println(num2+"<"+num3+"<"+num);
			}
		}else {
			if (num<num2) {
				System.out.println(num3+"<"+num+"<"+num2);
			}
			else if (num2<num) {
				System.out.println(num3+"<"+num2+"<"+num);
			}
		}
		
	}

}
