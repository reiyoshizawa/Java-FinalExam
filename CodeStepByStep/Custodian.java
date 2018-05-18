package CodeStepByStep;

public class Custodian extends Employee{

    @Override
    public int getHours() {
        return super.getHours() * 2;
    }

    @Override
    public double getSalary() {
        return super.getSalary() - 10000;
    }

    @Override
    public int getVacationDays() {
        return super.getVacationDays() / 2;
    }

    @Override
    public String getVacationForm() {
        return super.getVacationForm();
    }

    String clean() {
        return "Workin' for the man.";
    }
}
