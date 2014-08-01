package negocio;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Entity implementation class for Entity: Estacionamento
 * 
 */
@Entity
public class Estacionamento implements Serializable {

	private int tipo_area;
	@Id
	private int numero;
	private int totalVagas;
	private static final long serialVersionUID = 1L;

	public Estacionamento() {
		super();
	}

	public int getTipo_area() {
		return tipo_area;
	}

	public int getNumero() {
		return numero;
	}

	public int getTotalVagas() {
		return totalVagas;
	}

	public void setTipo_area(int tipo_area) {
		this.tipo_area = tipo_area;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setTotalVagas(int totalVagas) {
		this.totalVagas = totalVagas;
	}

}
