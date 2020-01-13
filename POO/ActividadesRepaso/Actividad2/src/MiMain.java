import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class MiMain {
    public static void main(String[] args) {
        int opcion = 0;
        Scanner lectorTeclado = new Scanner(System.in);
        Interfaz interfaz = new Interfaz();
        //CREAMOS LOS COMERCIALES Y AÑADIMOS LAS VENTAS
        Comercial comercial1 = new Comercial("Isabel", "Castillo");
        Comercial comercial2 = new Comercial("Vicente", "Calzado");
        comercial1.añadirVenta(7,7,10,6,4);
        comercial2.añadirVenta(4,7,5,4,5);

        interfaz.opciones();
        opcion = lectorTeclado.nextInt();
        while (opcion != 5) {
            switch (opcion) {
                case 1:
                    interfaz.ventasBuscadas();
                    int numeroVentas = lectorTeclado.nextInt();
                    interfaz.vendedorBuscado();
                    if (comercial1.comprobarVentas(numeroVentas)){
                        System.out.println(comercial1.toString());
                    }
                    if (comercial2.comprobarVentas(numeroVentas)){
                        System.out.println(comercial2.toString());
                    } else {
                        System.out.println("Nadie ha realizado ese número de ventas.");
                    }
                    System.out.println("==========================================================");
                    interfaz.opciones();
                    opcion = lectorTeclado.nextInt();
                    break;
                case 2:
                    interfaz.promedioVentas();
                    if (comercial1.calcularPromedioVentas() > comercial2.calcularPromedioVentas()) {
                        System.out.println(comercial1.toString() + " = " + comercial1.calcularPromedioVentas() + " * " + "\n" + comercial2.toString() + " = " + comercial2.calcularPromedioVentas());
                    }
                    System.out.println("==========================================================");
                    interfaz.opciones();
                    opcion = lectorTeclado.nextInt();
                    break;
                case 3:
                    if (comercial1.ventasDiarias() > comercial2.ventasDiarias()) {
                        interfaz.mayorVentasDiarias();
                        System.out.println(comercial1.toString() + " habiendo realizado " + comercial1.ventasDiarias() + " ventas");
                    } else {
                        interfaz.mayorVentasDiarias();
                        System.out.println(comercial2.toString() + " habiendo realizado " + comercial2.ventasDiarias() + " ventas");
                    }
                    System.out.println("==========================================================");
                    interfaz.opciones();
                    opcion = lectorTeclado.nextInt();
                    break;
                case 4:
                    interfaz.nombreEmpleado();
                    String nombre = lectorTeclado.next();
                    interfaz.apellidosEmpleado();
                    String apellidos = lectorTeclado.next();
                    interfaz.ventasEmpleado();
                    Comercial comercial3 = new Comercial(nombre, apellidos);
                    System.out.print("Venta 1: ");
                    int venta1 = lectorTeclado.nextInt();
                    System.out.print("Venta 2: ");
                    int venta2 = lectorTeclado.nextInt();
                    System.out.print("Venta 3: ");
                    int venta3 = lectorTeclado.nextInt();
                    System.out.print("Venta 4: ");
                    int venta4 = lectorTeclado.nextInt();
                    System.out.print("Venta 5: ");
                    int venta5 = lectorTeclado.nextInt();
                    comercial3.añadirVenta(venta1, venta2, venta3, venta4, venta5);
                    System.out.println("¡Nuevo comercial registrado!");
                    System.out.println("==========================================================");
                    interfaz.opciones();
                    opcion = lectorTeclado.nextInt();
                    break;
            }
        }
    }
}
