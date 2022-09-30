import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

public class Carrera implements IInformacion {
    private String nombre;
    private LinkedList<Materia> coleccionMaterias;

    //Constructor
    public Carrera(String nombre){
        this.nombre = nombre;
        this.coleccionMaterias = new LinkedList<Materia>();
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setMaterias(LinkedList<Materia> materias) {
        this.coleccionMaterias = materias;
    }

    public LinkedList<Materia> getMaterias() {
        return coleccionMaterias;
    }

    public void setColeccionMaterias(LinkedList<Materia> coleccionMaterias) {
        this.coleccionMaterias = coleccionMaterias;
    }

    void agregarMateria(Materia materia){
        this.coleccionMaterias.add(materia);
    }

    public boolean eliminarMateria(String nombreMateria) {
        boolean encontrar = false;
        for (Materia materia : coleccionMaterias) {
            if (materia.getNombre().equals(nombreMateria)) {
                this.coleccionMaterias.remove(materia);
                encontrar = true;
                break;
            }
        }
        return encontrar;
    }

    public void encontrarMateria(String nombreMateria){
        Scanner leer = new Scanner(System.in);
        char opcion;
        for(Materia materia: coleccionMaterias){
            if(materia.getNombre().equals(nombreMateria)){
                System.out.println("La materia se encuentra en la carrera");
                System.out.println("¿Desea eliminarla? 's' para eliminar, 'n' para mantener");
                try{
                    opcion = leer.next().charAt(0);
                    while (opcion != 's' && opcion != 'n'){
                        leer.nextLine();
                        System.out.println("Opcion invalida, intente nuevamente");
                        System.out.println("¿Desea eliminarla? 's' para eliminar, 'n' para mantener");
                    }if(opcion == 's'){
                        getMaterias().remove(materia);
                    }
                }catch (Exception e){
                    e.printStackTrace();
                    System.out.println("ERROR en el ingreso de datos");
                }
            }
        }
    }

    //15. Métodos toString para todas las clases
    @Override
    public String toString() {
        return nombre;
    }

    @Override
    public void verCantidad() {
        int cantidad = 0;
        System.out.println(cantidad);
    }

    @Override
    public void listarContenidos() {
        System.out.println("Las materias de la carrera " + nombre + " son: ");
        System.out.println(coleccionMaterias);
    }
}


