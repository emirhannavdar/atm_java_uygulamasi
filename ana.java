
public class ana {
	public static void main(String[] args) {
		atm atm1 = new atm();
		
		hesap hesap1 = new hesap("emirhan navdar", "szdrx122" , 10000);
		
		
		atm1.calis(hesap1);
		System.out.println("Programdan çıkılıyor...");
	}
}