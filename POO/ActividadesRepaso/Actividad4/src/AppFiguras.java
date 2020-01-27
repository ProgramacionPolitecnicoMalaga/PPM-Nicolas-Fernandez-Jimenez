public class AppFiguras {
    public static void main(String[] args) {
        Figura[] arrayFiguras = new Figura[3];

        //CIRCULO
        Circulo circulo = new Circulo();

        circulo.setColor("green");
        circulo.setRadio(3.5);

        //CUADRADO
        Cuadrado cuadrado = new Cuadrado();

        cuadrado.setColor("red");
        cuadrado.setLado(5);

        //TRIANGULO
        Triangulo triangulo = new Triangulo();

        triangulo.setColor("blue");
        triangulo.setBaseAltura(3,2);

        arrayFiguras[0] = circulo;
        arrayFiguras[1] = cuadrado;
        arrayFiguras[2] = triangulo;

        for (int i = 0; i < 3; i++) {
            System.out.println(arrayFiguras[i].getColor());
            System.out.println(arrayFiguras[i].area());
        }
    }
}
