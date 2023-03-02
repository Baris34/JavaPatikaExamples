package Examples;

import java.util.Iterator;
import java.util.Scanner;

public class PalindromNumMethod {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Bir sayı giriniz : ");
		int num=scan.nextInt();
		IsPalindrom(num);
	}
	static void IsPalindrom(int num) {
		int remainder,newNum=0,num1=num;
		for (; num!=0; num/=10) {
			remainder= num%10;
			newNum=newNum*10+remainder;
		}
		if (newNum==num1) {
			System.out.println(num1+" palindrom bir sayıdır!");
		}else {
			System.out.println(num1+" palindrom bir sayı değildir!");
		}
	}
}
