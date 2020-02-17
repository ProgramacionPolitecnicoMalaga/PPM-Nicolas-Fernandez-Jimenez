import java.time.LocalDate;

public class Cliente {
    private String nombre, apellidos, dni, direccionContacto;
    private LocalDate fechaNacimiento;
    private int telefonoContacto;

    public Cliente(String nombre, String apellidos, String dni, String direccionContacto, int telefonoContacto) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.direccionContacto = direccionContacto;
        this.fechaNacimiento = fechaNacimiento;
        this.telefonoContacto = telefonoContacto;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDni() {
        return dni;
    }

    public String getDireccionContacto() {
        return direccionContacto;
    }

    public int getTelefonoContacto() {
        return telefonoContacto;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", dni='" + dni + '\'' +
                ", direccionContacto='" + direccionContacto + '\'' +
                ", telefonoContacto=" + telefonoContacto +
                '}';
    }
}
