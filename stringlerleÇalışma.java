
public class stringlerleÇalışma {

	public static void main(String[] args) {
		String mesaj = "Bu gün hava çok güzel";
		System.out.println(mesaj);
		
		/*System.out.println("Eleman sayısı: " + mesaj.length());
		System.out.println("5. Eleman : " + mesaj.charAt(7));
		System.out.println(mesaj.concat(" Lütfi"));
		System.out.println(mesaj.startsWith("B"));
		System.out.println(mesaj.endsWith("i"));
		char[] karakterler = new char[10];
		mesaj.getChars(0, 9, karakterler, 0);
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf("g"));
		System.out.println(mesaj.lastIndexOf("g"));*/
		
		String yeniMesaj = mesaj.replace(' ', '-'); //Değiştirme işlemi yapar
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(2,5)); //Parçalama işlemi yapar
		System.out.println();
		
		for(String kelime : mesaj.split(" ")) { //Kelimeleri alt alta sıralar
			System.out.println(kelime);
		}
		
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		System.out.println(mesaj.trim());
	}

}
