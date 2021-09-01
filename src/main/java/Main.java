import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        iniciar();
    }

    public static void mostrarMenu() {
        System.out.println("Bienvenido a este hermoso menú :D ");
        System.out.println("¿Qué desea hacer? ");
        System.out.println("[1] Mostrar sismo de mayor magnitud ");
        System.out.println("[2] Contar sismos mayores o iguales a 5.0 ");
        System.out.println("[3] Verificar sismos mayores o iguales a 7.0 ");
        System.out.println("[4] Salir ");
    }

    public static void iniciar() {

        var eleccion = -1;
        do {
            mostrarMenu();
            eleccion = ingresarEntrada();

            switch (eleccion) {

                case 1: {
                    var arreglo = llenarArreglo(crearArreglo());

                    System.out.println("El sismo de Mayor Magnitud es: " + buscarMayorSismo(arreglo));
                }
                break;

                case 2: {
                    var arreglo = llenarArreglo(crearArreglo());
                    System.out.println("La cantidad de sismos mayores o iguales a 5 es: " + contarSismos(arreglo));
                }
                    break;

                case 3: {
                    var arreglo = llenarArreglo(crearArreglo());
                    enviarSMS(arreglo);
                    break;
                }

                case 4:
                    System.out.println("Adios, que le vaya bien :D");
                    break;

                default:
                    System.out.println("No se ha ingresado una opción correcta");
                    break;
            }

        } while (eleccion != 4);


    }

    public static Double[][] crearArreglo() {

        return new Double[7][10];
    }

    public static Double[][] llenarArreglo(Double[][] arreglo) {

        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[0].length; j++) {
                arreglo[i][j] = Math.random() * 10;
            }
        }
        return arreglo;
    }

    public static double buscarMayorSismo(Double[][] arreglo) {

        double auxiliar = arreglo[0][0];

        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[0].length; j++) {
                if (arreglo[i][j] > auxiliar) {
                    auxiliar = arreglo[i][j];
                }
            }
        }
        return auxiliar;
    }

    public static double contarSismos(Double[][] arreglo) {

        double contador = 0;

        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[0].length; j++) {
                if (arreglo[i][j] >= 5.0) {
                    contador++;
                }
            }
        }
        return contador;
    }

    public static void enviarSMS(Double[][] arreglo) {

        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[0].length; j++) {
                if (arreglo[i][j] >= 7.0) {
                    System.err.println("Alerta!!! se debe evacuar zona costera!");
                }
            }
        }
    }

    public static String darEntrada() {

        System.out.println("Ingrese una opción");
        return new Scanner(System.in).nextLine();
    }

    public static Integer ingresarEntrada() {

        try {
            return Integer.parseInt(darEntrada());
        } catch (NumberFormatException e) {
            System.err.println("ERROR: vuelva a ingresar la opción");
            return ingresarEntrada();
        }
    }
}
