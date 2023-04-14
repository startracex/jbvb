public class AnimalSimulator {
    public static void main(String[] args) {
        Simulator s = new Simulator();
        s.platSound(new Dog());
        s.platSound(new Cat());
    }
}

interface Animal {
    void cry();

    String getAnimalName();
}

class Simulator {

    void platSound(Animal a) {
        System.out.println(a.getAnimalName());
        a.cry();
    }
}
class Dog implements Animal {
    @Override
    public void cry() {
        System.out.println("汪汪汪");
    }

    @Override
    public String getAnimalName() {
        return "狗";
    }
}
class Cat implements Animal{
    @Override
    public void cry() {
        System.out.println("喵喵喵");
    }

    @Override
    public String getAnimalName() {
        return "猫";
    }
}