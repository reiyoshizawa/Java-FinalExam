package Day1;

public class Client {
    // class you can run yourcode!
    public static void main(String[] args){
        Car myCar = new Car("Blue",  "BMW", 2018, 70000.0);
        Car yourCar = new Car("Red",  "Honda", 2016, 40000.0);
        myCar.drive();
        yourCar.drive();
        yourCar.count();
    }
}
