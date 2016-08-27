package jacklow.model;

import java.time.LocalDateTime;

import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.uqbarproject.jpa.java8.extras.convert.LocalDateTimeConverter;
	@Entity
public class Robo {
		
	@Convert(converter = LocalDateTimeConverter.class)
	private LocalDateTime fecha;
	private String denunciante;
	private String operador;
	private String zona;
	@Id
	private String codigoDenuncia;
	public Robo(){}
	public LocalDateTime getFecha() {
		return fecha;
	}

	public String getDenunciante() {
		return denunciante;
	}

	public String getOperador() {
		return operador;
	}

	public String getZona() {
		return zona;
	}

	public String getCodigoDenuncia() {
		return codigoDenuncia;
	}

}
