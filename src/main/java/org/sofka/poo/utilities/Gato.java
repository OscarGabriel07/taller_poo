package org.sofka.poo.utilities;

import org.sofka.poo.interfaces.IGato;

import java.util.logging.Logger;

public class Gato extends Animal implements IGato {

    Logger logger = Logger.getLogger("logger");
    private String colorOjos;

    public Gato(){

    }

    public Gato(String nombre, int edad, String color, double peso, String colorOjos){
        super(nombre, edad, color, peso);
        this.colorOjos = colorOjos;
    }

    public Logger getLogger() {
        return logger;
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }

    public String getColorOjos() {
        return colorOjos;
    }

    public void setColorOjos(String colorOjos) {
        this.colorOjos = colorOjos;
    }

    @Override
    public void baniar() {
        logger.info(getNombre() + " se está bañando");
    }

    @Override
    public void cazarRaton() {
        logger.info(getNombre() + " está cazando un ratón");
    }

    @Override
    public void saltar() {
        logger.info(getNombre() + " está saltando");
    }
}
