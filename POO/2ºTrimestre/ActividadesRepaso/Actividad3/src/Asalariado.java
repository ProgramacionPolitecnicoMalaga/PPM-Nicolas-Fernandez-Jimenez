public class Asalariado extends Empleado {
    public double sueldoTotal;

    public Asalariado(String nombre, double sueldoTotal) {
        super(nombre);
        sueldoTotal = 0.0;
    }

    public void calcularSueldoAsalariados() {
        sueldoTotal = sueldoTotal;
    }

    @Override
    public String toString() {
        return "Asalariado{" +
                "sueldoTotal=" + sueldoTotal +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
