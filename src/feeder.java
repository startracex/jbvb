public class feeder {
    public static void main(String[] args) {
      Feeder feeder = new Feeder("小华");
      feeder.feed(new Cat(), new Fish());
      feeder.feed(new Dog(), new Bone());
    }
  }

  class Feeder {
    String name;

    Feeder(String name) {
      System.out.println(name);
      this.name = name;
    }

    void feed(Animal animal, Food food) {
      animal.eat(food);
    }
  }

  abstract class Animal {
    abstract void eat(Food f);
  }

  class Cat extends Animal {
    String name = "猫";

    void eat(Fish f) {
      System.out.println(this.name + "吃" + f.getName());
    }

    void eat(Food f) {
      System.out.println(this.name + "吃" + f.getName());
    }
  }

  class Dog extends Animal {
    String name = "狗";

    void eat(Food f) {
      System.out.println(this.name + "吃" + f.getName());
    }
  }

  interface Food {
    String getName();
  }

  class Bone implements Food {
    public String getName() {
      return "骨头";
    }
  }

class Fish implements Food {
  public String getName() {
    return "鱼";
  }
}
