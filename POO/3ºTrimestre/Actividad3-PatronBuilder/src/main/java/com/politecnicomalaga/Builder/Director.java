package com.politecnicomalaga.Builder;

import com.politecnicomalaga.Pack.Pack;

public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Pack entregarPackBasico() {
        return builder.addHabitacionSimple()
                .addDesayuno()
                .setTipo(TipoPack.PACK_BÁSICO)
                .getResultado();
    }

    public Pack entregarPackRomance() {
        return builder.addHabitacionDoble()
                .addCena()
                .setTipo(TipoPack.PACK_ROMANCE)
                .getResultado();
    }

    public Pack entregarPackFamiliar() {
        return builder.addHabitacionDoble()
                .addCamaAdicional()
                .addDesayuno()
                .addAlmuerzo()
                .addCena()
                .addParqueAtracciones()
                .addActividadesInfantiles()
                .addCineEnPlaya()
                .setTipo(TipoPack.PACK_FAMILIAR)
                .getResultado();
    }

    public Pack entregarPackPadresRelajados() {
        return builder.addHabitacionDoble()
                .addCamaAdicional()
                .addDesayuno()
                .addAlmuerzo()
                .addCena()
                .addActividadesInfantiles()
                .addCursoSurf()
                .addCineEnPlaya()
                .setTipo(TipoPack.PACK_PADRES_RELAJADOS)
                .getResultado();
    }

    public Pack entregarPackDeluxe() {
        return builder.addHabitacionSuite()
                .addDesayuno()
                .addAlmuerzo()
                .addCena()
                .addCursoSurf()
                .addCineEnPlaya()
                .setTipo(TipoPack.PACK_DELUXE)
                .getResultado();
    }

    public Pack entregarpackDeluxeFamiliar() {
        return builder.addHabitacionSuite()
                .addCamaAdicional()
                .addDesayuno()
                .addAlmuerzo()
                .addCena()
                .addParqueAtracciones()
                .addCursoSurf()
                .addActividadesInfantiles()
                .addCineEnPlaya()
                .setTipo(TipoPack.PACK_DELUXE_FAMILIAR)
                .getResultado();
    }

}
