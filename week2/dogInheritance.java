

// Base class Animal
class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass Dog inherits from Animal
class Dog extends Animal {
    public void bark() {
        System.out.println("Dog bark");
    }
}

// Subclass Puppy inherits from Dog
class Puppy extends Dog {
    public void play() {
        System.out.println("Puppy play");
    }
}

public class dogInheritance {
    public static void main(String[] args) {
        // Create instances
        Animal animal = new Animal();
        Dog dog = new Dog();
        Puppy puppy = new Puppy();

        System.out.println("Calling method from Animal class:");
        animal.makeSound();

        System.out.println("\nCalling methods from Dog class and inherited from Animal:");
        dog.makeSound();
        dog.bark();

        System.out.println("\nCalling methods from Puppy class and inherited from Dog and Animal:");
        puppy.makeSound();
        puppy.bark();
        puppy.play();
    }
}
