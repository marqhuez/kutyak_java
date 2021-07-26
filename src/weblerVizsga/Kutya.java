package weblerVizsga;

public class Kutya {
	
	private Integer azonosito;
	private String becenev;
	private String fajta;
	private Byte kor;
	private String nem;
	private Boolean ivartalanitott;
	
	public Kutya(Integer azonosito, String becenev, String fajta, Byte kor, String nem, Boolean ivartalanitott) {
		this.azonosito = azonosito;
		this.becenev = becenev;
		this.fajta = fajta;
		this.kor = kor;
		this.nem = nem;
		this.ivartalanitott = ivartalanitott;
	}

	public Integer getAzonosito() {
		return azonosito;
	}

	public String getBecenev() {
		return becenev;
	}

	public String getFajta() {
		return fajta;
	}

	public Byte getKor() {
		return kor;
	}

	public String getNem() {
		return nem;
	}

	public Boolean isIvartalanitott() {
		return ivartalanitott;
	}
	
	public String getIvartalanitottSzovegesen() {
		return ivartalanitott ? "Ivartalanított" : "Nem ivartalanított";
	}
	
}
