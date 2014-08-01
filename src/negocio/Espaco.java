package negocio;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Entity implementation class for Entity: Espaco
 * 
 */
@Entity
public class Espaco implements Serializable {
	@Id
	private int id_espaco;
	private String ala;
	private double tamanho;
	private Shopping shopping;

	private static final long serialVersionUID = 1L;

	public Espaco() {
		super();
	}

	public int getId_espaco() {
		return id_espaco;
	}

	private void setId_espaco(int id_espaco) {
		this.id_espaco = id_espaco;
	}

	public String getAla() {
		return ala;
	}

	public void setAla(String ala) {
		this.ala = ala;
	}

	public double getTamanho() {
		return tamanho;
	}

	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}

	public Shopping getShopping() {
		return shopping;
	}

	public void setShopping(Shopping shopping) {
		this.shopping = shopping;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
