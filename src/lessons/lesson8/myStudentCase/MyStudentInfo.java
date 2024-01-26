package lessons.lesson8.myStudentCase;

import lessons.lesson6.scanner.UserInput;

public class MyStudentInfo {
    private UserInput ui = new UserInput();

    public MyStudent newUser( Group userGroup){
        String userLastName = ui.inputText("Lastname: ");
        String userFirstName = ui.inputText("Fistname: ");
        String userId = ui.inputText("ID: ");

        return new MyStudent(userLastName,userFirstName,userId,userGroup);
    }
    public Group newGroup(){
        String groupName = ui.inputText("Group name: ");
        String start = ui.inputText("Start data: ");
        int quantity = ui.inputIntiger("How many students in group: ");
        return new Group(groupName, start, quantity);
    }


}
