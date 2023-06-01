import java.util.Vector;

public class Bus {
	private String patente;
	private String marca;
	private String modelo;
	private Vector<Viaje> viajes = new Vector<Viaje>();
	private Conductor conductor;

	public String getPatente() {
		return this.patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


}