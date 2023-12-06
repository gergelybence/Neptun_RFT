package org.example;

public class Grade {
    private Course course;
    private Student student;
    private int score;

    public Grade(Student student, Course course, int score) {
        this.student = student;
        this.course = course;
        this.score = score;
    }

    public Course getCourse() {
        return course;
    }

    public Student getStudent() {
        return student;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return student.getName() + ", " + course.getName() + ", " + score;
    }
}
