package day09.practice;

import java.time.LocalDate;

public class TaskPriority {
    int id;
    String name;
    LocalDate deadline;
    int priority;

    public TaskPriority() {
    }

    public TaskPriority(int id, String name, String date, int priority) {
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
