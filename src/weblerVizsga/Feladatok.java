package weblerVizsga;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Feladatok {
	
	// 2. feladat
	public void adatokKiir(List<Kutya> kutyaLista) {
		
		for (Kutya kutya : kutyaLista) {
			
			System.out.print(kutya.getAzonosito());
			System.out.print("\t");
			System.out.print(kutya.getBecenev());
			System.out.print("\t");
			System.out.print(kutya.getFajta());
			
			if(kutya.getFajta().length() < 9) {
				System.out.print("\t");
			}
			
			System.out.print("\t");
			System.out.print(kutya.getKor());
			System.out.print("\t");
			System.out.print(kutya.getNem());
			System.out.print("\t");
			System.out.print(kutya.getIvartalanitottSzovegesen());
			System.out.println();
			
		}
	}
	
	// 3. feladat
	public void keverekKutyakSzamaKiir(List<Kutya> kutyaLista) {
		
		int keverekSzam = 0;
		
		for (Kutya kutya : kutyaLista) {
			if(kutya.getFajta().equals("keverék")) {
				keverekSzam++;
			}
		}

		System.out.println("Keverék kutyák száma: " + keverekSzam);
		
	}
	
	// 4. feladat
	public void kutyaFajtaKeresKiir(List<Kutya> kutyaLista) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {

			System.out.print("Adj meg egy kutyafajtát: ");
			String kutyaFajta = br.readLine();
			Boolean vanIlyenFajta = false;
			br.close();
			
			for (Kutya kutya : kutyaLista) {
				
				if (kutya.getFajta().equals(kutyaFajta)) {
					
					vanIlyenFajta = true;
					
					System.out.print(kutya.getAzonosito());
					System.out.print("\t");
					System.out.print(kutya.getBecenev());
					System.out.print("\t");
					System.out.print(kutya.getFajta());
					
					if(kutya.getFajta().length() < 9) {
						System.out.print("\t");
					}
					
					System.out.print("\t");
					System.out.print(kutya.getKor());
					System.out.print("\t");
					System.out.print(kutya.getNem());
					System.out.print("\t");
					System.out.print(kutya.getIvartalanitottSzovegesen());
					System.out.println();
				}
			}
			
			if(!vanIlyenFajta) {
				System.out.println("Nincs '" + kutyaFajta + "' fajtájú kutya a menhelyen.");
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// 5. feladat
	public void kutyaAdatKiirSzuressel(List<Kutya> kutyaLista) {
		
		for (Kutya kutya : kutyaLista) {
			
			if(kutyaAdatTesztel(kutya)) {
				
				System.out.print(kutya.getAzonosito());
				System.out.print("\t");
				System.out.print(kutya.getBecenev());
				System.out.print("\t");
				System.out.print(kutya.getFajta());
				
				if(kutya.getFajta().length() < 9) {
					System.out.print("\t");
				}
				
				System.out.print("\t");
				System.out.print(kutya.getKor());
				System.out.print("\t");
				System.out.print(kutya.getNem());
				System.out.print("\t");
				System.out.print(kutya.getIvartalanitottSzovegesen());
				System.out.println();
				
			}
		}
	}
	
	private Boolean kutyaAdatTesztel(Kutya kutya) {
		
		if(kutya.getFajta().equals("magyar vizsla")) {
			if(kutya.isIvartalanitott()) {
				if(kutya.getNem().equals("kan")) {
					if(kutya.getKor() <= 2) {
						
						return true;
						
					}
				}
			}
		}
		
		return false;
	}
	
	// 6. feladat
	public void kutyaFajtaSzamolKiir(List<Kutya> kutyaLista) {
		
		Set<String> kutyaFajtak = new HashSet<>();
		
		for (Kutya kutya : kutyaLista) {
			kutyaFajtak.add(kutya.getFajta());
		}
		
		System.out.println("Kutyafajták száma: " + kutyaFajtak.size());
		System.out.println("Kutyafajták:");
		
		for (String kutyaFajta : kutyaFajtak) {
			System.out.println("- " + kutyaFajta);
		}
		
	}
}























