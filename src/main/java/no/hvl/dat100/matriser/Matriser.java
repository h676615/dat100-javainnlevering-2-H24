package no.hvl.dat100.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
		for (int[] rad: matrise) {
			
			for (int element: rad) {
				System.out.println(element + " ");
			}
			
		}
		
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		
		StringBuilder resultat = new StringBuilder();
		
		for (int[] rad: matrise) {
			
			for(int element: rad) {
				resultat.append(element + " ");
				
			}
			resultat.append("\n");
		}
		return resultat.toString();
		
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
	
	      
	      int[][] resultat = new int[matrise.length][matrise[0].length];
	      
	      for (int i = 0; i < matrise.length; i++) {
	    	  for (int j = 0; j < matrise[0].length; j++) {
	    		  resultat[i][j] = matrise[i][j] * tall;
	    	  }
	      }
	      return resultat;
		
	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		if (a.length != b.length || a[0].length != b[0].length) {
			return false;
		}
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[0].length; j++) {
				if (a[i][j] != b[i][j]) {
					return false;
				}
			}
			
		}
		return true;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {
		if(matrise.length != matrise[0].length) {
			return null;
		}
		
		int[][] resultat = new int[matrise.length][matrise[0].length];
		  
		for (int i = 0; i < matrise.length; i++) {
	    	  for (int j = 0; j < matrise[0].length; j++) {
	    		  resultat[i][j] = matrise[j][i];
	    	  }
		}
		return resultat;
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden multipliser ikke implementert");
	
	}
}
