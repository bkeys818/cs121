import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseTest {
    Course course = new Course("Data Structures and Objects", "cs121", 4);

    @Test
    void showInfo() {
        assertEquals("Data Structures and Objects (cs121) - 4 credits", course.showInfo());
    }
}