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
        int fin = arrayPorExplorar.length - 1 ;

        while(inicio <=fin)

    {
        int medio = (inicio + fin / 2) ;

        if (arrayPorExplorar[medio] ==
                elementoABuscar) {
            return medio;
            }
        }
        return inicio;
    }

    @Override
    public int[] bubbleSort(int[] arrayDesordenado) {
        for (int i = 0; i < arrayDesordenado.length - 1; i++) {
            for (i = 0; i < arrayDesordenado.length - 1 - i; i++) {
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
        if (arrayDesordenado == null) {
            return null ;
        }

        int n = arrayDesordenado.length ;

        for (int i = 1 ; i < n ; i++) {
            int clave = arrayDesordenado[i] ;
            int j = i - 1 ;

            while (j >= 0 && arrayDesordenado[j] > clave) {
                arrayDesordenado[j + 1] = arrayDesordenado[j] ;
                j= j - 1 ;
            }
            arrayDesordenado[j + 1] = clave ;
        }
        return arrayDesordenado ;
    }

    @Override
    public int[] mergeSort(int[] arrayDesordenado) {
        if (arrayDesordenado == null || arrayDesordenado.length <= 1) {
            return  arrayDesordenado ;
        }
        int mitad = arrayDesordenado.length / 2 ;
        int[] izquierda = new int[mitad] ;
        int[] derecha = new int [arrayDesordenado.length - mitad] ;

        System.arraycopy(arrayDesordenado, 0, izquierda, 0, mitad) ;
        System.arraycopy(arrayDesordenado, mitad, derecha, 0, arrayDesordenado.length - mitad) ;
        izquierda = mergeSort(izquierda);
        derecha = mergeSort(derecha);

        return merge(izquierda, derecha);
    }

    private int[] merge(int[] izq, int[] der) {
        int[] resultado = new int[izq.length + der.length];
        int i = 0, j = 0, k = 0;

        while (i < izq.length && j < der.length) {
            if (izq[i] <= der[j]) {
                resultado[k++] = izq[i++];
            } else {
                resultado[k++] = der[j++];
            }
        }

        while (i < izq.length) {
            resultado[k++] = izq[i++];
        }

        while (j < der.length) {
            resultado[k++] = der[j++];
        }
        return resultado ;
    }

    @Override
    public int[] quickSort(int[] arrayDesordenado) {
        if (arrayDesordenado == null || arrayDesordenado.length <= 1) {
            return arrayDesordenado;
        }

        quickSortRecursivo(arrayDesordenado, 0, arrayDesordenado.length - 1);
        return arrayDesordenado;
    }

    private void quickSortRecursivo(int[] arr, int inicio, int fin) {
        if (inicio < fin) {
            int indicePivote = partition(arr, inicio, fin);
            quickSortRecursivo(arr, inicio, indicePivote - 1);
            quickSortRecursivo(arr, indicePivote + 1, fin);
        }
    }

    private int partition(int[] arr, int inicio, int fin) {
        int pivote = arr[fin];
        int i = inicio - 1;

        for (int j = inicio; j < fin; j++) {
            if (arr[j] <= pivote) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[fin];
        arr[fin] = temp;

        return i + 1;
    }
}