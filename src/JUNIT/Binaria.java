package JUNIT;

public class Binaria {

    /**
     * Busca un dato en un vector ordenado utilizando el algoritmo de búsqueda binaria.
     * @param vector El array de enteros (debe estar ordenado).
     * @param dato El valor a buscar.
     * @return La posición del dato o -1 si no se encuentra.
     */
    public int busquedaBinaria(int[] vector, int dato) {
        int inicio = 0;
        int fin = vector.length - 1;

        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;

            if (vector[medio] == dato) {
                return medio;
            }

            if (vector[medio] < dato) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }

        return -1; // No encontrado
    }

    /**
     * Modifica el valor de una posición específica en el vector.
     * @param vector El array de enteros.
     * @param nuevoValor El valor que se desea insertar.
     * @param posicion El índice donde se realizará el cambio.
     * @return true si la posición es válida y se modificó, false en caso contrario.
     */
    public boolean modificarValor(int[] vector, int nuevoValor, int posicion) {
        if (posicion >= 0 && posicion < vector.length) {
            vector[posicion] = nuevoValor;
            return true;
        }
        return false;
    }
}
