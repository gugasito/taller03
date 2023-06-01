import java.util.ArrayList;
public class Viaje {
	private String origen;
	private String destino;
	private String salida;
	private String llegada;
	private ArrayList<String> pasajeros;

	public String getOrigen() {
		return this.origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return this.destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getSalida() {
		return this.salida;
	}

	public void setSalida(String salida) {
		this.salida = salida;
	}

	public String getLlegada() {
		return this.llegada;
	}

	public void setLlegada(String llegada) {
		this.llegada = llegada;
	}

	public ArrayList<String> getPasajeros() {
		throw new UnsupportedOperationException();
	}

	public void setPasajeros(ArrayList<String> pasajeros) {
		throw new UnsupportedOperationException();
	}
}