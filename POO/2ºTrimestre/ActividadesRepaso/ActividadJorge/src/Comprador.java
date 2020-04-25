public class Comprador extends Cliente {
    private boolean pagoAPlazos;

    public Comprador(String nombre, String apellidos, String dni, String direccionContacto, int telefonoContacto) {
        super(nombre, apellidos, dni, direccionContacto, telefonoContacto);
    }
}
