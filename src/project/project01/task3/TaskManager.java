package project.project01.task3;


//Создайте класс TaskManager для управления задачами.
//Включите в него метод createTaskFromUserInput, который позволяет
//пользователю ввести данные для создания новой задачи и возвращает
//объект Task.
//Класс Task имеет поля id, taskTitle, taskDescription, priority, status.
//
//Методы класса TaskManager должны позволять добавлять задачу,
//изменять ее статус и получать список задач.
//
//Реализуйте метод sort, который сортирует задачи в порядке приоритета - от важного до простого.
//Если задачи одного приоритета - то по алфавиту.
//
//Для реализации приложения реализуйте многоуровневый подход (хранение
//отдельных элементов, массивов и сервисные функции должны быть реализованы
//отдельно).
//
// Добавьте метод printTasks для вывода массива задач (печать по одному элементу).
//
// Реализуйте класс TaskDemo для демонстрации работы программы.


import lessons.lesson6.scanner.UserInput;

import java.util.Objects;

public class TaskManager {

    private UserInput ui = new UserInput();

    private Task task;

    private Task[] tasks;

    public TaskManager(Task[] tasks) {
        this.tasks = tasks;
    }


    //Включите в него метод createTaskFromUserInput, который позволяет
    //пользователю ввести данные для создания новой задачи и возвращает
    //объект Task.

    public Task createTaskFromUserInput(){

        int id = ui.inputIntiger("Enter ID:");
        String title = ui.inputText("Enter Title:");
        String description = ui.inputText("Enter task description:");
        String priority = ui.inputText("What priority have this task(low/medium/high):");
        String status = ui.inputText("Enter the status of your task");

        return new Task(id, title,description,priority,status);
    }



    //Методы класса TaskManager должны позволять добавлять задачу,
    //изменять ее статус и получать список задач.

    public Task[] createTaskArray(){
        int arrayLength = ui.inputIntiger("Enter your tasks quantity");
        Task[] array = new Task[arrayLength];
        for (int i = 0; i < array.length; i++) {
            array[i] = createTaskFromUserInput();
        }
        return array;
    }

    public void changeTaskStatus(Task task){
       String currentStatus = task.getStatus();
        System.out.println("Your current Task status: " + currentStatus);
        String newStatus = ui.inputText("Enter you new status");
        if (Objects.equals(currentStatus, newStatus)){
            System.out.println("You already have this status");
        } else{
            task.setStatus(newStatus);
        }

    }

    public Task findById(int searchInt){
        for (int i = 0; i < tasks.length; i++) {
            if (tasks[i].getID() == searchInt) {
                return tasks[i];
            }
        }
        return null;
    }

    public boolean delete(Task taskForDelete){
        for (int i = 0; i < tasks.length; i++) {
            if(tasks[i].equals(taskForDelete)){
                tasks[i] = null;
            }
        }
        return false;
    }


    //Реализуйте метод sort, который сортирует задачи в порядке приоритета - от важного до простого.
    //Если задачи одного приоритета - то по алфавиту.
    public Task[] sortTasks(Task[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if(array[i].getPriority().compareTo(array[j].getPriority()) > 0){

                }
            }
        }
        return array;
    }






// Добавьте метод printTasks для вывода массива задач (печать по одному элементу).
    public void printTasks(){
        System.out.println();
        for (int i = 0; i < tasks.length; i++) {
            if(tasks[i] != null){
                System.out.println("Task No." + i);
                System.out.println("Task Id" + tasks[i].getID());
                System.out.println("Task Title " + tasks[i].getTaskTitle());
                System.out.println("Task Description " + tasks[i].getTaskDescription());
                System.out.println("Task Priority " + tasks[i].getPriority());
                System.out.println("Task Status " + tasks[i].getStatus());
                System.out.println("===================");
                System.out.println();
            } else {
                System.out.println("Empty array element");
            }
        }
    }


}
