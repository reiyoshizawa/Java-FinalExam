package Day6;

public class IronMan extends SuperHero{
    private int money;
    private int numOfCars;

    public IronMan(String name, int age, double healthPoints,
                     double attackPoints, String[] superPowers,
                   int money, int numOfCars) {
        super(name,age,healthPoints,attackPoints,superPowers);
        this.money = money;
        this.numOfCars = numOfCars;
        System.out.println(super.name);
    }
    public IronMan(String name, int age, String[] superPowers) {
        this(name, age, 0, 0,
                superPowers, 0, 0);
    }

    public void fight() {
        String powers = "";
        for (String power: this.superPowers) {
            powers += power + " ";
        }
        System.out.println("IronMan fights with his " + powers);
    }


}
