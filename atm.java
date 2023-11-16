import java.util.Scanner;

public class atm {
	
	public void calis(hesap hesap1) {
		login login1 = new login();
		Scanner scanner = new Scanner(System.in);
		System.out.println("\n*******************\tASK BANKALARINA HOSGELDİNİZ\t*******************\n");
		System.out.println("\n...................\t\tKullanıcı girişi\t\t...................\n");
		int giris_hakki = 3;
		
		while (true) {
			if(login1.login(hesap1)) {
				System.out.println("Giriş başarılı...");
				break;
			}
			else {
				System.out.println("Giriş başarısız...");
				giris_hakki -= 1;
				System.out.println("Kalan deneme hakkınız: " + giris_hakki);
			}
			
			if (giris_hakki == 0) {
				System.out.println("Giris hakkınız bitmiştir...");
				
				return;
			}
			
		}
		
		System.out.println("***************************");
		String islemler = "\n1-Bakiye görüntüle\n"
						+"2-Para yatırma\n"
						+"3-Para çekme\n"
						+"4-Çıkıs için q ya basınız.";
		System.out.println(islemler);
		System.out.println("***************************");
		
		while(true) {
			System.out.println("Lütfen yapacağınız işlemi seçiniz: ");
			String islem = scanner.nextLine();
			
			if (islem.equals("q")) {
				break;
			}
			
			else if (islem.equals("1")) {
				System.out.println("Bakiyeniz: " + hesap1.getBakiye());
			}
			else if (islem.equals("2")) {
				System.out.println("Kaç TL para yatırmak istiyorsunuz: ");
				int tutar = scanner.nextInt();
				scanner.nextLine();
				hesap1.paraYatir(tutar);
			}
			else if (islem.equals("3")) {
				System.out.println("Kaç TL para çekmek istiyorsunuz: ");
				int tutar = scanner.nextInt();
				scanner.nextLine();
				hesap1.paraCek(tutar);
			}
		}
		
	}
}