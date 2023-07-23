package day09.practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;


public class SortTaskUsingDeadLine {
    public static ArrayList<Task> sortTasksByDeadline(ArrayList<Task> tasks) {
        Collections.sort(tasks);
        return tasks;
    }

    public static void main(String[] args) {
        ArrayList<Task> arr = new ArrayList<>();
        arr.add(new Task(3, "Coding", "2022-10-22"));
        arr.add(new Task(5, "Product Design", "2022-10-01"));
        arr.add(new Task(1, "Software Design", "2022-10-07"));
        arr.add(new Task(3, "Coding", "2022-10-22"));

        System.out.println("Before Sorting : ");
        for (Task i : arr) {
            System.out.println(i);
        }

        ArrayList<Task> sortedTasks = sortTasksByDeadline(arr);

        System.out.println("After Sorting : ");
        for (Task i : sortedTasks) {
            System.out.println(i);
        }
    }
}



