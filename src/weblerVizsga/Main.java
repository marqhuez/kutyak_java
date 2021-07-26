package weblerVizsga;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		FajlKezelo fkObj = new FajlKezelo();
		List<Kutya> kutyaLista = fkObj.fajlBeOlvas("kutyak.txt");
		Feladatok feladatObj = new Feladatok();
		
		// 2. feladat
		System.out.println("2. feladat:");
		feladatObj.adatokKiir(kutyaLista);
		
		System.out.println();
		
		// 3. feladat
		System.out.println("3. feladat:");
		feladatObj.keverekKutyakSzamaKiir(kutyaLista);
		
		System.out.println();
		
		// 4. feladat
		System.out.println("4. feladat:");
		feladatObj.kutyaFajtaKeresKiir(kutyaLista);
		
		System.out.println();
		
		// 5. feladat
		System.out.println("5. feladat:");
		feladatObj.kutyaAdatKiirSzuressel(kutyaLista);
		
		System.out.println();
		
		// 6. feladat
		System.out.println("6. feladat:");
		feladatObj.kutyaFajtaSzamolKiir(kutyaLista);
		
	}
}
