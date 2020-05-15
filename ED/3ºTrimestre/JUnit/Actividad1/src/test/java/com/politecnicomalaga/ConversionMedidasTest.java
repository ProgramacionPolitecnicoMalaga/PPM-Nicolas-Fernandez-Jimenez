package com.politecnicomalaga;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConversionMedidasTest {

    private ConversionMedidas conversionMedidas;
    private double resultadoEsperado;
    private double resultadoObtenido;

    @Before
    public void setUp() {
        conversionMedidas = new ConversionMedidas();
    }

    public void obtenerResultado(double esperado, double obtenido) {
        resultadoEsperado = esperado;
        resultadoObtenido = obtenido;
    }

    @Test
    public void inchACm() {
        obtenerResultado(2.54, conversionMedidas.inchACm(1));
        assertEquals(resultadoEsperado, resultadoObtenido, 0);

        obtenerResultado(30.48,conversionMedidas.inchACm(12));
        assertEquals(resultadoEsperado, resultadoObtenido, 0);
    }

    @Test
    public void cmAInch() {
        obtenerResultado(4.72441, conversionMedidas.cmAInch(12));
        assertEquals(resultadoEsperado, resultadoObtenido, 0);

        obtenerResultado(0, conversionMedidas.cmAInch(0));
        assertEquals(resultadoEsperado, resultadoObtenido, 0);

        obtenerResultado(0.1968, conversionMedidas.cmAInch(0.5));
        assertEquals(resultadoEsperado, resultadoObtenido, 0);
    }
}
