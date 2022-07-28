public class Main {
    public static void main(String[] args) {
        suma(10, 20, 30);
        coche miCoche = new coche();
        miCoche.puertas();
        System.out.println(miCoche.mostrarPuertas());
    }

    public static void suma(int a, int b, int c) {
        System.out.println(a + b + c);
    }
}