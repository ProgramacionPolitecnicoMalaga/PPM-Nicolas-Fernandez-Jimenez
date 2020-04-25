import com.politecnicomalaga.FactoryMethod.FactoryHTML;
import com.politecnicomalaga.FactoryMethod.FactoryText;
import com.politecnicomalaga.FactoryMethod.ViewerInterface;
import com.politecnicomalaga.Viewers.DataViewer;
import io.github.cdimascio.dotenv.Dotenv;

public class App {
    private static Dotenv dotenv = Dotenv.configure().load();
    private static String tipoDataViewer = dotenv.get("viewer");
    private static ViewerInterface tipoDeVisualizador;

    public static void main(String[] args) {
        iniciar();
        DataViewer dataViewer = tipoDeVisualizador.crearViewer();
        dataViewer.mostrar();
    }

    public static void iniciar(){
        if (tipoDataViewer.equals(DataViewer.TEXT))
            tipoDeVisualizador = new FactoryText();
        else if (tipoDataViewer.equals(DataViewer.HTML))
            tipoDeVisualizador = new FactoryHTML();
        else
            throw new IllegalArgumentException("No existe dicho visualizador");
    }
}
