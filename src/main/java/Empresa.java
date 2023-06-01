import java.sql.Time;
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

    public ArrayList<Bus> getBuses() {
        return buses;
    }

    public Empresa(int rut, String direccion, String rs) {
        this.rut = rut;
        this.direccion = direccion;
        this.rs = rs;
    }

    public void agregarBus(String patente, String marca, String modelo) {
        Bus bus = new Bus(patente, marca, modelo);
        for (int i = 0; i < buses.size(); i++) {
            if (revisarBus(buses.get(i), bus)) {
                buses.add(bus);
            } else {
                System.out.println("Un bus,ya está registrado con esta patente");
            }
        }

    }

    public Conductor agregarConductor(String nombre, String apellido, int telefono, Conductor.Licencia licencia) {
        return new Conductor(nombre, apellido, telefono, licencia);
    }

    public void asociarConductor(Conductor conductor, Bus bus) {
        bus.setConductor(conductor);
    }

    public void asociarViaje(Viaje viaje, Bus bus) {
        bus.getViajes().add(viaje);
    }

    public Viaje generarViaje(String origen, String destino, Time salida, Time llegada) {
        return new Viaje(origen, destino, salida, llegada);
    }

    public void mostrarViajes(ArrayList<Bus> buses, Time desde, Time hasta, String destino) {
        for (int i = 0; i < buses.size(); i++) {
            for (int j = 0; i < buses.get(i).getViajes().size(); j++) {
                if (buses.get(i).getViajes().get(j).getSalida().after(desde) && buses.get(i).getViajes().get(j).getSalida().before(hasta) && buses.get(i).getViajes().get(j).getDestino().equals(destino)) {
                    System.out.println(buses.get(i).getViajes().get(j));
                }
            }
        }
    }

    public boolean revisarBus(Bus bus1, Bus bus2) {
        return !bus1.getPatente().equals(bus2.getPatente());
    }
}