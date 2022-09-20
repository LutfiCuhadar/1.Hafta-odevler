
public class enBuyukSayiHangisi {

	public static void main(String[] args) {
		int sayi1 = 16;
		int sayi2 = 16;
		int sayi3 = 18;
		int enBuyuk = sayi1;
		
		if(enBuyuk < sayi2) {
			enBuyuk = sayi2;
		}
		
		if (enBuyuk < sayi3) {
			enBuyuk = sayi3;
		}
		
		else if(enBuyuk == sayi2 || enBuyuk == sayi3) {
			System.out.println("Sayılar Birbirne Eşittir");
			return;
		}
		
		System.out.println("En Büyük Sayı : " + enBuyuk);
	}

}
