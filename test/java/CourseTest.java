import org.example.Course;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CourseTest {

    @Test
    void testGetName() {
        Course course = new Course("Math");
        assertEquals("Math", course.getName());
    }
}
