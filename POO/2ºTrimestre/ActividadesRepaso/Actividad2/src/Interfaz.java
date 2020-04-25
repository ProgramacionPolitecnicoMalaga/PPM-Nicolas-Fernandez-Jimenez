public class Interfaz {

    public void opciones() {

        System.out.println("1. Empleados que vendieron un número de items");
        System.out.println("2. Obtener el promedio de ventas de cada uno");
        System.out.println("3. Averiguar quién han conseguido el mayor número de ventas en un día");
        System.out.println("4. Insertar un nuevo empleado y sus ventas");
        System.out.println("5. Terminar");
    }

    public void ventasBuscadas() {
        System.out.println("¿Qué numero de ventas desea consultar: ");
    }

    public void vendedorBuscado() {
        System.out.println("El vendedor que ha realizado dichas ventas es: ");
    }

    public void promedioVentas() {
        System.out.println("El promedio de venta de cada empleado es: ");
    }

    public void mayorVentasDiarias() {
        System.out.print("El vendedor que más ventas ha realizado hoy es ");
    }

    public void nombreEmpleado() {
        System.out.print("Indique el nombre del comercial: ");
    }

    public void apellidosEmpleado() {
        System.out.print("Indique los apellidos del empleado: ");
    }

    public void ventasEmpleado() {
        System.out.println("Indique el numero de ventas del empleado: ");
    }


}
