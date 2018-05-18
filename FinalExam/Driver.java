package FinalExam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * @author Rei Yoshizawa
 */


public class Driver {

    private ArrayList<Vehicle> vehicles = new ArrayList<>();

    private void addVehicle(Vehicle v) {
        vehicles.add(v);
    }

    private void sortVehicles() {
        System.out.println("");
        System.out.println("------------- sorted -----------------");
        Collections.sort(vehicles);
    }

    private void printVehicles() {
        for (int i = 0; i < vehicles.size(); i++) {
            System.out.println(vehicles.get(i).toString());
        }
    }

    private void accelerate() {
        System.out.println("");
        System.out.println("------------- accelerate -----------------");
        Iterator<Vehicle> it = vehicles.iterator();
        while (it.hasNext()) {
            Vehicle v = it.next();
            System.out.println(v);
            v.accelerate();
        }
    }

    public static void main(String[] args) {

        Driver d = new Driver();
        Car car1 = new Car(300);
        Car car2 = new Car(900);
        Car car3 = new Car(500);
        Boat boat1 = new Boat(1200);
        Boat boat2 = new Boat(1800);
        Boat boat3 = new Boat(1500);
        d.addVehicle(car1);
        d.addVehicle(boat1);
        d.addVehicle(car2);
        d.addVehicle(boat2);
        d.addVehicle(car3);
        d.addVehicle(boat3);
        d.printVehicles();
        d.sortVehicles();
        d.printVehicles();
        d.accelerate();
    }

}
