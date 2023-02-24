package Examples;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String userName,password;
		int right =3;
		int select,balance=1500;
		int price;
		while (right>0) {
			System.out.print("Kullanıcı adınızı giriniz : ");
			userName=scan.nextLine();
			System.out.print("Şifrenizi giriniz : ");
			password=scan.nextLine();
			if (userName.equals("Baris")&&password.equals("123")) {
				System.out.println("Hoşgeldiniz!");
				do {
					System.out.println("1-Para Yatırma\n"
							+ "2-Para Çekme\n"
							+ "3-Bakiye Sorgula\n"
							+ "4-Çıkış Yap");
					System.out.print("Lütfen istediğiniz işlemi seçiniz : ");
					select=scan.nextInt();
					switch (select) {
					case 1:
						System.out.print("Yatırmak istediğiniz ücreti giriniz : ");
						price =scan.nextInt();
						balance+=price;
						System.out.println("Yeni bakiyeniz : "+balance);
						break;
					case 2:
						System.out.print("Çekmek istediğiniz tutarı giriniz : ");
						price =scan.nextInt();
						if (price>balance) {
							System.out.println("Bakiye Yetersiz!");
						}
						else {
							balance-=price;
							System.out.println("Yeni bakiyeniz : "+balance);
						}
						break;
					case 3:
						System.out.println("Bakiyeniz : "+balance);
						break;
					
					}
				} while (select<4);
				System.out.println("Tekrar görüşmek üzere");
				break;
			}else {
				right--;
				if (right==0) {
					System.out.println("Hesabınız bloke olmuştur.Lütfen bankanız ile iletişime geçiniz!");
				}
				else {
					System.out.println("Kalan hakkınız : "+right);
					System.out.println("Hatalı giriş yaptınız. Tekrar deneyiniz!");
				}
				
			}
			
			
		}		
	}

}
