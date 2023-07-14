
package com.mycompany.master;

class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void saludar() {
        System.out.println("Hola, soy " + nombre);
    }
}

public class Master {
    public static void main(String[] args) {
       
    }
}

