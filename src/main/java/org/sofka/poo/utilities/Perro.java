package org.sofka.poo.utilities;

import org.sofka.poo.interfaces.IPerro;

import java.util.logging.Logger;
/**
 * Perro representa un animal perro
 *
 * @author Óscar Farfán - oscarfarfan92@gmail.com
 *
 * @version 1.0.0.000 27-05-2022
 */
public class Perro extends Animal implements IPerro {
    Logger logger = Logger.getLogger("Logger");
    private String raza;

    /**
     * Crea un perro sin inicializar sus atributos
     */
    public Perro(){

    }
    /**
     * Crea un perro que recibe como parámetros el nombre, la edad, el color, el peso y la raza
     *
     * @param nombre nombre del perro
     * @param edad edad del perro
     * @param color color del perro
     * @param peso peso del perro
     * @param raza raza del perro
     */
    public Perro(String nombre, int edad, String color, double peso, String raza){
        super(nombre, edad, color, peso);
        this.raza = raza;
    }
    /**
     * Retorna la raza del perro
     *
     * @return devuelve la raza del perro
     */
    public String getRaza() {
        return raza;
    }
    /**
     * Modifica la raza del perro
     *
     * @param raza recibe la nueva raza del perro
     */
    public void setRaza(String raza) {
        this.raza = raza;
    }
    /**
     * Muestra un mensaje en consola indicando que el perro está ladrando
     */
    @Override
    public void ladrar() {
        logger.info(getNombre() + " está ladrando");
    }
    /**
     * Muestra un mensaje en consola indicando que el perro está moviendo la cola
     */
    @Override
    public void moverCola() {
        logger.info(getNombre() + " está moviendo la cola");
    }
    /**
     * Muestra un mensaje en consola indicando que el perro está comiendo
     */
    @Override
    public void comer() {
        logger.info(getNombre() + " está comiendo");
    }
}
