import java.util.ArrayList;

public class Mesa {
    private int numeroMesa;
    private boolean cerrada;
    private ArrayList<Producto> productos;

    public Mesa(int numeroMesa, boolean cerrada) {
        this.numeroMesa = numeroMesa;
        cerrada = true;
    }

    public Mesa() {

    }

    public void addProducto(Producto producto) {
        productos.add(producto);
        cerrada = false;
    }

    public int getNumeroMesa() {
        return numeroMesa;
    }

    public boolean isCerrada() {
        return cerrada;
    }

    @Override
    public String toString() {
        return "Mesa{" +
                "numeroMesa=" + numeroMesa +
                ", cerrada=" + cerrada +
                '}';
    }
}
