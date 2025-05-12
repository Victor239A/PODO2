public class Usuario {

    // Atributos privados (encapsulados)
    private String nombre;
    private String apellidos;
    private int edad;
    private int fechaNacimiento;

    // Constructor: inicializa los atributos con los valores recibidos
    public Usuario(String nombre, String apellidos, int edad, int fechaNacimiento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
    }

    // Métodos getter: permiten acceder a los atributos
    public String getNombre() {
        return this.nombre;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public int getEdad() {
        return this.edad;
    }

    public int getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    // Métodos setter: permiten modificar los atributos
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setFechaNacimiento(int fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    // Método para mostrar los datos del usuario
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Edad: " + edad);
        System.out.println("Fecha de Nacimiento: " + fechaNacimiento);
    }
}
