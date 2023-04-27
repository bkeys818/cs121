import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class StudentReader {
    public static void main(String[] args) {
        Gson gson = new Gson();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("student.json"));
            Student student = gson.fromJson(reader, Student.class);
            System.out.printf("name: %s\nage: %d\nmajor: %s\n", student.getName(), student.getAge(), student.getMajor());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
