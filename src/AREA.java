public class AREA {
    public static void main(String[] args) {
        Pillar pillar = new Pillar(58);
        System.out.println(pillar.getVolume(new Circle(10)));
        System.out.println(pillar.getVolume(new Rectangle(12, 22)));
    }
}

class Pillar {
    double height;

    Pillar(double height) {
        this.height = height;
    }

    double getVolume(Circle c) {
        return c.getArea() * height;
    }

    double getVolume(Rectangle r) {
        return r.getArea() * height;
    }
}

class Circle {
    double r;

    Circle(double r) {
        this.r = r;
    }

    public double getArea() {
        return (3.14 * r * r);
    }
}

class Rectangle {
    double a, b;

    Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getArea() {
        return a * b;
    }
}
/*

public class AREA {
    public static void main(String[] args) {
        Pillar pillar;
        Geometry bottom=null;
        pillar=new Pillar(bottom, 100);
        System.out.println(pillar.getVolume());
        bottom=new Rectangle(12,22);
        pillar=new Pillar(bottom, 58);
        System.out.println(pillar.getVolume());
        bottom=new Circle(10);
        pillar=new Pillar(bottom, 58);
        System.out.println(pillar.getVolume());

    }
}

class Pillar {
    Geometry bottom;
    double height;

    Pillar(Geometry bottom, double height) {
        this.height = height;
        this.bottom = bottom;
    }

    double getVolume() {
        if (bottom == null) {
            return -1;
        }
        return bottom.getArea() * height;
    }
}

interface Geometry {
    double getArea();
}

class Circle implements Geometry {
    double r;

    Circle(double r) {
        this.r = r;
    }

    @Override
    public double getArea() {
        return (3.14 * r * r);
    }
}

class Rectangle implements Geometry {
    double a, b;

    Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea() {
        return a * b;
    }
}

*/

