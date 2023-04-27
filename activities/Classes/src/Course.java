public class Course {
    String name, code;
    int credits;

    Course(String name, String code, int credits) {
        this.name = name;
        this.code = code;
        this.credits = credits;
    }

    void showInfo() {
        System.out.printf("%s (%s) - %d credits\n", this.name, this.code, this.credits);
    }
}
