public class PorHoras extends Empleado {
    public int horasTrabajadas = 0;
    public double gananciasPorHora = 0.0;
    private double sueldoTotal;

    public PorHoras(String nombre, int horasTrabajadas, double gananciasPorHora) {
        super(nombre);
        this.horasTrabajadas = horasTrabajadas;
        this.gananciasPorHora = gananciasPorHora;
    }

    public double calcularSueldoPorHoras() {
        sueldoTotal = horasTrabajadas * gananciasPorHora;
        return sueldoTotal;
    }

    @Override
    public String toString() {
        return "PorHoras{" +
                "horasTrabajadas=" + horasTrabajadas +
                ", gananciasPorHora=" + gananciasPorHora +
                ", sueldoTotal=" + sueldoTotal +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
