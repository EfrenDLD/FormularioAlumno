import java.util.ArrayList;

class MostradorDatos {
    public void mostrarDatos(ArrayList<Alumno> alumnos) {
        System.out.println("Datos ingresados:");
        for (Alumno alumno : alumnos) {
            System.out.println(alumno);
        }
    }
}