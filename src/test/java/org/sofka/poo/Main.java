package org.sofka.poo;

import org.sofka.poo.utilities.*;

/**
 * Clase de prueba para el proyecto de POO (Programación Orientada a Objetos)
 *
 * @author Óscar Farfán - oscarfarfan92@gmail.com
 *
 * @version 1.0.0.000 27-05-2022
 */
public class Main {
    public static void main(String[] args) {
        Perro perro1 = new Perro("Tobias", 2, "Café", 10, "Labrador");
        Perro perro2 = new Perro("Max", 3, "Negro", 8, "Bulldog");
        Gato gato1 = new Gato("Jim", 4, "Gris", 5, "Azul");
        Gato gato2 = new Gato("Candy", 3, "Amarillo", 6, "Verde");

        perro1.ladrar();
        perro2.moverCola();
        gato1.cazarRaton();
        gato2.baniar();
    }
}
