package CodeStepByStep;

public class Student {
//
//    public static void main(String[]args){
//
//        Student John = new Student("Nick", 42342);
//        System.out.println(John.incrementUnits(2));
//        System.out.println(John.incrementUnits(2));
//
//    }

    public String name;
    public int id;
    public int units;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.units = 0;
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return id;
    }

    public int getUnits() {
        return units;
    }

    public int incrementUnits(int units) {
        int incrementUnits =  units;
        this.units += incrementUnits;
        return this.units;
    }

    public boolean hasEnoughUnits() {
        if (this.units >= 180) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
       return name + " (#" + id + ")" ;
    }
}
