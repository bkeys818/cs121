import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TotalCalories totalCalories = new TotalCalories();

        System.out.println("Let's make a diet!");
        System.out.print("How many calories will you eat a day? > ");
        int cal = scanner.nextInt();
        System.out.print("When will the diet start? (mm/dd/yyy) > ");
        String start = scanner.next();
        System.out.print("When will the diet end? (mm/dd/yyy) > ");
        String end = scanner.next();

        int total = totalCalories.calcTotal(cal, start, end);
        System.out.printf("You will consume %d calories during your diet.\n", total);
    }
}
