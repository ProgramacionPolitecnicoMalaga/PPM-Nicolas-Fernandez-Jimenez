import java.util.ArrayList;

public class Tareas {

    private static Tareas instancia = null;

    private ArrayList<String> tareas;
    private int ultinaTareaRealizada;

    public Tareas() {
        tareas = new ArrayList<>();
    }

    public static Tareas getInstance() {
        if (instancia == null)
            instancia = new Tareas();
        return instancia;
    }

    public void addTarea(String tarea) {
        tareas.add(tarea);
        ultinaTareaRealizada = tareas.size() - 1;
    }

    public void cambiarUltimaTareaRealizada(int numero) {
        ultinaTareaRealizada += numero;
    }

    public String getUltimaTareaRealizada() {
        return tareas.get(ultinaTareaRealizada);
    }
}
