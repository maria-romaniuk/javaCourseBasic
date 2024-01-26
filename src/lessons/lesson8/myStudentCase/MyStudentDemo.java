package lessons.lesson8.myStudentCase;

public class MyStudentDemo {
    public static void main(String[] args) {
        MyStudentInfo info = new MyStudentInfo();

        Group myrGroup = info.newGroup();

        System.out.println("Enter first student info:");
        MyStudent student1 = info.newUser(myrGroup);

        System.out.println("Enter second student info:");
        MyStudent student2 = info.newUser(myrGroup);

        student1.printInfo();
        student2.printInfo();
    }

}
