public class Circulo extends Figura{
    private double radio;

    public double area() {
        return Math.PI * Math.pow(radio,2);
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}
