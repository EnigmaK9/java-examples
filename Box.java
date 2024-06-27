// Clase genérica que ilustra el uso de Generics en Java
public class Box<T> {
    // Atributo genérico
    private T t;

    // Método para establecer el valor del atributo genérico
    public void set(T t) {
        this.t = t;
    }

    // Método para obtener el valor del atributo genérico
    public T get() {
        return t;
    }

    // Método principal para probar la clase Box
    public static void main(String[] args) {
        // Crear una instancia de Box para almacenar un Integer
        Box<Integer> integerBox = new Box<>();
        integerBox.set(10);
        System.out.println("Valor en integerBox: " + integerBox.get());

        // Crear una instancia de Box para almacenar un String
        Box<String> stringBox = new Box<>();
        stringBox.set("Hola Mundo");
        System.out.println("Valor en stringBox: " + stringBox.get());
    }
}

