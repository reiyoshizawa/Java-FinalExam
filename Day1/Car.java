package Day1;

public class Car {
    // states (variable) - color, model, year, price
    String color;
    String model;
    int year;
    double price;

    // constructor - a method to create an instance
    public Car(String c, String m, int y, double p){
        color = c;
        model = m;
        year = y;
        price = p;
    }

    // behaviors (methods) - drive, park
    // instance methods
    public void drive(){
        System.out.println("Drive!");
    }

    public void park(){
        System.out.println("Park!");
    }

    // class methods
    public static void count(){
        System.out.println("Count!");
    }
}
