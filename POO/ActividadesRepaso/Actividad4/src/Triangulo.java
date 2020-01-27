public class Triangulo extends Figura{
    private double base,altura;

    public double area() {
        return base * altura / 2;
    }

    public void setBaseAltura(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
}
