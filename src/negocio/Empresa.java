package negocio;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Entity implementation class for Entity: Empresa
 * 
 */
@Entity
public class Empresa implements Serializable {

	@Id
	private String nomeEmpresa;
	private String tipoEmpresa;
	private static final long serialVersionUID = 1L;

	public Empresa() {
		super();
	}

}
