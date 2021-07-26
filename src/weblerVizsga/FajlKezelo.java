package weblerVizsga;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class FajlKezelo {
	
	// 1. feladat
	public List<Kutya> fajlBeOlvas(String fajlNev) {
		
		List<Kutya> kutyaLista = new ArrayList<>();
		
		try {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fajlNev), "UTF-8"));
			
			br.readLine();
			
			while(br.ready()) {
				
				String sor = br.readLine();
				String[] sorAdatok = sor.split(";");
				
				Kutya kutyaObj = new Kutya(Integer.parseInt(sorAdatok[0]), sorAdatok[1], sorAdatok[2], Byte.parseByte(sorAdatok[3]), sorAdatok[4], sorAdatok[5].equals("1"));
				
				kutyaLista.add(kutyaObj);
			}
			
			br.close();
			
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return kutyaLista;
		
	}
}
