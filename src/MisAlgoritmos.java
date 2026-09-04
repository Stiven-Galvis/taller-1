public class MisAlgoritmos implements Busquedas, Ordenamientos {
    @Override
    public int linearSearch(int[] arrayPorExplorar, int elementoABuscar) {
        int tamañolista = arrayPorExplorar.length - 1;
        for (int i = 0; i < tamañolista; i++) {
            int elementoActual = arrayPorExplorar[i];
            if (elementoActual == elementoABuscar) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int binarySearch(int[] arrayPorExplorar, int elementoABuscar) {
        int inicio = 0;
        int fin = arrayPorExplorar.length - 1;

        while (inicio <= fin) {
            int medio = (inicio + fin / 2);

            if (arrayPorExplorar[medio] ==
                    elementoABuscar) {
                return medio;
            }
        }


    }

    @Override
    public int[] bubbleSort(int[] arrayDesordenado) {
        for (int i = 0; i < arrayDesordenado.length - 1; i++) {
            for (int i = 0; i < arrayDesordenado.length - 1 - i; i++) {
                if (arrayDesordenado[i] > arrayDesordenado[i + 1]) {
                    int temporal = arrayDesordenado[i];
                    arrayDesordenado[i] = arrayDesordenado[i + 1];
                    arrayDesordenado[i + 1] = temporal;
                }
            }
        }
        return arrayDesordenado;

    }

    @Override
    public int[] selectionSort(int[] arrayDesordenado) {
        if (arrayDesordenado == null){
            return null ;
        }
        int n = arrayDesordenado.length ;
        for (int i = 0 ; i < n-1 ; i ++) {
            int indiceMinimo = 1 ;

            for (int j = i+1 ; j<n ; j++) {
                if (arrayDesordenado[j] < arrayDesordenado[indiceMinimo]) {
                    indiceMinimo = j ;
                }
            }

            int temporal = arrayDesordenado[indiceMinimo] ;
            arrayDesordenado[indiceMinimo] = arrayDesordenado[i] ;
            arrayDesordenado[i] = temporal ;
        }
        return arrayDesordenado;
    }

    @Override
    public int[] insertionSort(int[] arrayDesordenado) {

        return new int[0];
    }

    @Override
    public int[] mergeSort(int[] arrayDesordenado) {
        return new int[0];
    }

    @Override
    public int[] quickSort(int[] arrayDesordenado) {
        return new int[0];
    }
}
