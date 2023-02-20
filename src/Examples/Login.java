package Examples;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		String username,password;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Kullanıcı adınızı giriniz : ");
		username=scan.nextLine();
		System.out.print("Şifrenizi giriniz : ");
		password=scan.nextLine();
		
		if (username.equals("Baris")&&password.equals("1234")) {
			System.out.println("Giriş Başarılı!!!");
		}
		else if (!password.equals("1234")) {
			String passwd,bool;
			System.out.println("Şifreniz Yanlış!!\nŞifrenizi sıfırlamak istiyorsanız Evet ,istemiyorsanız Hayır Yazınız.");
			bool=scan.nextLine();
			
			if (bool.equals("Evet")) {
				System.out.print("Yeni şifrenizi giriniz : ");
				passwd=scan.nextLine();
				if (passwd.equals("1234")) {
					System.out.print("Lütfen eski şifrenizden farklı bir şifre giriniz : ");
					passwd=scan.nextLine();
				}
				else {
					System.out.println("Şifreniz başarıyla oluşturuldu!!");
				}
			}
			
			
			
		}
	}

}
