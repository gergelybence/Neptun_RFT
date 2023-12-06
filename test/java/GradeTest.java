import org.example.Course;
import org.example.Grade;
import org.example.Student;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class GradeTest {

    @Test
    void testGetCourse() {
        Student student = new Student("John Doe", 1);
        Course course = new Course("Math");
        Grade grade = new Grade(student, course, 5);

        assertEquals(course, grade.getCourse());
    }

    @Test
    void testGetStudent() {
        Student student = new Student("John Doe", 1);
        Course course = new Course("Math");
        Grade grade = new Grade(student, course, 5);

        assertEquals(student, grade.getStudent());
    }

    @Test
    void testGetScore() {
        Student student = new Student("John Doe", 1);
        Course course = new Course("Math");
        Grade grade = new Grade(student, course, 5);

        assertEquals(5, grade.getScore());
    }

}
