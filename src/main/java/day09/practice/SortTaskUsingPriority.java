package day09.practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class TaskPriority {
    int id;
    String name;
    LocalDate deadline;
    int priority;

    public TaskPriority(){}
    public TaskPriority(int id, String name, String date, int priority){
        this.id = id;
        this.name = name;
        this.deadline = LocalDate.parse(date);
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Id : " + id + " Task : " + name + " Deadline : " + deadline + " Priority : " + priority;
    }

}

class PriorityComparator implements Comparator<TaskPriority> {
    @Override
    public int compare(TaskPriority o1, TaskPriority o2) {
        if (o1.deadline.isEqual(o2.deadline)) {
            if (o1.priority == o2.priority) {
                return 0;
            } else if (o1.priority > o2.priority) {
                return 1;
            } else {
                return -1;
            }
        } else {
            return o1.deadline.compareTo(o2.deadline);
        }
    }
}

public class SortTaskUsingPriority {
    public static void main(String[] args) {
        ArrayList<TaskPriority> arr = new ArrayList<>();
        arr.add(new TaskPriority(1,"Coding","2022-10-22",2));
        arr.add(new TaskPriority(5,"Product Design","2022-10-01",3));
        arr.add(new TaskPriority(2,"Software Design", "2022-10-07",2));
        arr.add(new TaskPriority(3,"Coding","2022-10-22",1));

        System.out.println("Before Sorting : ");
        for (TaskPriority i : arr) {
            System.out.println(i);
        }
        Collections.sort(arr, new PriorityComparator());
        System.out.println("After Sorting : ");
        for (TaskPriority i : arr) {
            System.out.println(i);
        }
    }

}
