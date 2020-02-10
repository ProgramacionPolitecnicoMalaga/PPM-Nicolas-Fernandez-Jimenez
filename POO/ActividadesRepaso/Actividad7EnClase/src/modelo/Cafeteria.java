package modelo;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Cafeteria {
    TreeMap<Integer,Mesa> mesas;
    TreeMap<String,Producto> carta;

    public Cafeteria() {
        this.mesas = new TreeMap<>();
        this.carta = new TreeMap<>();
    }

    public void addMesa(int numeroMesa) {
        mesas.put(numeroMesa, new Mesa(numeroMesa));
    }

    public void addProducto(String nombreProducto, double precio){
        Producto producto = new Producto(nombreProducto,precio);
        carta.put(nombreProducto,producto);
    }

    public void addProdctoAMesa(int numeroMesa, String nombreProducto) {
        Mesa mesa = mesas.get(numeroMesa);
        Producto producto = carta.get(nombreProducto);
        if ((mesa != null) && (producto != null)) {
            mesa.addProducto(producto);
        }
    }

    public ArrayList<Mesa> getMesasAbiertas() {
        ArrayList<Mesa> mesasAbiertas = new ArrayList<>();
        for (Map.Entry<Integer,Mesa> entry: mesas.entrySet()) {
            if (!entry.getValue().isCerrada())
                mesasAbiertas.add(entry.getValue());
        }
        return mesasAbiertas;
    }
}
