package Day6;

public class SuperHero {
    protected String name;
    protected int age;
    protected double healthPoints;
    protected double attackPoints;
    protected String[] superPowers;

    public SuperHero(String name, int age, double healthPoints,
                     double attackPoints, String[] superPowers) {
        this.name = name;
        this.age = age;
        this.healthPoints = healthPoints;
        this.attackPoints = attackPoints;
        this.superPowers = superPowers;
    }

    public void fight() {
        System.out.println(this.name + " is fighting!");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHealthPoints() {
        return healthPoints;
    }

    public double getAttackPoints() {
        return attackPoints;
    }

    public String[] getSuperPowers() {
        return superPowers;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHealthPoints(double healthPoints) {
        this.healthPoints = healthPoints;
    }

    public void setAttackPoints(double attackPoints) {
        this.attackPoints = attackPoints;
    }

    public void setSuperPowers(String[] superPowers) {
        this.superPowers = superPowers;
    }
}
