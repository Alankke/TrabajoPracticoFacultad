public class Estudiante extends Persona {
//10. Las clases Estudiantes y Profesores descienden de la clase abstracta Personas.

    //constructor
    public Estudiante(String nombre, String Apellido, int legajo) {
        super.setNombre(nombre);
        super.setApellido(Apellido);
        super.setLegajo(legajo);
    }

    @Override
    public void modificarDatos(String nombre, String Apellido, int legajo) {
        super.setNombre(nombre);
        super.setApellido(Apellido);
        try {
            super.setLegajo(legajo);
        } catch (Exception e) {
            System.out.println("El legajo ingresado es incorrecto");
        }
    }

    //15. Todas las clases deben tener toString
    @Override
    public String toString() {
        return "Datos del estudiante: " + super.toString();
    }


}