public class Person {
    // El campo 'name' está encapsulado usando el modificador de acceso 'private'.
    // el campo name está encapsulado usando el modificado de acceso private
    private String name;

    // El método 'setName' permite establecer el valor del campo 'name'.
    // Este método es público, por lo que se puede acceder desde fuera de la clase.
    public void setName(String newName) {
        // Validación simple: asegurarse de que el nombre no sea nulo o vacío.
        if (newName != null && !newName.isEmpty()) {
            this.name = newName;
        } else {
            System.out.println("El nombre no puede ser nulo o vacío.");
        }
    }

    // El método 'getName' permite obtener el valor del campo 'name'.
    // Este método también es público, proporcionando acceso controlado al campo 'name'.
    public String getName() {
        return this.name;
    }

    // Método principal para probar la encapsulación.
    public static void main(String[] args) {
        // Crear una instancia de la clase 'Person'.
        Person person = new Person();

        // Intentar establecer un nombre válido.
        person.setName("Carlos");
        // Obtener y mostrar el nombre establecido.
        System.out.println("Nombre: " + person.getName());

        // Intentar establecer un nombre nulo para ver la validación.
        person.setName(null);
        // Obtener y mostrar el nombre para confirmar que no ha cambiado.
        System.out.println("Nombre después de intento inválido: " + person.getName());

        // Intentar establecer un nombre vacío para ver la validación.
        person.setName("");
        // Obtener y mostrar el nombre para confirmar que no ha cambiado.
        System.out.println("Nombre después de intento inválido: " + person.getName());
    }
}

