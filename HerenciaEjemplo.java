// HerenciaEjemplo.java
class Vehicle {
    // Atributo de la clase Vehicle
    String brand = "Ford";

    // Método de la clase Vehicle
    void honk() {
        System.out.println("El vehículo hace: Beep, beep!");
    }
}

// Clase derivada o subclase que hereda de Vehicle
class Car extends Vehicle {
    // Atributo adicional de la clase Car
    String modelName = "Mustang";

    // Método adicional de la clase Car
    void display() {
        System.out.println("Marca: " + brand + ", Modelo: " + modelName);
    }

    // Método principal para probar las clases Vehicle y Car
    public static void main(String[] args) {
        // Crear una instancia de Car
        Car myCar = new Car();

        // Llamar a métodos heredados y propios de la clase Car
        System.out.println("Llamando al método honk() de la clase Vehicle desde la instancia de Car:");
        myCar.honk();  // Este método es heredado de Vehicle

        System.out.println("\nLlamando al método display() de la clase Car:");
        myCar.display();  // Este método es propio de Car

        // Mostrar la herencia en acción
        System.out.println("\nMostrando la herencia en acción:");
        System.out.println("El objeto myCar tiene acceso al atributo 'brand' de Vehicle: " + myCar.brand);
        System.out.println("El objeto myCar tiene acceso al atributo 'modelName' de Car: " + myCar.modelName);
    }
}

