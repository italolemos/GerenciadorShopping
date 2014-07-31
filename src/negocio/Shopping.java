package negocio;

import java.io.Serializable;

/**
 * Entity implementation class for Entity: Shopping
 * 
 */
@Entity
public class Shopping implements Serializable {
	@Id
	private int id_shopping;
	private String nome;
	private String rua;
	private int numero;
	private String bairro;
	private String cidade;
	private String estado;

	private static final long serialVersionUID = 1L;

	public Shopping() {
		super();
	}

	public int getId_shopping() {
		return id_shopping;
	}

	private void setId_shopping(int id_shopping) {
		this.id_shopping = id_shopping;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
