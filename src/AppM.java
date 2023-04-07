public class AppM {
    public static void main(String[] args) {
        Pillar pillar = new Pillar(58);
        System.out.println(pillar.getVolume(new Circle(10)));
        System.out.println(pillar.getVolume(new Ractangle(12, 22)));
    }
}

class Pillar {
    double height;

    Pillar(double height) {
        this.height = height;
    }

    double getVolume(Circle c) {
        return c.getAera() * height;
    }

    double getVolume(Ractangle r) {
        return r.getAera() * height;
    }
}

class Circle {
    double r;

    Circle(double r) {
        this.r = r;
    }

    public double getAera() {
        return (3.14 * r * r);
    }
}

class Ractangle {
    double a, b;

    Ractangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getAera() {
        return a * b;
    }
}
