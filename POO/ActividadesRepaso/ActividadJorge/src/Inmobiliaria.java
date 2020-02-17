import java.util.ArrayList;

public class Inmobiliaria {
    private ArrayList<Cliente> clientes;
    private ArrayList<Activo> ventas;
    private ArrayList<Activo> alquileres;

    //Clientes
    public void addCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    //Ventas
    public void addVenta(Activo activo) {
        ventas.add(activo);
    }

    public ArrayList<Activo> getVentas() {
        return ventas;
    }

    public void ponerEnVenta(Activo activo) {
        activo.setVenta(true);
        ventas.add(activo);
    }

    //Alquileres
    public void addAlquiler(Activo activo) {
        ventas.add(activo);
    }

    public ArrayList<Activo> getAlquileres() {
        return alquileres;
    }

    public void ponerEnAlquiler(Activo activo) {
        activo.setVenta(false);
        alquileres.add(activo);
    }
}
