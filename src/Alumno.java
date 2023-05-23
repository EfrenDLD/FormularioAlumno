public class Alumno {
    private String nombre;
    private String apellidos;
    private String telefono;
    private String ine;

    public Alumno(String nombre, String apellidos, String telefono, String ine) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.ine = ine;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getIne() {
        return ine;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", telefono='" + telefono + '\'' +
                ", ine='" + ine + '\'' +
                '}';
    }
}
