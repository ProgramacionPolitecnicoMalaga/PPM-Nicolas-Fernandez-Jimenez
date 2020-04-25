import java.util.ArrayList;

public class Cafeteria {
    private ArrayList<Mesa> mesas;
    private ArrayList<Producto> carta;

    public void addProdctoAMesa(int numeroMesa, String nombreProducto) {
        Mesa mesa = mesas.get(numeroMesa);
        Producto producto = carta.get(Integer.parseInt(nombreProducto));
        if ((mesa != null) && (producto != null)) {
            mesa.addProducto(producto);
        }
    }

    public void addMesa(int numeroMesa, boolean cerrada) {
        mesas.add(new Mesa(numeroMesa,cerrada));
        System.out.println("La mesa se ha añadido");
    }

    public void addProducto(String nombre, double precio) {
        carta.add(new Producto(nombre,precio));
        System.out.println("Producto añadido");
    }
}
