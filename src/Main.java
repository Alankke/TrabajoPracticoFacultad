public class Main {
    public static void main(String[] args) {

        Facultad UTN = new Facultad("UTN");
        Facultad UNNE = new Facultad("UNNE");

        Carrera Arq = new Carrera("Arquitectura y Urbanismo");
        Carrera Dis = new Carrera("Diseño Gráfico");
        Carrera ISI = new Carrera("Ing. en Sistemas");
        Carrera TUP = new Carrera("Tec. Universitaria en Programación");

        Profesor Leandro = new Profesor("Leandro", "Paredes", 23386, 5, 80000);
        Profesor Emiliano = new Profesor("Emiliano", "Martinez", 56239, 2, 20000);
        Profesor Nahuel = new Profesor("Nahuel", "Molina", 34956, 3, 50000);

        Materia LabII = new Materia("Laboratorio II", Leandro);
        Materia SPD = new Materia("Sis. de Procesamiento de datos", Emiliano);
        Materia ProgII = new Materia("Programacion II",Nahuel );

        Estudiante Alan = new Estudiante ("Alan", "Kennedy", 23569);
        Estudiante Ian = new Estudiante("Ian","Zimmermann", 53457);
        Estudiante Leo = new Estudiante("Lionel", "Messi", 35823);


        //1.Agregamos las carreras a la facultad
        UTN.agregarCarrera(ISI);
        UTN.agregarCarrera(TUP);

        UNNE.agregarCarrera(Arq);
        UNNE.agregarCarrera(Dis);

        UTN.listarContenidos();
        UNNE.listarContenidos();

        //2.Eliminamos la carrera de la facultad
        UNNE.eliminarCarrera("Arquitectura y Urbanismo");
        System.out.println("Eliminamos carrera arquitectura de UNNE \n");
        UNNE.listarContenidos();

        //3. Eliminar estudiantes de una facultad.
        UTN.eliminarEstudiante(Leo);



        //4. Agregamos materias a una carrera:
        TUP.agregarMateria(LabII);
        TUP.agregarMateria(SPD);
        TUP.agregarMateria(ProgII);
        System.out.println("\n\n");
        TUP.listarContenidos();

        //5.Eliminamos materias a una carrera:
        TUP.eliminarMateria("Sis. de Procesamiento de datos");
        System.out.println("Eliminamos la materia SPD de la carrera \n\n");
        TUP.listarContenidos();

        //6.Encontrar materias en una carrera:
        TUP.encontrarMateria("Sis. de Procesamiento de datos");

        //7.Agregar estudiantes a una materia.
        ProgII.agregarEstudiante(Ian);
        ProgII.agregarEstudiante(Alan);
        System.out.println("Agregamos estudiantes a una materia \n\n");
        ProgII.listarContenidos();

        LabII.agregarEstudiante(Ian);
        LabII.agregarEstudiante(Alan);
        System.out.println("\n\n");
        LabII.listarContenidos();

        //8.Eliminar estudiantes de una materia
        LabII.eliminarEstudiante("Alan");
        System.out.println("Eliminamos un estudiante de una materia en este caso de LabII \n\n");
        LabII.listarContenidos();

        //9. Modificar el profesor titular de una materia
        LabII.modificarTitular(Emiliano);
        System.out.println("Modificamos el profe titular de una materia \n\n");
        LabII.listarContenidos();
        //Calculamos el sueldo de profesor
        System.out.println("Calculamos el sueldo de un profesor \n");
        Leandro.calcularSueldo();
    }
}