public class Activo {
    private String  estado;
    private Localizacion localizacion;
    private int numeroHabitaciones, metrosCuadrados;
    private double precio;
    private boolean ascensor, venta;

    public Activo(Localizacion localizacion, int numeroHabitaciones, int metrosCuadrados, boolean ascensor, String estado, double precio) {
        this.localizacion = localizacion;
        this.estado = estado;
        this.numeroHabitaciones = numeroHabitaciones;
        this.metrosCuadrados = metrosCuadrados;
        this.precio = precio;
        this.ascensor = true;
        this.venta = true;
    }

    public Localizacion getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(Localizacion localizacion) {
        this.localizacion = localizacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getNumeroHabitaciones() {
        return numeroHabitaciones;
    }

    public void setNumeroHabitaciones(int numeroHabitaciones) {
        this.numeroHabitaciones = numeroHabitaciones;
    }

    public int getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(int metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isAscensor() {
        return ascensor;
    }

    public void setAscensor(boolean ascensor) {
        this.ascensor = ascensor;
    }

    public boolean isVenta() {
        return venta;
    }

    public void setVenta(boolean venta) {
        this.venta = venta;
    }
}
