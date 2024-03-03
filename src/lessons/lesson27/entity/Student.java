package lessons.lesson27.entity;

//Студент имеет следующие атрибуты: студенческий номер (уникальный), имя, список курсов.


import lessons.lesson27.service.CoursesCatalog;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String studentID;

    private String name;

    private List<Course> courses;
    private Teacher teacher;

    public Student(String studentID, String name) {
        this.studentID = studentID;
        this.name = name;
        this.courses = new ArrayList<>();
        teacher.addStudent(this);
    }
    public void addCourse( Course course){
        courses.add(course);
    }
    public List<Course> getCourses(){
        return  courses;
    }
    public String getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }


}
