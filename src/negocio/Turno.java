package negocio;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Entity implementation class for Entity: Turno
 * 
 */
@Entity
public class Turno implements Serializable {

	@Id
	@GeneratedValue
	private long idTurno;
	private String nomeTurno;

	public long getIdTurno() {
		return idTurno;
	}

	public void setIdTurno(long idTurno) {
		this.idTurno = idTurno;
	}

	public String getNomeTurno() {
		return nomeTurno;
	}

	public void setNomeTurno(String nomeTurno) {
		this.nomeTurno = nomeTurno;
	}

	private static final long serialVersionUID = 1L;

	public Turno() {
		super();
	}

}
