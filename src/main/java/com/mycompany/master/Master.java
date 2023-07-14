
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
 class Deportista extends Persona {
    private String deporte;
    private double peso;

    public Deportista(String nombre, int edad, String deporte, double peso) {
        super(nombre, edad);
        this.deporte = deporte;
        this.peso = peso;
    }

    public String getDeporte() {
        return deporte;
    }

    public double getPeso() {
        return peso;
    }

    public void entrenar() {
        System.out.println(deporte);
    }

    public void calcularIMC() {
        double altura = 1.75;
        double imc = peso / (altura * altura);
        System.out.println("Mi IMC es: " + imc);
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

        Deportista deportista = new Deportista("Marta", 28, "Futbol", 65.0);
        deportista.saludar();
        System.out.println("Deporte " + deportista.getDeporte());
        System.out.println("Peso " + deportista.getPeso() + " kg");
        deportista.entrenar();
        deportista.calcularIMC();
    }

}

