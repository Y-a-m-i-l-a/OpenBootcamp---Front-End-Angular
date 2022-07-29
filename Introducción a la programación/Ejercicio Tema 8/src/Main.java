public class Main {
    public static void main(String[] args) {
        Persona  alumno = new Persona();
        alumno.setEdad(33);
        alumno.setNombre("Yamila");
        alumno.setTelefono(1111111111);
        System.out.println("Edad: " + alumno.getEdad());
        System.out.println("Nombre: " + alumno.getNombre());
        System.out.println("Teléfono: " + alumno.getTelefono());
    }
}