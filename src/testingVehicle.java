// Inheritance

class Vehicle{
    String v;
    int speed;
    int wheels;
    public Vehicle(String v,int speed,int wheels){
        this.v = v;
        this.speed = speed;
        this.wheels = wheels;
    }
    
    void move(){
        System.out.println(v + " can move");
    }

    void speed(){
        System.out.println(v + " has speed of "+speed);
    }

    void noOfWheels(){
        System.out.println(v + " has " + wheels + " wheels");
    }
} 


class Bike extends Vehicle{
    public Bike(String v,int speed,int wheels){
        super(v,speed,wheels);
    }
}

class Ebike extends Bike{
    public Ebike(String v,int speed,int wheels){
        super(v, speed, wheels);
    }
    public void hasBattery(){
        System.out.println("Bike name" + v + " has battery");
    }
}


public class testingVehicle {
    public static void main(String[] args) {
        // Animal animal = new Animal();
        Vehicle car = new Vehicle("BMW", 30, 4);
        car.move();
        car.speed();
        car.noOfWheels();

        Ebike ebike = new Ebike("OLA", 20, 2);
        ebike.hasBattery();

        Bike b = new Bike("Pulser", 100, 2);
        b.move();
        b.noOfWheels();
    }
}
