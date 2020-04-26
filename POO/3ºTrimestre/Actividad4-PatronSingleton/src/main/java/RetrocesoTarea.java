public class RetrocesoTarea {

    Tareas tareas = Tareas.getInstance();

    public void retrocederTarea(int numero) {
        tareas.cambiarUltimaTareaRealizada(-numero);
    }

    public String mostrarUltimaTareaRealizada() {
        return tareas.getUltimaTareaRealizada();
    }
}
