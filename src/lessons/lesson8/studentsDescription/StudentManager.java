package lessons.lesson8.studentsDescription;

import lessons.lesson6.scanner.UserInput;

public class StudentManager {
    public Student createStudent() {

        UserInput ui = new UserInput();

        String lastName = ui.inputText("Фамилия: ");
        String firstName = ui.inputText("Имя: ");
        String studentCardNumber = ui.inputText("Номер студенческого: ");
        String group = ui.inputText("Группа: ");

        Student newStudent = new Student(lastName, firstName,studentCardNumber,group);

        return newStudent;
    }
}
