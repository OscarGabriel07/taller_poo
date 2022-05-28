package org.sofka.poo.utilities;

import org.sofka.poo.interfaces.IGato;

import java.util.logging.Logger;

/**
 * Gato representa un animal gato
 *
 * @author Óscar Farfán - oscarfarfan92@gmail.com
 *
 * @version 1.0.0.000 27-05-2022
 */
public class Gato extends Animal implements IGato {

    Logger logger = Logger.getLogger("logger");
    private String colorOjos;

    /**
     * Crea un gato sin inicializar sus atributos
     */
    public Gato(){

    }

    /**
     * Crea un gato que recibe como parámetros el nombre, la edad, el color, el peso y el color de ojos
     *
     * @param nombre
     * @param edad
     * @param color
     * @param peso
     * @param colorOjos
     */
    public Gato(String nombre, int edad, String color, double peso, String colorOjos){
        super(nombre, edad, color, peso);
        this.colorOjos = colorOjos;
    }
    /**
     * Restorna el color de ojos del gato
     *
     * @return devuelve el color de ojos del gato
     */
    public String getColorOjos() {
        return colorOjos;
    }
    /**
     * Modifica el color de los ojos del gato
     *
     * @param colorOjos recibe el nuveo color de ojos del gato
     */
    public void setColorOjos(String colorOjos) {
        this.colorOjos = colorOjos;
    }
    /**
     * Muestra un mensaje en consola indicando que el gato se está bañando
     */
    @Override
    public void baniar() {
        logger.info(getNombre() + " se está bañando");
    }
    /**
     * Muestra un mensaje en consola indicando que el gato está cazando un ratón
     */
    @Override
    public void cazarRaton() {
        logger.info(getNombre() + " está cazando un ratón");
    }
    /**
     * Muestra un mensaje en consola indicando que el gato está saltando
     */
    @Override
    public void saltar() {
        logger.info(getNombre() + " está saltando");
    }
}
