import java.util.ArrayList;

public class Bus {
    private String patente;
    private String marca;
    private String modelo;
    private ArrayList<Viaje> viajes = new ArrayList<Viaje>();
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

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    public ArrayList<Viaje> getViajes() {
        return viajes;
    }

    public Bus(String patente, String marca, String modelo) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
    }
}