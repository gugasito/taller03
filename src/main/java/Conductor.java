public class Conductor {
    private String nombre;
    private String apellido;
    private int telefono;
    private Licencia licencia;
    private Bus bus;

    public enum Licencia {A1, A2, A3, A4, A5}

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getTelefono() {
        return this.telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public Licencia getLicencia() {
        return this.licencia;
    }

    public void setLicencia(Licencia licencia) {
        this.licencia = licencia;
    }
}