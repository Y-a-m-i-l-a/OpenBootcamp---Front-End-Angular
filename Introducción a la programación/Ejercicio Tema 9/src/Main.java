public class Main {
    public static void main(String[] args) {
        Cliente  cliente1 = new Cliente();
        cliente1.setEdad(33);
        cliente1.setNombre("Yamila");
        cliente1.setTelefono(1111111111);
        cliente1.setCredito(15000);
        System.out.println("Edad: " + cliente1.getEdad());
        System.out.println("Nombre: " + cliente1.getNombre());
        System.out.println("Teléfono: " + cliente1.getTelefono());
        System.out.println("Crédito: " + cliente1.getCredito());

        Trabajador  trabajador1 = new Trabajador();
        trabajador1.setEdad(30);
        trabajador1.setNombre("Cecilia");
        trabajador1.setTelefono(1111111111);
        trabajador1.setSalario(150000);
        System.out.println("Edad: " + trabajador1.getEdad());
        System.out.println("Nombre: " + trabajador1.getNombre());
        System.out.println("Teléfono: " + trabajador1.getTelefono());
        System.out.println("Salario: " + trabajador1.getSalario());
    }
}