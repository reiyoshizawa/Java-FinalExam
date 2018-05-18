package Day5;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList<String> countries = new ArrayList<>();
        countries.add("Canada");
        countries.add("USA");
        countries.add("Mexico");
        countries.add("China");
        countries.add("Brazil");
        countries.add("Japan");
        countries.add("Korea");
        countries.add("Turkey");
        countries.add("Thailand");
        countries.add("Italy");
        countries.add("Spain");
        countries.add("Portugal");

        System.out.println("The number of countries " + countries.size());

        System.out.println(countries);

        countries.remove(0);
        countries.remove("USA");

        System.out.println(countries);
        System.out.println(countries.get(0));

        countries.set(6, "Thai");
        System.out.println(countries);

        countries.isEmpty(); // true or false

        for (int i = 0; i < countries.size(); i++) {
            System.out.println(countries.get(i));
        }

        for (String country: countries) {
            System.out.println(country);
        }

    }
}
