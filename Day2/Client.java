package Day2;

public class Client {
    public static void main(String[] args) {
        User ul = new User("rei", "rei.com", "aaa",
                30, "Tokyo", "salsa");
        ul.login("rei", "aaa");
        ul.changeInterest("bachata");
        ul.setUsername("mei");
//        System.out.println(ul.getUsername());
        ul.getUsername();
    }
}
