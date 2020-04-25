package com.politecnicomalaga.Factory;

import com.politecnicomalaga.Modelo.Jugador.Jugador;
import com.politecnicomalaga.Modelo.Jugador.Patton;
import com.politecnicomalaga.Modelo.Obstaculo.Obstaculo;
import com.politecnicomalaga.Modelo.Obstaculo.Tanques;
import com.politecnicomalaga.Modelo.Villano.Rommel;
import com.politecnicomalaga.Modelo.Villano.Villano;

public class Desierto implements Personaje {
    public Jugador crearJugador() {
        return new Patton();
    }

    public Villano crearVillano() {
        return new Rommel();
    }

    public Obstaculo crearObstaculo() {
        return new Tanques();
    }
}
