// Clase que ilustra el concepto de Encapsulación
public class Counter {
    // El atributo count es privado para que no sea accesible directamente desde fuera de la clase
    private int count = 0;

    // Método público para incrementar el valor de count
    public void increment() {
        count++;
    }

    // Método público para obtener el valor de count
    public int getCount() {
        return count;
    }

    // Método principal para probar la clase Counter
    public static void main(String[] args) {
        Counter counter = new Counter();

        // Incrementar el contador
        counter.increment();
        counter.increment();

        // Obtener y mostrar el valor del contador
        System.out.println("El valor del contador es: " + counter.getCount());
    }
}

