
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
    class Doctor extends Persona {
    private String especialidad;
    private int añosExperiencia;

    public Doctor(String nombre, int edad, String especialidad, int añosExperiencia) {
        super(nombre, edad);
        this.especialidad = especialidad;
        this.añosExperiencia = añosExperiencia;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public void tratarPaciente() {
        System.out.println("Estoy tratando a un paciente");
    }

    public void realizarCirugia() {
        System.out.println("===========================");
    }
}
}

public class Master {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("Jorge", 35, "Pediatria", 10);
        doctor.saludar();
        System.out.println("Especialidad " + doctor.getEspecialidad());
        System.out.println("Años de experiencia " + doctor.getAñosExperiencia());
        doctor.tratarPaciente();
        doctor.realizarCirugia();
       
    }

}

