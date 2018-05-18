package CodeStepByStep;

import java.util.Calendar;

public class Date{

    public static void main(String[] args) {
        Date day1 = new Date(1,1);
        System.out.println(day1.daysInMonth());
    }

    private int m;
    private int d;

    public Date(int m, int d) {
        this.m = m;
        this.d = d;
    }

    public int daysInMonth() {
        Calendar cal = Calendar.getInstance();
        m -= 1;
        cal.set(2018, this.m , this.d);
        int dayMax =  cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        m += 1;
        return dayMax;
    }

    public int getDay() {
        return d;
    }

    public int getMonth() {
        return m;
    }

    public void nextDay() {
        Calendar cal = Calendar.getInstance();
        cal.set(2000, this.m - 1, this.d);
        cal.add(Calendar.DAY_OF_MONTH, 1);
        this.d = cal.get(Calendar.DAY_OF_MONTH);
        this.m = cal.get(Calendar.MONTH) + 1;
    }

    public String toString() {
        if (m < 10 && d < 10) {
            return  "0" + m + "/" + "0" + d;
        } else if (m > 10 && d < 10) {
            return  m + "/" + "0" + d;
        } else {
            return  m + "/" + d;
        }
    }

}
