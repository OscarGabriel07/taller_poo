package org.sofka.poo.utilities;

import org.sofka.poo.interfaces.IPerro;

import java.util.logging.Logger;

public class Perro extends Animal implements IPerro {
    Logger logger = Logger.getLogger("Logger");
    private String raza;

    public Perro(){

    }

    public Perro(String nombre, int edad, String color, double peso, String raza){
        super(nombre, edad, color, peso);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public void ladrar() {
        logger.info(getNombre() + " está ladrando");
    }

    @Override
    public void moverCola() {
        logger.info(getNombre() + " está moviendo la cola");
    }

    @Override
    public void comer() {
        logger.info(getNombre() + " está comiendo");
    }
}
