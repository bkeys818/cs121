package stringArrayList;

public class StringArrayListTest {
    public static void main(String[] args) {
        StringArrayList colors = new StringArrayList();

        colors.add("blue", "green", "yellow", "red", "orange", "pink");
        System.out.println("Size: " + colors.getSize());
        System.out.println("Item: " + colors.getItem(3));
        colors.display1();
        colors.remove("red");
        colors.display2();
    }
}
