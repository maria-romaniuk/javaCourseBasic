package lessons.lesson8.myStudentCase;

public class Group {

    private String groupName;
    private String start;
    private int quantity;


    public Group(String groupName, String start, int quantity) {
        this.groupName = groupName;
        this.start = start;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupName='" + groupName + '\'' +
                ", start='" + start + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
