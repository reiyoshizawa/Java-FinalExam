package Chapter16;

import java.util.*;

public class Client {

    public static void main(String[] args) {
        String [] colors = {"BLUE", "GREEN", "YELLOW", "RED", "WHITE"};
        List<String> colorList = new ArrayList<>(Arrays.asList(colors));
        colorList.add(0, "CYAN");

        String[] removeColors = {"RED", "WHITE", "BLUE"};
        List<String> removeList = new ArrayList<>(Arrays.asList(removeColors));
        removeList.add(0,"CYAN");

//        removeElementsFrom(colorList, removeList);

        System.out.println(colorList);
        System.out.println(removeList);

        Collections.shuffle(colorList);
        System.out.println(colorList);

        Collections.reverse(colorList);
        System.out.println(colorList);

        Collections.sort(colorList);
        System.out.println(colorList);

        Collections.min(colorList);
        System.out.println(colorList);

        Collections.max(colorList);
        System.out.println(colorList);

        Collections.frequency(colorList, "RED");
        System.out.println(colorList);

        // Implementation
        Collections.binarySearch(colorList, "RED");
        System.out.println(colorList);

    }

    private static void removeElementsFrom(Collection<String> collection1, Collection<String> collection2) {
        Iterator<String> iterator = collection1.iterator();

        while (iterator.hasNext()) {
            if (collection2.contains(iterator.next())) {
                iterator.remove();
            }
        }

    }

}
