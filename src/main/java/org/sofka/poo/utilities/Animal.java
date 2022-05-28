package org.sofka.poo.utilities;

/**
 * Animal representa un ser vivo animal
 *
 * @author Óscar Farfán - oscarfarfan92@gmail.com
 *
 * @version 1.0.0.000 27-05-2022
 */
public class Animal {
    private String nombre;
    private int edad;
    private String color;
    private double peso;

    public Animal() {

    }

    /**
     * Crea un animal que recibe como parámetros el nombre, la edad, el color y el peso
     *
     * @param nombre nombre del animal
     * @param edad   edad del animal
     * @param color  color del animal
     * @param peso   peso del animal
     */
    public Animal(String nombre, int edad, String color, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.color = color;
        this.peso = peso;
    }

    /**
     * Retorna el nombre del animal
     *
     * @return devuelve el nombre del animal
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modifica el nombre del animal
     *
     * @param nombre recibe el nuevo nombre del animal
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Retorna la edad del animal
     *
     * @return devuelve la edad del animal
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Modifica la edad del animal
     *
     * @param edad recibe la nueva edad del animal
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Retorna el color del animal
     *
     * @return devuelve el color del animal
     */
    public String getColor() {
        return color;
    }
    /**
     * Modifica el color del animal
     *
     * @param color recibe el nuevo color del animal
     */
    public void setColor(String color) {
        this.color = color;
    }
    /**
     * Retorna el peso del animal
     *
     * @return devuelve el peso del animal
     */
    public double getPeso() {
        return peso;
    }

    /**
     * Modifica el peso del animal
     *
     * @param peso recibe el nuevo peso del animal
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }
}
