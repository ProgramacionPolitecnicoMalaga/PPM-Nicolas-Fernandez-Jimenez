public class Main {
    private static Interfaz interfaz;
    private static Producto producto;
    private static Productos productos;
    private static Mesas mesas;
    private static Cafeteria cafeteria;
    public static void main(String[] args) {
        interfaz = new Interfaz();
        cafeteria = new Cafeteria();
        init();

        Mesa mesa = new Mesa();

        int opcion = -1;

        cafeteria.addMesa(1,true);
        cafeteria.addMesa(2,false);
        cafeteria.addMesa(3,true);

        mesas.mostrarMesas();

        //Consultar mesas abiertas.
        mesas.mostrarMesasAbiertas(mesa);

        //Consultar mesas cerradas.
        mesas.mostrarMesasCerradas(mesa);

        //Consultar el recuento de caja actual.


        //Añadir productos a la lista de productos(Crear nuevo producto).
        cafeteria.addProducto("Catalana",1.50);

        //Añadir producto a una mesa.
        cafeteria.addProdctoAMesa(1,"Catalana");

        //Cerrar mesa (Cobrarla).

        /*opcion = interfaz.mostrarMenu();
        while (opcion != Interfaz.TERMINAR) {
            switch (opcion) {
                case Interfaz.MESAS_ABIERTAS:
                    interfaz.mesasAbiertasOCerradas();
                    cafeteria.getMesasAbiertas();
                    break;
                case Interfaz.MESAS_CERRADAS:
                    interfaz.mesasAbiertasOCerradas();
                    cafeteria.getMesasAbiertas();
                    break;
                case Interfaz.CAJA_ACTUAL:
                    break;
                case Interfaz.CREAR_PRODUCTO:
                    interfaz.nuevoProducto(producto);
                    cafeteria.addProducto(producto);
                    break;
                //case Interfaz.AÑADIR_PRODUCTO:

            }
        }*/

    }

    private static void init() {
        for (int i = 0; i < 17; i++)
            cafeteria.addMesa(i,true);
        String[] nombresProducto = {"Caña","Pinta","Carajillo","Mixto","Catalana","ColaCao"};
        double[] preciosProducto = {1.00,3.00,1.20,1.50,1.20,1.50};
        for (int i = 0; i < nombresProducto.length; i++)
            cafeteria.addProducto(nombresProducto[i],preciosProducto[i]);
    }
}
