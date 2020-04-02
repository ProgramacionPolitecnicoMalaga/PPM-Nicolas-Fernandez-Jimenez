package com.politecnico;

public class Calculadora {
    public static void main(String[] args) {
        Sumar suma = new Sumar();
        Restar resta = new Restar();
        Multiplicar multiplicacion = new Multiplicar();
        Dividir division = new Dividir();

        System.out.println(suma.sumar());
        System.out.println(resta.restar());
        System.out.println(multiplicacion.multiplicar());
        System.out.println(division.dividir());
    }
}
