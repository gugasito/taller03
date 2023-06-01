import java.sql.Time;
import java.util.ArrayList;
public class Viaje {
	private String origen;
	private String destino;
	private Time salida;
	private Time llegada;
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

	public Time getSalida() {
		return this.salida;
	}

	public void setSalida(Time salida) {
		this.salida = salida;
	}

	public Time getLlegada() {
		return this.llegada;
	}

	public void setLlegada(Time llegada) {
		this.llegada = llegada;
	}

	public ArrayList<String> getPasajeros() {
		throw new UnsupportedOperationException();
	}

	public void setPasajeros(ArrayList<String> pasajeros) {
		throw new UnsupportedOperationException();
	}

	public Viaje(String origen, String destino, Time salida, Time llegada) {
		this.origen = origen;
		this.destino = destino;
		this.salida = salida;
		this.llegada = llegada;
	}

	@Override
	public String toString() {
		return "Viaje{" +
				"origen='" + origen + '\'' +
				", destino='" + destino + '\'' +
				", salida=" + salida +
				", llegada=" + llegada +
				'}';
	}
}