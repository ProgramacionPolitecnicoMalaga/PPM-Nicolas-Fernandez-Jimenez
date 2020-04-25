public class Comercial {
    private String nombre;
    private String apellidos;
    private int[] ventas;

    public Comercial(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        ventas = new int[5];
    }

    public void añadirVenta(int venta1, int venta2, int venta3, int venta4, int venta5) {
        ventas = new int[]{venta1, venta2, venta3, venta4, venta5};
    }

    public boolean comprobarVentas(int ventasBuscadas) {
        boolean encontrado = false;
        for (int i = 0; i < 5; i++) {
            if (ventas[i] == ventasBuscadas) {
                encontrado = true;
            }
        }
        return encontrado;
    }

    public double calcularPromedioVentas() {
        double ventasTotales = 0.0;
        for (int i = 0; i < 5; i++) {
            ventasTotales += ventas[i];
        }
        return ventasTotales / 5;
    }

    public int ventasDiarias() {
        int mayorNumeroVentas = 0;
        for (int i = 0; i < 5; i++) {
            if (ventas[i] > mayorNumeroVentas) {
                mayorNumeroVentas = ventas[i];
            }
        }return mayorNumeroVentas;
    }

    public int[] getVentas() {
        return ventas;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
