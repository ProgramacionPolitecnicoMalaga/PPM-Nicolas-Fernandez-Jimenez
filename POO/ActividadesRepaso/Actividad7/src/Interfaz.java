import java.util.Scanner;

public class Interfaz {
    public static final int MESAS_ABIERTAS = 1;
    public static final int MESAS_CERRADAS = 2;
    public static final int CAJA_ACTUAL = 3;
    public static final int CREAR_PRODUCTO = 4;
    public static final int AÑADIR_PRODUCTO = 5;
    public static final int CERRAR_MESA = 6;
    public static final int TERMINAR = 7;

    Scanner lectorTeclado = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println("" +
                "1. Consultar mesas abiertas.\n" +
                "2. Consultar mesas cerradas.\n" +
                "3. Consultar el recuento de caja actual.\n" +
                "4. Añadir productos a la lista de productos(Crear nuevo producto).\n" +
                "5. Añadir producto a una mesa.\n" +
                "6. Cerrar mesa (Cobrarla).\n" +
                "7. Terminar");
        return lectorTeclado.nextInt();
    }

    public boolean mesasAbiertasOCerradas() {
        System.out.println("Indique el número de mesa que quiere consultar");
        lectorTeclado.next();
        return true;
    }

    public Producto nuevoProducto(Producto producto) {
        System.out.println("Indique el nombre del producto: ");
        lectorTeclado.next();
        System.out.println("Precio del producto: ");
        lectorTeclado.nextDouble();
        return producto;
    }
}
