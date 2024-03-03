package lessons.lesson27.entity;

//Преподаватель имеет следующие атрибуты: идентификатор (уникальный), имя, список курсов, которые он ведет.


import lessons.lesson27.service.StudensCatalog;

import java.util.ArrayList;
import java.util.List;

public class Teacher {

    private String teacherID;

    private String name;

    private List<Student> students;
    private List<Course> courses;


    public Teacher(String teacherID, String name) {
        this.teacherID = teacherID;
        this.name = name;
        this.students = new ArrayList<>();
        this.courses = new ArrayList<>();

    }
    public void addCourse( Course course){
        courses.add(course);
    }
    public void addStudent( Student student){
        students.add(student);
    }
    public List<Student> getStudents() {
        return students;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public String getTeacherID() {
        return teacherID;
    }

    public String getName() {
        return name;
    }
}
