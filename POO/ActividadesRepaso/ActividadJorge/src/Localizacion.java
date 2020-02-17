import java.util.ArrayList;

public class Localizacion {
    private String direccion;
    private double latitud;
    private double longitud;

    public Localizacion(String direccion) {
        this.direccion = direccion;
        this.latitud = latitud;
        this.longitud = longitud;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public double calcularDistancia(Localizacion localizacion) {
        double distanciaMinima = Double.MAX_VALUE;
        double punto = localizacion.getLongitud() - longitud;
        double distanciaActual = Math.sin(Math.toRadians(localizacion.getLatitud())) * Math.sin(Math.toRadians(latitud)) + Math.cos(Math.toRadians(localizacion.getLatitud())) * 	Math.cos(Math.toRadians(latitud)) * Math.cos(Math.toRadians(punto));
        distanciaActual = Math.acos(distanciaActual);
        distanciaActual = Math.toDegrees(distanciaActual);
        return Math.abs(distanciaActual * 60 * 1.853159616);
    }

    public ArrayList<Activo> activoMasCercano(ArrayList<Activo> activos, double radio) {
        ArrayList<Activo> activosMasCercanos = new ArrayList<>();

        for (Activo activo : activos) {
            if (calcularDistancia(activo.getLocalizacion()) <= radio) {
                activosMasCercanos.add(activo);
            }
        } return activosMasCercanos;
    }

    @Override
    public String toString() {
        return "Localizacion{" +
                "direccion='" + direccion + '\'' +
                ", latitud=" + latitud +
                ", longitud=" + longitud +
                '}';
    }
}
