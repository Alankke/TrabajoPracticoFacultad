public abstract class Persona {
        private String nombre;
        private  String apellido;
        private  int legajo;

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

        public void setLegajo(int legajo) {
            this.legajo = legajo;
        }

        public String getnombre() {
            return nombre;
        }

        @Override
        public String toString() {
            return nombre + ", " + apellido + ", " + legajo;
        }

        public abstract void modificarDatos(String nombre, String Apellido, int legajo);
    }

