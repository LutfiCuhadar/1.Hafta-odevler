
public class sayiAsalMi {

	public static void main(String[] args) {
		int number = 9;
		int remainder = number % 2;
		boolean isPrime = true;
		
		if(number==1) {
			System.out.println("Sayı asal değildir");
			return;
		}
		
		if(number<1) {
			System.out.println("geçersiz sayı girdiniz");
		}
		
		for(int i=2; i<number; i++) {
			if(number % i == 0) {
				isPrime = false;
			}
		}

		if(isPrime) {
			System.out.println("Sayı asaldır");
		}else {
			System.out.println("Sayı asal değildir");
		}
		
	}

}
