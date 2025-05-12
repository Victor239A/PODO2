public class Main {

    public static void main(String[] args) {

        // Crear objetos de tipo Usuario
        Usuario usuario1 = new Usuario("Victoor", "Jiménez", 17, 2008);
        Usuario usuario2 = new Usuario("Anderson", "Chipel", 16, 2009);

        // Mostrar datos de los usuarios
        usuario1.mostrarDatos();
        usuario2.mostrarDatos();

        // Modificar el nombre del primer usuario
        usuario1.setNombre("Nelson");

        // Imprimir atributos individuales del primer usuario
        System.out.println(usuario1.getNombre());
        System.out.println(usuario1.getApellidos());
        System.out.println(usuario1.getEdad());
        System.out.println(usuario1.getFechaNacimiento());

        // Comprobar si el usuario1 es mayor de edad
        if (usuario1.getEdad() >= 18) {
            System.out.println("Mayor de edad");
        } else {
            System.out.println("Menor de edad");
        }
    }
}
