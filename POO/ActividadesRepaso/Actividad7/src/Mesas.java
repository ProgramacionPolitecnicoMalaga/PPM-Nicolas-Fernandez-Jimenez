import java.util.ArrayList;

public class Mesas {
    ArrayList<Mesa> mesas;


    public void mostrarMesas() {
        System.out.println(mesas);
    }

    public void mostrarMesasAbiertas(Mesa mesa) {
        System.out.println("Las mesas abiertas son: ");
        for (int i = 0; i < mesas.size(); i++) {
            if (!mesa.isCerrada()) {
                System.out.println(mesa.getNumeroMesa());
            }
        }
    }

    public void mostrarMesasCerradas(Mesa mesa) {
        System.out.println("Las mesas cerradas son: ");
        for (int i = 0; i < mesas.size(); i++) {
            if (mesa.isCerrada()) {
                System.out.println(mesa.getNumeroMesa());
            }
        }
    }
}
