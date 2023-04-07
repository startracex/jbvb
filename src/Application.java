/*
public class Application {
    public static void main(String[] args) {
        Pillar pillar;
        Geometry bottom=null;
        pillar=new Pillar(bottom, 100);
        System.out.println(pillar.getVolume());
        bottom=new Ractangle(12,22);
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
        return bottom.getAera() * height;
    }
}

interface Geometry {
    double getAera();
}

class Circle implements Geometry {
    double r;

    Circle(double r) {
        this.r = r;
    }

    @Override
    public double getAera() {
        return (3.14 * r * r);
    }
}

class Ractangle implements Geometry {
    double a, b;

    Ractangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getAera() {
        return a * b;
    }
}
*/
