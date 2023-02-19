package Examples;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("İlk sayıyı giriniz : ");
		int num1=scan.nextInt();
		System.out.print("İkinci sayıyı giriniz : ");
		int num2=scan.nextInt();
		
		System.out.print("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\nİstediğiniz işlemi seçiniz(1-4) : ");
		int islem =scan.nextInt();
		int result;
		double bolum;
		switch (islem) {
		case 1:
			result=num1+num2;
			System.out.print(num1+"+"+num2+"="+result);
			break;
		case 2:
			result=num1-num2;
			System.out.print(num1+"-"+num2+"="+result);

			break;
		case 3:
			result=num1*num2;
			System.out.print(num1+"x"+num2+"="+result);
			break;	
		case 4:
			bolum=(double)num1/(double)num2;
			System.out.print(num1+"/"+num2+"="+bolum);
			break;
		default:
			System.out.println("Lütfen (1-4) arası bir değer giriniz!");
			break;
		}
		
		
		
	}

}
