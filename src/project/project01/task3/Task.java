package project.project01.task3;

////Класс Task имеет поля id, taskTitle, taskDescription, priority, status.

public class Task {
    private int ID;
    private String taskTitle;
    private String taskDescription;
    private String priority;
    private String status;

    public Task(int ID, String taskTitle, String taskDescription, String priority, String status) {
        this.ID = ID;
        this.taskTitle = taskTitle;
        this.taskDescription = taskDescription;
        this.priority = priority;
        this.status = status;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTaskTitle() {
        return taskTitle;
    }

    public void setTaskTitle(String taskTitle) {
        this.taskTitle = taskTitle;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Task{" +
                "ID='" + ID + '\'' +
                ", taskTitle='" + taskTitle + '\'' +
                ", taskDescription='" + taskDescription + '\'' +
                ", priority='" + priority + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
