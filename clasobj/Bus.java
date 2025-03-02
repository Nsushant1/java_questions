package clasobj;

// class 
public class Bus {
    String brand;
    int speed;

    // constructor
    Bus(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    // method
    void display() {
        System.out.println(brand);
        System.out.println(speed);
    }

}
