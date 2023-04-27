public class Main {
    public static void main(String[] args) {
        HashMapDemo hashMapDemo = new HashMapDemo();
        hashMapDemo.add("France", "Paris");
        hashMapDemo.add("China", "Beijing");
        hashMapDemo.add("Australia", "Canberra");
        hashMapDemo.display();
        hashMapDemo.remove("France");
        hashMapDemo.display();
    }
}
