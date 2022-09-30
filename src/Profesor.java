public class Profesor extends Persona {
    //10. Las clases Estudiantes y Profesores descienden de la clase abstracta Personas.
    private double básico;
    private int antiguedad;

    //constructor
    public Profesor(String nombre, String Apellido, int legajo, int antiguedad, int básico) {
        super.setNombre(nombre);
        super.setApellido(Apellido);
        super.setLegajo(legajo);
        this.antiguedad = antiguedad;
        this.básico = básico;
    }

    public double getBásico() {
        return básico;
    }

    public void setBásico(double básico) {
        this.básico = básico;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }


    public double calcularSueldo(){
        double aumento=this.básico*0.1;
        return this.básico+(aumento*this.antiguedad);

    }

    @Override
    public String toString() {
        return super.toString() +  " básico=" + básico + ", antiguedad=" + antiguedad + '}';
    }

    @Override
    public void modificarDatos(String nombre, String Apellido, int legajo) {
        super.setNombre(nombre);
        super.setApellido(Apellido);
        try {
            super.setLegajo(legajo);
        } catch (Exception e) {
            System.out.println("Número de legajo ingresado incorrecto");
        }

    }
}