package CodeStepByStep;

public class DateAbsoluteDay {

    public static void main(String[] args) {
        DateAbsoluteDay jan1 = new DateAbsoluteDay(1, 1);
        DateAbsoluteDay jan4 = new DateAbsoluteDay(1, 4);
        DateAbsoluteDay feb1 = new DateAbsoluteDay(2, 1);
        DateAbsoluteDay mar10 = new DateAbsoluteDay(3, 10);
        DateAbsoluteDay sep19 = new DateAbsoluteDay(9, 19);
        DateAbsoluteDay dec31 = new DateAbsoluteDay(12, 31);
        System.out.println(jan1.absoluteDay());
        System.out.println(jan4.absoluteDay());
        System.out.println(feb1.absoluteDay());
        System.out.println(mar10.absoluteDay());
        System.out.println(sep19.absoluteDay());
        System.out.println(dec31.absoluteDay());
    }

    public DateAbsoluteDay(int month, int day) {
        this.month = month;
        this.day = day;
    }

    public int month;
    public int day;

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int absoluteDay() {

        int[] daysMonth = {31, 28, 31, 30, 31, 30, 31,
                31, 30, 31, 30, 31};

        if (this.month < 2) {
            return day;
        } else {
            int couter = 0;
            int absoluteSum = 0;
            for (int i = 0; i < this.month - 1; i++) {
                couter += daysMonth[i];
                absoluteSum = couter + this.day;
            }
            return absoluteSum;
        }
    }



}

