package CodeStepByStep;

public final class ClockAdvance {

    public static void main(String[] args) {
        ClockAdvance time1 = new ClockAdvance(6,27,"PM");
        time1.advance(1);
        time1.advance(30);
        time1.advance(5);
        time1.advance(60);
        time1.advance(128);
        time1.advance(180);
        time1.advance(1440);
        time1.advance(21075);
    }

    private int hour;
    private int minute;
    private String amPm;

    public ClockAdvance(int hour, int minute, String amPm) {
        this.hour = hour;
        this.minute = minute;
        this.amPm = amPm;
    }

    // param is type long so that the advance problem itself works!
    public void advance(long minutes) {
        for (int i = 0; i < minutes; i++) {
            minute++;
            if (minute >= 60) {
                minute = 0;
                hour++;
                if (hour == 12) {
                    amPm = (amPm.equalsIgnoreCase("AM") ? "PM" : "AM");
                } else if (hour > 12) {
                    hour = 1;
                }
            }
        }
    }

    public void advance(int minutes) {
        for (int i = 0; i < minutes; i++) {
            minute++;
            if (minute >= 60) {
                minute = 0;
                hour++;
                if (hour == 12) {
                    amPm = (amPm.equalsIgnoreCase("AM") ? "PM" : "AM");
                } else if (hour > 12) {
                    hour = 1;
                }
            }
        }
    }

    public final int getHour() {
        return hour;
    }

    public final int getMinute() {
        return minute;
    }

    public final String getAmPm() {
        return amPm;
    }

    public final String toString() {
        String result = hour + ":";
        if (minute < 10) {
            result += "0" + minute;
        } else {
            result += minute;
        }
        result += " " + amPm;
        return result;
    }

    public boolean equals(Object o) {
        if (o instanceof ClockAdvance) {
            ClockAdvance t = (ClockAdvance) o;
            return t.hour == this.hour && t.minute == this.minute && t.amPm.equals(this.amPm);
        } else {
            return false;
        }
    }

// YOUR CODE GOES HERE

}