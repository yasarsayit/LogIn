package java101;

import java.util.Scanner;

public class LogIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String password = "1234";
		System.out.print("Şifrenizi giriniz : ");
		String userPassword = input.next();
		String newUserPassword = "";
		boolean check = true;
		if (password.equals(userPassword))
			System.out.println("Başarılı bir şekilde giriş yaptınız.");
		else if (!password.equals(userPassword)) {
			System.out.println("Girdiğiniz şifre yanlış. "
					+ "\nŞifre sıfırlamak ister misiniz? \nŞifre sıfırlayacaksaksanız lütfen 1'e basın. "
					+ "\nSıfırlamak istemiyorsanız 2'ye basıp çıkış yapabilirsiniz.");

			int option = input.nextInt();
			if (option == 1) {
				while (check) {
					System.out.print("Lütfen yeni şifrenizi giriniz: ");
					newUserPassword = input.next();
					if (newUserPassword.equals(userPassword) || (newUserPassword.equals(password)))
						System.out.println("Şifre oluşturulamadı. Lütfen tekrar deneyiniz.");

					else {
						System.out.print("Şifre oluşturuldu");
						check = false;
					}

				}
			} else if (option == 2) {
				System.out.println("Çıkış yapılıyor...");
				System.exit(0);
			}
		}
	}

}
