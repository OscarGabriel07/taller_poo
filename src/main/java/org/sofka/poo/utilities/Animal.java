package org.sofka.poo.utilities;

public class Animal {
    private String nombre;
    private int edad;
    private String color;
    private double peso;

    public Animal(){

    }

    public Animal(String nombre, int edad, String color, double peso){
        this.nombre = nombre;
        this.edad = edad;
        this.color = color;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
