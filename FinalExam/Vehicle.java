package FinalExam;

import java.util.Objects;

/**
 * @author Rei Yoshizawa
 */


abstract public class Vehicle implements Comparable, Steerable{

    private int weightPounds;

    public Vehicle(int weightPounds) {
        if (weightPounds > 0) {
            this.weightPounds = weightPounds;
        }
    }

    public int getWeightPounds() {
        return weightPounds;
    }

    public void setWeightPounds(int weightPounds) {
        if (weightPounds > 0) {
            this.weightPounds = weightPounds;
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return weightPounds == vehicle.weightPounds;
    }

    @Override
    public int compareTo(Object o) {
        if (this.weightPounds < ((Vehicle) o).weightPounds) {
            return -1;
        } else {
            return 1;
        }
    }

    @Override
    public int hashCode() {

        return Objects.hash(weightPounds);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "weightPounds=" + weightPounds +
                '}';
    }
}
