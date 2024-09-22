package no.hvl.dat100.tabeller;

public class Tabeller {

	
	public static void skrivUt(int[] tabell) {
		System.out.println("Index\tVerdi");
		
		for (int i = 0; i < tabell.length; i++) {
			System.out.println(i + "\t" + tabell[i]);
		}
		

	}

	// b)
	public static String tilStreng(int[] tabell) {
		
		if (tabell == null || tabell.length == 0) {
			return "[]";
		}
		StringBuilder resultat = new StringBuilder();
		resultat.append("[");
		
		for (int i = 0; i < tabell.length; i++) {
			resultat.append(tabell[i]);
			
			if (i < tabell.length -1) {
				resultat.append(",");
			}
		}
		resultat.append("]");
		
		return resultat.toString();
		
	}

	// c)
	public static int summer(int[] tabell) {
		int sum = 0;
		for (int i = 0; i < tabell.length; i++) {
			sum += tabell[i];
		}
		return sum;
		
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		
		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				return true;
			}
		}
		return false;
		

	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		
		for(int i = 0; i < tabell.length; i++) {
			if (tall == tabell[i]) {
				return i;
			}
		}
		return -1;
	}

	// f)
	public static int[] reverser(int[] tabell) {
		int[] reversertTabell = new int[tabell.length];
		int j = 0;
		for (int i = tabell.length-1; i >= 0; i--) {
				reversertTabell[j] = tabell[i];
				j++;
			
		}
		return reversertTabell;
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		if (tabell.length == 0 || tabell.length <= 1) {
			return true;
		}
		
		for(int i = 0; i < tabell.length -1; i++) {
			if (tabell[i] > tabell[i+1]) {
				return false;
			}
		}
		return true;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		if(tabell1.length == 0 && tabell2.length == 0) {
			return null;  
			}
			else if(tabell1.length  == 0) {
				return tabell2;   
			}else if (tabell2.length == 0) {
				return tabell1;
			}else {
				int[] sattSammen = new int[tabell1.length + tabell2.length];
				for (int i = 0; i < tabell1.length; i++) {
					sattSammen[i] = tabell1[i];
				}
				for(int i = 0; i < tabell2.length; i++) {
					sattSammen[i+tabell1.length] = tabell2[i];
				}
				return sattSammen;
			}

	}
}
