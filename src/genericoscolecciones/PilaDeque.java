package genericoscolecciones;

import java.util.ArrayDeque;
import java.util.Deque;

public class PilaDeque {
    // Deque para implementar la pila
    private Deque<Integer> datos = new ArrayDeque();

    // Método principal
    public static void main(String[] args) {
        // Crear una instancia de PilaDeque
        PilaDeque pila = new PilaDeque();

        // Agregar elementos a la pila
        for (int i = 0; i < 5; i++) {
            pila.push(i);
        }

        // Mostrar la pila después de agregar elementos
        System.out.println("Después de agregar con push 5 elementos: " + pila);
        System.out.println();

        // Sacar y eliminar el primer elemento de la pila
        int elemento = pila.pop();
        System.out.println("Después de traer y eliminar el primer elemento (popping): " + pila);
        System.out.println();

        // Obtener el primer elemento de la pila sin eliminarlo
        int primerElemento = pila.peek();
        System.out.println("Primer elemento = " + primerElemento);
        System.out.println("Después de traer sin eliminar el primer elemento (peeking): " + pila);
    }

    // Método para agregar un elemento a la pila
    public void push(Integer elemento) {
        datos.addFirst(elemento);
    }

    // Método para sacar y eliminar un elemento de la pila
    public Integer pop() {
        if (datos.isEmpty()) {
            System.out.println("La pila está vacía");
        }
        return datos.removeFirst();
    }

    // Método para obtener el primer elemento de la pila sin eliminarlo
    public Integer peek() {
        return datos.peekFirst();
    }

    // Método toString para mostrar la representación de la pila
    @Override
    public String toString() {
        return datos.toString();
    }
}

