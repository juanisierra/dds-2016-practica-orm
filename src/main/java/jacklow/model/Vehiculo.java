package jacklow.model;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Vehiculo {
	@Id
	private String vtu;
	private String patente;
	
	public Vehiculo(){}
	public Vehiculo(String vtu, String patente) {
		super();
		this.vtu = vtu;
		this.patente = patente;
	}

	public String getVtu() {
		return vtu;
	}

	public String getPatente() {
		return patente;
	}

}
