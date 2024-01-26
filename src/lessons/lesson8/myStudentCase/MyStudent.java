package lessons.lesson8.myStudentCase;

public class MyStudent {
    private String lastName;
    private String firstName;

    private String studentID;
    private Group group;


    public MyStudent(String lastName, String firstName, String studentID, Group group) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.studentID = studentID;
        this.group = group;
    }

    public void printInfo(){
        System.out.println("Lastname: " + lastName);
        System.out.println("Firstname: " + firstName);
        System.out.println("ID: " + studentID);
        System.out.println(group);
    }
}
