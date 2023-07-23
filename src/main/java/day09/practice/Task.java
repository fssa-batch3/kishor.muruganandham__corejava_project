package day09.practice;

import java.time.LocalDate;

public class Task implements Comparable<Task> {

    private int id;
    private String name;
    private LocalDate deadline;

    public Task() {
    }

    public Task(int id, String name, String date) {
        this.id = id;
        this.name = name;
        this.deadline = LocalDate.parse(date);
    }

    @Override
    public String toString() {
        return "Id : " + id + " Task : " + name + " Deadline : " + deadline;
    }


    @Override
    public int compareTo(Task o) {
        if (this.deadline == o.deadline) {
            return 0;
        }
        return this.deadline.compareTo(o.deadline);
    }
}
