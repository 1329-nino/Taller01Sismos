import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        var arreglo = crearArreglo();


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
}
