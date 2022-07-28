import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Punto 1
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese un número entero:");
        int numeroIf = entrada.nextInt();

        System.out.println("Condicional IF:");
        if(numeroIf < 0) {
            System.out.println("El número es negativo.");
        } else if (numeroIf > 0) {
            System.out.println("El número es positivo.");
        } else {
            System.out.println("El número es cero.");
        }

        // Punto 2
        System.out.println("Bucle WHILE:");
        int numeroWhile = 0;

        while (numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile++;

        }

        // Punto 3
        System.out.println("Bucle DO-WHILE:");
        do {
            System.out.println(numeroWhile);
            numeroWhile += 1;
        }
        while (numeroWhile < 3);

        // Punto 4
        System.out.println("Bucle FOR:");
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }

        // Punto 5
        System.out.println("SWITCH-CASE:");
        String estacion = "Invierno";
        switch (estacion) {
            case "Verano":
                System.out.println("Es verano");
                break;
            case "Otoño":
                System.out.println("Es otoño");
                break;
            case "Invierno":
                System.out.println("Es invierno");
                break;
            case "Primavera":
                System.out.println("Es primavera");
                break;
            default:
                System.out.println("No es ninguna estación");
        }


    }
}