package CodeStepByStep;

import java.sql.Time;

public class TimeSpan {

    public static void main(String[] args) {
        TimeSpan city = new TimeSpan(3,45);
        city.add(2,30);
        System.out.println(city.getHours());
        System.out.println(city.getMinutes());
        city.add(0,51);
        city.add(new TimeSpan(1,20));
    }

    private int hours;
    private int minutes;

    public TimeSpan(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        if (0 < minutes && minutes < 60) {
            this.minutes = minutes;
        }
        return minutes;
    }

    public void add(int hours, int minutes) {
        if (hours > -1 &&  0 < minutes && minutes < 60) {
            this.hours += hours;
            this.minutes += minutes;
            if (this.minutes >= 60) {
                this.hours += 1;
                this.minutes = this.minutes - 60;
            }
            System.out.println(this.hours + "h" + this.minutes + "m");
        }
    }

    public void add(TimeSpan timeSpan) {
        if (timeSpan.hours > -1 &&  0 < timeSpan.minutes && timeSpan.minutes < 60) {
            this.hours += timeSpan.hours;
            this.minutes += timeSpan.minutes;
            if (this.minutes >= 60) {
                this.hours += 1;
                this.minutes = this.minutes - 60;
            }
            System.out.println(this.hours + "h" + this.minutes + "m");
        }
    }

    public double getTotalHours() {
        double minutesper = minutes * 1.66 / 100;
        return hours + minutesper;
    }

    public String toString() {
        return hours + "h" + minutes + "m";
    }
}
