// Clase base o superclase
class Vehicle {
    // Atributo de la clase Vehicle
    String brand = "Ford";

    // Método de la clase Vehicle
    void honk() {
        System.out.println("Beep, beep!");
    }
}

// Clase derivada o subclase que hereda de Vehicle
class Car extends Vehicle {
    // Atributo adicional de la clase Car
    String modelName = "Mustang";

    // Método adicional de la clase Car
    void display() {
        System.out.println("Brand: " + brand + ", Model: " + modelName);
    }

    // Método principal para probar las clases Vehicle y Car
    public static void main(String[] args) {
        // Crear una instancia de Car
        Car myCar = new Car();

        // Llamar a métodos heredados y propios de la clase Car
        myCar.honk();
        myCar.display();
    }
}

