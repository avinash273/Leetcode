package org.code.Basics;

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

class address{
    String city, state, country;

    address(String city,String state,String country){
        this.city = city;
        this.state = state;
        this.country = country;
    }
}

class employee{
    int ID;
    String name;
    address homeAddress;

    employee(int ID, String name, address homeAddress){
        this.ID = ID;
        this.name = name;
        this.homeAddress = homeAddress;
    }

    void display(){
        System.out.println(this.ID+" "+this.name);
        System.out.println(this.homeAddress.city+" "+this.homeAddress.state+" "+this.homeAddress.country);
    }
}


public class inheritanceTry {
    void implementAnimals() {
        cat cat = new cat();
        cat.meaow();
        cat.eat();

        address address1 = new address("Bangalore","Karnataka","India");
        address address2 = new address("Kolkata","West Bengal","India");


        employee emp1 = new employee(100,"avinash",address1);
        employee emp2 = new employee(101,"akash",address2);
        emp1.display();
        emp2.display();
    }
}
