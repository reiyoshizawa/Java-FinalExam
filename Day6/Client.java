package Day6;

public class Client {
    public static void main(String[] args) {
        String[] powers = {"Fly", "Smart", "Rich"};

        IronMan iron1 = new IronMan("Tony", 45, 100,
                100, powers,100000,200);

        iron1.fight();

    }

}
