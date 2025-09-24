public class App {
    public static void main(String[] args) throws Exception {

        // Crear una pila de capacidad 9
        Stack stack = new Stack(9);

        // aplilar 5 valores aleatorios entre 1 y 100
        for (int i = 0; i < 5; i++) {
            int value = (int) (Math.random() * 100) + 1;
            stack.push(value);
            System.out.println("Se apiló: " + value);
        }

        // muestra el tamaño actual de la pila y sus valores
        System.out.println("Tamaño de la pila: " + stack.size());
        stack.printStack();

        // Elimina un valor de la pila
        System.out.println("Desapilando elementos:" + stack.pop());

        // Muestra el tamaño actual de la pila y sus valores
        System.out.println("Tamaño de la pila: " + stack.size());
        stack.printStack();

        // Enseña la capacidad restante de la pila
        System.out.println("Capacidad restante de la pila: " + stack.capacity());

        System.out.println("\n--Segunda parte de la actividad Usando Stack--\n");

        // Parte 02 de la actividad
        java.util.Stack<Integer> javaStack = new java.util.Stack<>();
        java.util.Stack<Integer> invertStack = new java.util.Stack<>();

        // agregar 7 valores aleatorios entre 1 y 100
        for (int i = 0; i < 7; i++) {
            int value = (int) (Math.random() * 100) + 1;
            javaStack.push(value);
            System.out.println("Se apiló en el Stack: " + value);
        }

        // Mostrar el Stack original
        System.out.println("Stack Original: " + javaStack);
        do {
            invertStack.push(javaStack.pop());
        } while (!javaStack.isEmpty());

        System.out.println("Stack Invertido: " + invertStack);
    }

}
