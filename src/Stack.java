
//  Definir una pila construida a partir de un arreglo
public class Stack {
    private int[] stackArray; // Arreglo para almacenar los elementos de la pila
    private int top; // Índice del elemento superior de la pila

    // Constructor para inicializar la pila
    public Stack(int size) {
        stackArray = new int[size];
        top = -1; // La pila está vacía al inicio
    }

    // Método para agregar un elemento a la pila
    public void push(int value) {
        if (top == stackArray.length - 1) {
            System.out.println("No se puede agregar más elementos.");
        } else {
            stackArray[++top] = value;
        }
    }

    // Método para eliminar y retornar el elemento superior de la pila
    public int pop() {
        if (isEmpty()) {
            System.out.println("La pila está vacía.");
            return -1; // Valor indicativo de error
        } else {
            return stackArray[top--];
        }
    }

    // Método para ver el elemento superior de la pila sin eliminarlo
    public int peek() {
        if (isEmpty()) {
            System.out.println("La pila está vacía.");
            return -1; // Valor indicativo de error
        } else {
            return stackArray[top];
        }
    }

    // Método para verificar si la pila está vacía
    public boolean isEmpty() {
        return top == -1;
    }

    // metodo para ver cuantos datos hay en la pila
    public int size() {
        return top + 1;
    }

    // metodo para ver cuanto espacio hay en la pila
    public int capacity() {
        return stackArray.length - size();
    }

    // metodo para ver si la pila esta llena
    public boolean isFull() {
        return top == stackArray.length - 1;
    }

    // Metodo para imprimir los elementos de la pila
    public void printStack() {
        if (isEmpty()) {
            System.out.println("La pila está vacía.");
        } else {
            System.out.print("Elementos en la pila: ");
            for (int i = top; i >= 0; i--) {
                System.out.print(stackArray[i] + " ");
            }
            System.out.println();
        }
    }

}
