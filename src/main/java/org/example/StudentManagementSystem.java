package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManagementSystem {
    private List<Student> students;
    private List<Course> courses;
    private List<Grade> grades;

    public StudentManagementSystem() {
        this.students = new ArrayList<>();
        this.courses = new ArrayList<>();
        this.grades = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void enrollStudentInCourse(Student student, Course course, int score) {
        if (students.contains(student) && courses.contains(course)) {
            Grade grade = new Grade(student, course, score);
            grades.add(grade);
            System.out.println("Enrolled " + student.getName() + " in " + course.getName() + " with score: " + score);
        } else {
            System.out.println("Student or course not found");
        }
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public List<Grade> getGrades() {
        return grades;
    }

    public static void main(String[] args) {
        StudentManagementSystem system = new StudentManagementSystem();

        Student student1 = new Student("Trab Antal", 1);
        Student student2 = new Student("Vicc Elek", 2);
        Student student3 = new Student("Alka Ida", 3);
        Student student4 = new Student("Aloe Vera", 4);
        Student student5 = new Student("Bármi Áron", 5);
        Student student6 = new Student("Bak Zoltán", 6);
        Student student7 = new Student("Bekre Pál", 7);
        Student student8 = new Student("Békés Csaba", 8);
        Student student9 = new Student("Futó Rózsa", 9);
        Student student10 = new Student("Nagy Tibor", 10);

        Course course1 = new Course("Math");
        Course course2 = new Course("History");
        Course course3 = new Course("Science");
        Course course4 = new Course("P.E.");
        Course course5 = new Course("Art");
        Course course6 = new Course("Music");
        Course course7 = new Course("English");

        system.addStudent(student1);
        system.addStudent(student2);
        system.addStudent(student3);
        system.addStudent(student4);
        system.addStudent(student5);
        system.addStudent(student6);
        system.addStudent(student7);
        system.addStudent(student8);
        system.addStudent(student9);
        system.addStudent(student10);

        system.addCourse(course1);
        system.addCourse(course2);
        system.addCourse(course3);
        system.addCourse(course4);
        system.addCourse(course5);
        system.addCourse(course6);
        system.addCourse(course7);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Enroll student in a course");
            System.out.println("2. View all students");
            System.out.println("3. View all courses");
            System.out.println("4. View all grades");
            System.out.println("0. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter student ID:");
                    int studentId = scanner.nextInt();
                    System.out.println("Enter course name:");
                    scanner.nextLine();
                    String courseName = scanner.nextLine();
                    System.out.println("Enter score:");
                    int score = scanner.nextInt();

                    Student selectedStudent = system.getStudents().stream()
                            .filter(student -> student.getId() == studentId)
                            .findFirst()
                            .orElse(null);

                    Course selectedCourse = system.getCourses().stream()
                            .filter(course -> course.getName().equals(courseName))
                            .findFirst()
                            .orElse(null);

                    if (selectedStudent != null && selectedCourse != null) {
                        system.enrollStudentInCourse(selectedStudent, selectedCourse, score);
                    } else {
                        System.out.println("Student or course not found");
                    }
                    break;
                case 2:
                    System.out.println("All Students:");
                    for (Student student : system.getStudents()) {
                        System.out.println(student);
                    }
                    break;
                case 3:
                    System.out.println("All Courses:");
                    for (Course course : system.getCourses()) {
                        System.out.println(course);
                    }
                    break;
                case 4:
                    System.out.println("All Grades:");
                    for (Grade grade : system.getGrades()) {
                        System.out.println(grade);
                    }
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
