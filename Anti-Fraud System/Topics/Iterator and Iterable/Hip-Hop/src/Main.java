import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void iterateOverList(ListIterator<String> iterator) {
        while (iterator.hasNext()) {
            String current = iterator.next();

            if (current.equalsIgnoreCase("hip")) {
                iterator.add("Hop");
            }
        }
    }

    public static void printList(ListIterator<String> iterator) {
        iterator.forEachRemaining(System.out::println);
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        iterateOverList(list.listIterator());
        printList(list.listIterator());
    }
}