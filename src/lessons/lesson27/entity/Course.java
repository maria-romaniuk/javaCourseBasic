package lessons.lesson27.entity;

import java.util.ArrayList;
import java.util.List;

//    Курс включает в себя: название курса, идентификатор курса (уникальный), преподавателя, список студентов.
public class Course {

    private String courseName;

    private String courseID;

    private Teacher teacher;
    private Student student;

    private List<Student> students;

    public Course(String courseName, String courseID, Teacher teacher) {
        this.courseName = courseName;
        this.courseID = courseID;
        this.teacher = teacher;
        this.students = new ArrayList<>();
        teacher.addCourse(this);
        student.addCourse(this);
    }
}
