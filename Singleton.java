public class Singleton {
    // La única instancia de la clase Singleton, inicializada como null.
    private static Singleton instance;

    // El constructor es privado para evitar la instanciación directa de la clase.
    private Singleton() {
        System.out.println("Singleton instanciado.");
    }

    // Método público y estático que proporciona acceso a la única instancia de la clase.
    public static Singleton getInstance() {
        // Si la instancia es null, se crea una nueva instancia de Singleton.
        if (instance == null) {
            System.out.println("Instancia única no existente, creando una nueva.");
            instance = new Singleton();
        } else {
            System.out.println("Instancia única ya existente, retornando la misma.");
        }
        // Retorna la única instancia de la clase.
        return instance;
    }

    // Método de ejemplo para demostrar la funcionalidad del Singleton.
    public void showMessage() {
        System.out.println("Hola desde el Singleton!");
    }

    // Método principal para probar el patrón Singleton.
    public static void main(String[] args) {
        // Intentar obtener la instancia única del Singleton.
        Singleton singleton1 = Singleton.getInstance();
        singleton1.showMessage();

        // Intentar obtener la instancia única del Singleton nuevamente.
        Singleton singleton2 = Singleton.getInstance();
        singleton2.showMessage();

        // Comparar ambas referencias para confirmar que son la misma instancia.
        if (singleton1 == singleton2) {
            System.out.println("singleton1 y singleton2 son la misma instancia.");
        } else {
            System.out.println("singleton1 y singleton2 son instancias diferentes.");
        }
    }
}

