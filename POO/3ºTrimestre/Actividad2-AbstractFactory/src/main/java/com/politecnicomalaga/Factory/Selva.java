package com.politecnicomalaga.Factory;

import com.politecnicomalaga.Modelo.Jugador.Indiana;
import com.politecnicomalaga.Modelo.Jugador.Jugador;
import com.politecnicomalaga.Modelo.Obstaculo.CarceleroTurco;
import com.politecnicomalaga.Modelo.Obstaculo.Obstaculo;
import com.politecnicomalaga.Modelo.Villano.Molaram;
import com.politecnicomalaga.Modelo.Villano.Villano;

public class Selva implements Personaje {
    public Jugador crearJugador() {
        return new Indiana();
    }

    public Villano crearVillano() {
        return new Molaram();
    }

    public Obstaculo crearObstaculo() {
        return new CarceleroTurco();
    }
}
