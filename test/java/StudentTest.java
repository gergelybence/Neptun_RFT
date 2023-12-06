import org.example.Student;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void testGetName() {
        Student student = new Student("John Doe", 1);
        assertEquals("John Doe", student.getName());
    }

    @Test
    void testGetId() {
        Student student = new Student("John Doe", 1);
        assertEquals(1, student.getId());
    }

}
