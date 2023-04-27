public class Course {
    private String name, code;
    private int credits;

    Course(String name, String code, int credits) {
        this.name = name;
        this.code = code;
        this.credits = credits;
    }

    String showInfo() {
        return String.format("%s (%s) - %d credits", this.name, this.code, this.credits);
    }
}
