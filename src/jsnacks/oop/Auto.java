package jsnacks.oop;

public class Auto {
	
	// Attributi
	private String marca;
	private String modello;
	private String targa;
	private long chilometraggio;
	
	// Costruttori
	public Auto() {
		this.chilometraggio = 0;
	}

	public Auto(String marca, String modello, String targa) {
		this.marca = marca;
		this.modello = modello;
		this.targa = targa;
		this.chilometraggio = 0;
	}

	// Getter Setter
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public String getTarga() {
		return targa;
	}

	public void setTarga(String targa) {
		this.targa = targa;
	}

	public long getChilometraggio() {
		return chilometraggio;
	}
	
	// Metodo viaggia
	public void viaggia(int km) {
		chilometraggio += km;
	}
	
}
