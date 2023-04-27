import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student student = new Student("Ben", "Media", 21);

    @Test
    void showInfo() {
        assertEquals("Ben (21) - Media", student.showInfo());
    }
}