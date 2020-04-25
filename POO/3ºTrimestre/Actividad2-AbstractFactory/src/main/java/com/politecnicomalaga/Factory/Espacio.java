package com.politecnicomalaga.Factory;

import com.politecnicomalaga.Modelo.Jugador.Jugador;
import com.politecnicomalaga.Modelo.Jugador.USSEnterprise;
import com.politecnicomalaga.Modelo.Obstaculo.NavesKlingon;
import com.politecnicomalaga.Modelo.Obstaculo.Obstaculo;
import com.politecnicomalaga.Modelo.Villano.Khan;
import com.politecnicomalaga.Modelo.Villano.Villano;

public class Espacio implements Personaje {
    public Jugador crearJugador() {
        return new USSEnterprise();
    }

    public Villano crearVillano() {
        return new Khan();
    }

    public Obstaculo crearObstaculo() {
        return new NavesKlingon();
    }
}
