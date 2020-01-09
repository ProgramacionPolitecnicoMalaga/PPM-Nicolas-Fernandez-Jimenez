import java.util.Scanner;

public class MiMain {
    public static void main(String[] args) {
        int unidad = 0;
        int opcion = 0;
        String opcionUnidad = null;
        double resultado = 0;
        double hipotenusa = 0;
        double cateto1 = 0;
        double cateto2 = 0;

        Scanner lectorTeclado = new Scanner(System.in);

        System.out.println("¿Qué unidad desea utilizar?");
        System.out.println("1.mm");
        System.out.println("2.cm");
        System.out.println("3.m");

        unidad = lectorTeclado.nextInt();

        if (unidad == 1) {
            opcionUnidad = "mm";
        } else if (unidad == 2) {
            opcionUnidad = "cm";
        } else if (unidad == 3) {
            opcionUnidad = "m";
        }

        /*switch (unidad)  {
            case 1:
                System.out.println("mm");
            case 2:
                System.out.println("cm");
            case 3:
                System.out.println("m");
        }*/

        System.out.println("¿Qué operación desea realizar?");
        System.out.println("1. Calcular la hipotenusa de un triángulo a partir de sus catetos.");
        System.out.println("2. Calcular un cateto de un triángulo a partir de el otro cateto y la hipotenusa");
        System.out.println("3. Calcular el área de un triángulo a partir un cateto y la hipotenusa");
        System.out.println("4. Caluclar el área de un triángulo a partir de dos catetos.");
        System.out.println("Elige una opción:");

        opcion = lectorTeclado.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Introduzca el valor del primer cateto");
                cateto1 = lectorTeclado.nextDouble();
                System.out.println("Introduzca el valor del segundo cateto");
                cateto2 = lectorTeclado.nextDouble();
                break;
            case 2:
                System.out.println("Introduzca el valor del cateto");
                cateto1 = lectorTeclado.nextDouble();
                System.out.println("Introduzca el valor de la hipotenusa");
                hipotenusa = lectorTeclado.nextDouble();
                break;
            case 3:
                System.out.println("Introduzca el valor de cateto");
                cateto1 = lectorTeclado.nextDouble();
                System.out.println("Introduzca el valor de la hipotenusa");
                hipotenusa = lectorTeclado.nextDouble();
                break;
            case 4:
                System.out.println("Introduzca el valor del primer cateto");
                cateto1 = lectorTeclado.nextDouble();
                System.out.println("Introduzca el valor del segundo cateto");
                cateto2 = lectorTeclado.nextDouble();
                break;
        }

        if (opcion == 1) {
            resultado = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
        } else if (opcion == 2) {
            resultado = Math.sqrt(Math.pow(cateto1, 2) - Math.pow(hipotenusa, 2));
        } else if (opcion == 3) {
            resultado = ((cateto1 * hipotenusa) / 2);
        } else if (opcion == 4) {
            resultado = ((cateto1 * cateto2) / 2);
        }

        System.out.println("El resultado de la operación es = " + resultado + " " + opcionUnidad);
    }
}
