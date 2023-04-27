package stringArrayList;

import java.util.ArrayList;

public class StringArrayList {
    ArrayList<String> items = new ArrayList<>();

    void add(String ...items) {
        for (String item : items) {
            this.items.add(item);
        }
    }

    void remove(String ...items) {
        for (String item : items) {
            this.items.remove(item);
        }
    }

    int getSize() {
        return this.items.size();
    }

    String getItem(int index) {
        return this.items.get(index);
    }

    void display1() {
        System.out.println("Items:");
        for (int i = 0; i < this.getSize(); i++) {
            System.out.println(this.getItem(i));
        }
    }

    void display2() {
        System.out.println("Items:");
        for (String item : this.items) {
            System.out.println(item);
        }
    }
}
