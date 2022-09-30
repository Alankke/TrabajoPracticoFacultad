import java.util.LinkedList;
import java.util.Scanner;

public class Materia implements IInformacion {
    private String nombre;
    private Profesor titular;
    private LinkedList<Estudiante> coleccionEstudiantes;

    //constructor
    public Materia(String nombre, Profesor titular){
        this.nombre = nombre;
        this.titular = titular;
        this.coleccionEstudiantes = new LinkedList<Estudiante>();
    }

    public String getNombre(){
        return nombre;
    }

    void agregarEstudiante(Estudiante estudianteAgregado){
        this.coleccionEstudiantes.add(estudianteAgregado);
    }

    void eliminarEstudiante(String nombre){
        boolean encontrar = false;
        for (Estudiante estudiante:coleccionEstudiantes) {
            if(estudiante.getnombre() == nombre){
                this.coleccionEstudiantes.remove(estudiante);
                encontrar = true;
                break;
            }
        }
    }

    void modificarTitular(Profesor profesor){
        titular.setNombre(nombre);
    }

    public LinkedList<Estudiante> getColeccionEstudiantes() {
        return coleccionEstudiantes;
    }
    @Override
    public String toString() {
        return  '\n' + "Datos de la materia: \n" +
                "Nombre de la Materia: " + nombre + "\n" +
                "Profesor Titular: " + titular;
    }

    @Override
    public void verCantidad() {
        int cantidad = 0;
        System.out.println(cantidad);
    }

    @Override
    public void listarContenidos() {
        System.out.println("Los estudiantes inscriptos en la materia " + nombre + " son: ");
        System.out.println(coleccionEstudiantes);
    }
}