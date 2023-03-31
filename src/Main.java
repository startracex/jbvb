public class Main {
    public static void main(String[] args) {
        Simulator simulator = new Simulator();
        simulator.playSound(new Dog());
        simulator.playSound(new Cat());
    }
}

abstract class Animal {
    void cry() {
    }

    String GetAnimalName() {
        return null;
    }
}

class Simulator extends Animal {
    void playSound(Animal animal) {
        System.out.print(animal.GetAnimalName()+":");
        animal.cry();
    }
}

class Dog extends Animal {
    void cry() {
        System.out.println("汪");
    }

    String GetAnimalName() {
        return "狗";
    }
}

class Cat extends Animal {
    void cry() {
        System.out.println("喵");
    }
    String GetAnimalName() {
        return "猫";
    }
}