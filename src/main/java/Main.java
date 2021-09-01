public class Main {
    public static void main(String[] args) {

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
}
