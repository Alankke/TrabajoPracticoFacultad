import java.util.LinkedList;

class Facultad implements IInformacion {
    private String nombre;
    private LinkedList<Carrera> coleccionCarreras;

    //constructor
    public Facultad(String nombre){
        this.nombre = nombre;
        this.coleccionCarreras = new LinkedList<Carrera>();
    }
    public void agregarCarrera(Carrera carreraAgregada){
        coleccionCarreras.add(carreraAgregada);
    }
    public boolean eliminarCarrera(String nombreCarrera){
        boolean encontrar = false;
        for (Carrera carrera : coleccionCarreras) {
            if (carrera.getNombre().equals(nombreCarrera)) {
                this.coleccionCarreras.remove(carrera);
                encontrar = true;
                break;
            }
        }
        return encontrar;
    }



    @Override
    public void verCantidad() {
        int cantidad = 0;
        System.out.println(cantidad);
    }

    @Override
    public void listarContenidos() {
        System.out.println("Las carreras de la facultad "+ nombre + " son: ");
        System.out.println(coleccionCarreras);
    }

    public void eliminarEstudiante(Estudiante estudiante) {
        for(Carrera carrera:coleccionCarreras)
            for(Materia materia:carrera.getMaterias())
                for(Estudiante estudiante1: materia.getColeccionEstudiantes()){
                    if(estudiante1.equals(estudiante)){
                        materia.getColeccionEstudiantes().remove(estudiante);
                        //Hacemos tod0 ese for anidado porque al eliminar estudiante de una facultad tambien
                        //se lo elimina de la materia
                    }
                }
    }
}