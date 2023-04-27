import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;

public class StudentWriter {
    public static void main(String[] args) {
        Student student = new Student("Ben", 21, "MDIA");
        Gson gson = new Gson();
        try {
            FileWriter fileWriter = new FileWriter("student.json");
            fileWriter.write(gson.toJson(student));
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
