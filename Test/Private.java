package Test;

public class Private {

    protected int sampleInt;

    public static void main(String[] args) {
        Private run = new Private();
        run.sampleInt = 10;
        System.out.println(run.sampleInt);
    }

}
