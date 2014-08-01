package negocio;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Entity implementation class for Entity: Funcionario
 * 
 */
@Entity
public class Funcionario implements Serializable {
	@Id
	private int id_funcionario;
	private String nomeFuncioario;

	private enum Sexo {
		Masculino, Feminino
	};

	private Turno turno;
	private Shopping shopping;
	private String carteiraTrabalho;

	private static final long serialVersionUID = 1L;

	public Funcionario() {
		super();
	}

}
