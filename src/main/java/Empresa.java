import java.util.ArrayList;

public class Empresa {
	private int rut;
	private String direccion;
	private String rs;
	private ArrayList<Bus> buses = new ArrayList<Bus>();

	public int getRut() {
		return this.rut;
	}

	public void setRut(int rut) {
		this.rut = rut;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getRs() {
		return this.rs;
	}

	public void setRs(String rs) {
		this.rs = rs;
	}

	public Empresa(int rut, String direccion, String rs) {
		this.rut = rut;
		this.direccion = direccion;
		this.rs = rs;
	}

	public void agregarBus(){

	}

	public void agregarConductor(){

	}
}