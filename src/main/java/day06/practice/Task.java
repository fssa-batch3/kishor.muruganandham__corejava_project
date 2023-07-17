package day06.practice;

import java.util.ArrayList;

public class Task {
    public String taskName;

    public int priority;

    public Task(String taskname, int priority) {
        this.taskName = taskname;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Task : "+ taskName + ", Priority :" + priority;
    }

    public static void main(String[] args) {
        ArrayList <Task> arr = new ArrayList <> ();
        Task task1 = new Task("Kishor",1);
        Task task2 = new Task("Utchi",3);
        Task task3 = new Task("Kamalesh",5);
        arr.add(task1);
        arr.add(task2);
        arr.add(task3);

        for (Task i: arr) {
            System.out.println(i);
        }

        System.out.println("Is Task Found : " + findTaskByName("Kishor",arr));;
    }
    public static boolean findTaskByName(String name, ArrayList<Task> tasks){
        boolean found = false;
        for (Task task : tasks) {
            if (task.taskName.equals(name)) {
                found = true;
                break;
            }
        }
        return found;
    }
}
