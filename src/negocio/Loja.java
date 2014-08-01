package negocio;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Entity implementation class for Entity: Loja
 * 
 */
@Entity
public class Loja implements Serializable {

	@Id
	private String nome;
	private Espaco espaco;
	private Shopping shopping;
	private int qtd_funcionario;
	private int ramal;

	private static final long serialVersionUID = 1L;

	public Loja() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Espaco getEspaco() {
		return espaco;
	}

	public void setEspaco(Espaco espaco) {
		this.espaco = espaco;
	}

	public Shopping getShopping() {
		return shopping;
	}

	public void setShopping(Shopping shopping) {
		this.shopping = shopping;
	}

	public int getQtd_funcionario() {
		return qtd_funcionario;
	}

	public void setQtd_funcionario(int qtd_funcionario) {
		this.qtd_funcionario = qtd_funcionario;
	}

	public int getRamal() {
		return ramal;
	}

	public void setRamal(int ramal) {
		this.ramal = ramal;
	}

}
