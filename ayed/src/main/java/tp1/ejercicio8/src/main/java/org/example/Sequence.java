package org.example;

    public abstract class Sequence<T> {

        // Métodos comunes que todas las secuencias deberían tener.

        /**
         * Devuelve el número de elementos en la secuencia.
         * @return el tamaño de la secuencia.
         */
        public abstract int size();

        /**
         * Comprueba si la secuencia está vacía.
         * @return true si no tiene elementos, false en caso contrario.
         */
        public abstract boolean isEmpty();
    }
