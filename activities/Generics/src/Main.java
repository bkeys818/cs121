import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        GenericMethods genericMethods = new GenericMethods();

        ArrayList<Integer> integers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.print("Integers arrayList: ");
        genericMethods.printArrayList(integers);

        ArrayList<Double> doubles = new ArrayList<>(Arrays.asList(1.0, 1.1, 1.2, 1.3, 1.4));
        System.out.print("\nDoubles arrayList: ");
        genericMethods.printArrayList(doubles);

        ArrayList<Character> characters = new ArrayList<>(Arrays.asList('a', 'b', 'c', 'd', 'f'));
        System.out.print("\nCharacters arrayList: ");
        genericMethods.printArrayList(characters);

        ArrayList<String> strings = new ArrayList<>(Arrays.asList("alpha", "beta", "charlie", "delta", "foxtrot"));
        System.out.print("\nStrings arrayList: ");
        genericMethods.printArrayList(strings);
    }
}
