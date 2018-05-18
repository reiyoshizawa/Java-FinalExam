package RandomStringChooser;

public class RandomWordClient {

    public static void main(String[] args) {
        String[] arr = {"Hello", "World", "Java", "Programming", "Object"};
        RandomStringChooser aChooser = new RandomStringChooser(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.println(aChooser.getNext());
        }

        RandomLetterChooser letterChooser = new RandomLetterChooser("Hello");
        for(int i = 0; i < 5; i++) {
            System.out.print(letterChooser.getNext());
        }

    }
}
