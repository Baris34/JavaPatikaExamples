package Examples;

import java.util.Scanner;

public class FindHoroscope {

	public static void main(String[] args) {
		String burc = "";
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Doğduğunuz ayı giriniz : ");
		int month=scan.nextInt();
		System.out.print("Doğduğunuz günü giriniz : ");
		int day=scan.nextInt();
		
		if (month==1) {
			if ((day>=1&&day<=21)) {
				burc="Oğlak";
			}
			else {
				burc="Kova";
			}
		}
		if (month==2) {
			if ((day>=1&&day<=19)) {
				burc="Kova";
			}
			else {
				burc="Balık";
			}
		}
		if (month==3) {
			if ((day>=1&&day<=20)) {
				burc="Balık";
			}
			else {
				burc="Koç";
			}
		}
		if (month==4) {
			if ((day>=1&&day<=20)) {
				burc="Koç";
			}
			else {
				burc="Boğa";
			}
		}
		if (month==5) {
			if ((day>=1&&day<=21)) {
				burc="Boğa";
			}
			else {
				burc="İkizler";
			}
		}
		if (month==6) {
			if ((day>=1&&day<=22)) {
				burc="İkizler";
			}
			else {
				burc="Yengeç";
			}
		}
		if (month==7) {
			if ((day>=1&&day<=22)) {
				burc="Yengeç";
			}
			else {
				burc="Aslan";
			}
		}
		if (month==8) {
			if ((day>=1&&day<=22)) {
				burc="Aslan";
			}
			else {
				burc="Başak";
			}
		}
		if (month==9) {
			if ((day>=1&&day<=22)) {
				burc="Başak";
			}
			else {
				burc="Terazi";
			}
		}
		if (month==10) {
			if ((day>=1&&day<=22)) {
				burc="Terazi";
			}
			else {
				burc="Akrep";
			}
		}
		if (month==11) {
			if ((day>=1&&day<=21)) {
				burc="Akrep";
			}
			else {
				burc="Yay";
			}
		}
		if (month==12) {
			if ((day>=1&&day<=21)) {
				burc="Yay";
			}
			else {
				burc="Oğlak";
			}
		}
		System.out.println(burc);
		
		
		
		
		
	}

}
