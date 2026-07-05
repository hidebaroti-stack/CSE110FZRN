package SUDDIN.MID;

public class Animal {
    String name;
    private int money = 500;

    void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    void display() {
        System.out.println("Animal: " + name);
    }
}

class AnimalMain {
    public static void main(String[] args) {
        Animal animal = new Animal();
        //System.out.println("Money: " + animal.money); // can't access private field
        System.out.println("Money: " + animal.getMoney()); // getter for private money access
        animal.setName("Tiger");
        animal.display();
    }
}