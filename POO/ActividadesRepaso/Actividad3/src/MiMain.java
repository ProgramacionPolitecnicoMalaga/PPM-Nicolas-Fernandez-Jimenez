public class MiMain {
    public static void main(String[] args) {
    Comisionado empleado1 = new Comisionado("Juambo", 2, 650.0);
    PorHoras empleado2 = new PorHoras("Pinbol", 3, 12.0);
    Asalariado empleado3 = new Asalariado("Maharba", 900);

    empleado1.calcularSueldoComisionados();
    empleado2.calcularSueldoPorHoras();
    empleado3.calcularSueldoAsalariados();

    System.out.println(empleado1);
    System.out.println(empleado2);
    System.out.println(empleado3);
    }
}
