public class Cuadrado extends Figura{
    private double lado;

    public double area() {
        return Math.pow(lado,2);
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}
