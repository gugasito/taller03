import static org.junit.jupiter.api.Assertions.*;

class EmpresaTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void testAgregarBus() {
        Empresa empresa = new Empresa(123456789, "direccion", "@redes");
        empresa.agregarBus("UJ-12-23", "Mercedes", "ModeloAlpha");
        empresa.agregarBus("UJ-12-21", "Mercedes", "ModeloAlpha");
        assertEquals(2, empresa.getBuses().size());
    }

    @org.junit.jupiter.api.Test
    void agregarConductor() {
    }

    @org.junit.jupiter.api.Test
    void asociarConductor() {
    }

    @org.junit.jupiter.api.Test
    void asociarViaje() {
    }

    @org.junit.jupiter.api.Test
    void generarViaje() {
    }

    @org.junit.jupiter.api.Test
    void mostrarViajes() {
    }

    @org.junit.jupiter.api.Test
    void testRevisarBus() {
        Empresa empresa = new Empresa(123456789, "direccion", "@redes");
        Bus bus1 = new Bus("UJ-12-23", "Mercedes", "ModeloAlpha");
        Bus bus2 = new Bus("UJ-12-22", "Mercedes", "ModeloAlpha");
        assertTrue(empresa.revisarBus(bus1,bus2));
    }
}