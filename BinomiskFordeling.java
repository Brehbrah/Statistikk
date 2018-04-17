import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;
import static java.lang.Double.*;
import static java.lang.Math.*;
import java.util.*;
import java.text.DecimalFormat;
import java.io.*;

public class BinomiskFordeling {
	
	public static void main(String[] args) {
		
		String n = showInputDialog("Angi antall n-verdi:"); // 85
		String x = showInputDialog("Angi antall x-enheter:"); //3
		double p = parseDouble(showInputDialog("Angi p(A) verdi:"));

	 	final int N_MAX = parseInt(n);
	 	final int X_MAX = parseInt(x);

		int [] nArray = new int [N_MAX]; 
		int [] xArray = new int [X_MAX];

		int teller = antRekkeFølge(N_MAX, X_MAX);
		int nevner = xFakultet(xArray, X_MAX);
		int sumArray = teller/nevner;

		double pTall = Math.pow(p, X_MAX);
		double pTall2 = Math.pow((1-p),(N_MAX-X_MAX));
		double sum = (sumArray * pTall) * pTall2;
		//System.out.println(pTall);
		System.out.println(sum);
	}

	public static int antRekkeFølge(int n, int x) {

		int [] tab = new int[x];

		int j = 0;
		while(x > 0) {
		  tab[j] = n; //0
		  n = n - 1; //3
		  x--;
		  j++;
		}

		int sum = tab[0];

		for(int i=1; i<tab.length; i++){
		  sum = sum * tab[i];
		}  
		return sum;
	} 
		

	public static int fakultet(int maxTall) {

		int beregne = 1;
		for (int i = 1; i <= maxTall; i++) {
			beregne = beregne * i; // Her beregnes det fakultet
			// printer ut alle maxgrensen
		}
		return beregne;
	}	

	public static int xFakultet(int [] array, int MAX) {

		int sum = 1;
		for(int i = 1; i < array.length; i++) {
			//int x = parseInt(showInputDialog("Angi antall x-verdi"));
			sum = fakultet(MAX);
			//System.out.println("x: " + sum);
			break;
		}
		return sum;
	}

}