public class V {
    public static void main(String[] args) {
        Phone p = new Phone(193, 485);
        Truck t = new Truck("z025", "benz", "小韩", 76.56, "HYX600235",p);
        t.transport();
        t.keepup();
    }

}

abstract class Vehicle {
    String id;
    String type;
    String header;

    abstract void transport();

}

interface keep {
    void keepup();
}

class Truck extends Vehicle implements keep {
    double weight;
    String trackID;

    Phone phone;

    Truck(String id, String type, String header, double weight, String trackID,Phone p) {
        this.id = id;
        this.type = type;
        this.header = header;
        this.weight = weight;
        this.trackID = trackID;
        this.phone=p;
        System.out.println("货物重量" + weight + "kg");
        System.out.println("物流单号" + trackID);
        System.out.println("==============");
    }

    @Override
    void transport() {
        System.out.println(this.header + "驾驶" + this.id + this.type + "正在运输货物");
        this.phone.locate();
        System.out.println("==============");
    }

    public void keepup() {
        System.out.println("运输已完成");
        System.out.println(this.header + "的" + this.id + this.type + "已归还");
        System.out.println("保养完成");
    }
}

interface GPS {
    void locate();
}

class Phone implements GPS {
    int x, y;

    Phone(int x, int y) {
        this.x = x;
        this.y = y;

    }

    @Override
    public void locate() {
        System.out.println("当前位置为(" + x + "," + y + ")");
    }
}