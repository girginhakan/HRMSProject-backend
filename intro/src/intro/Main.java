package intro;

public class Main {

	public static void main(String[] args) {
		//camelCase
		String internetSubeButonu ="�nternet �ubesi";
		double dolarDun =8.15;
		double dolarBugun =8.1;
		int vade = 36;
		boolean dustuMu =false;
		
		
		System.out.println(internetSubeButonu);
		
		if(dolarBugun<dolarDun) {
			System.out.println("Dolar D��t� ikonu");
		}else if(dolarBugun>dolarDun) {
			System.out.println("Dolar y�kseldi ikonu");
		}else {
			System.out.println("Dolar e�ittir ikonu");
		}
		
		
		String kredi1="H�zl� Kredi";
		String kredi2="Mutlu emeklilik Kredi";
		String kredi3="Konut Kredi";
		String kredi4="�ift�i Kredi";
		String kredi5="MSB Kredi";
		String kredi6="MEB Kredi";
		
		System.out.println(kredi1);
		System.out.println(kredi2);
		System.out.println(kredi3);
		System.out.println(kredi4);
		System.out.println(kredi5);
		System.out.println(kredi6);
		
		
		String[] krediler = {
				"H�zl� Kredi",
				"Mutlu emeklilik Kredi",
				"Konut Kredi",
				"�ift�i Kredi",
				"MSB Kredi",
				"MEB Kredi"
				};
		
		for(String kredi : krediler ) {
			System.out.println(kredi);
		}
		for(int i=0;i<krediler.length;i++) {
			System.out.println(krediler[i]);
		}
	}

}
