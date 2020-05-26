package Basics;

/**
 * Hierarchical inheritance is implemented here
 * its is-a relationship
 */
class Animal {
    void eat() {
        System.out.println("eating..");
    }
}

class dog extends Animal {
    void bark() {
        System.out.println("barking..");
    }
}

class cat extends Animal {
    void meaow() {
        System.out.println("meawing..");
    }
}

/**
 * Now trying out Aggregation Has-a
 */


public class inheritanceTry {
    void implementAnimals() {
        cat cat = new cat();
        cat.meaow();
        cat.eat();
    }
}
