import com.politecnicomalaga.Factory.Personaje;
import com.politecnicomalaga.Modelo.Jugador.Jugador;
import com.politecnicomalaga.Modelo.Obstaculo.Obstaculo;
import com.politecnicomalaga.Modelo.Villano.Villano;
import com.politecnicomalaga.Vista.SelectorDeJuego;

public class App {
    public static void main(String[] args) {
        SelectorDeJuego selectorDeJuego = new SelectorDeJuego();
        Personaje personajeFactory = selectorDeJuego.inicializarEscenario();

        Jugador jugador = personajeFactory.crearJugador();
        Villano villano = personajeFactory.crearVillano();
        Obstaculo obstaculo = personajeFactory.crearObstaculo();

        System.out.println("Jugador: " + jugador.getNombre());
        System.out.println("Villano: " + villano.getNombre());
        System.out.println("Obstaculo: " + obstaculo.getNombre());
    }
}
