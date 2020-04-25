public class Comisionado extends Empleado {
    private int ventasRealizadas;
    private int gananciasPorVenta;
    private double sueldoBase;
    private double sueldoTotal;

    public Comisionado(String nombre, int ventasRealizadas, double sueldoBase) {
        super(nombre);
        this.ventasRealizadas = ventasRealizadas;
        this.sueldoBase = sueldoBase;
        this.gananciasPorVenta = 50;
    }

    public void calcularSueldoComisionados() {
        sueldoTotal = (ventasRealizadas * gananciasPorVenta) + sueldoBase;
    }

    @Override
    public String toString() {
        return "Comisionado{" +
                "ventasRealizadas=" + ventasRealizadas +
                ", gananciasPorVenta=" + gananciasPorVenta +
                ", sueldoBase=" + sueldoBase +
                ", sueldoTotal=" + sueldoTotal +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
