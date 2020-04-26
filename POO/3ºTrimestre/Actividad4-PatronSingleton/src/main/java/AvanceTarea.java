public class AvanceTarea {

    Tareas tareas = Tareas.getInstance();

    public void avanzarTarea(int numero) {
        tareas.cambiarUltimaTareaRealizada(numero);
    }

    public String mostrarUltimaTareaRealizada() {
        return tareas.getUltimaTareaRealizada();
    }
}
