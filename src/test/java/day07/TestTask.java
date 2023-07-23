package day07;

import day07.practice.Task;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TestTask {
        @Test
    public void testTaskToString() {
        Task task = new Task("Sample Task", 3, "2012-06-13");

        String expectedString = "Task : Sample Task, Deadline :2012-06-13, Id :3";
        Assertions.assertEquals(expectedString, task.toString());
    }

    @Test
    public void testTaskEqualsAndHashCode() {
        Task task1 = new Task("Walk", 1, "2003-04-02");
        Task task2 = new Task("Walk", 1, "2003-04-02");
        Task task3 = new Task("Sleep", 2, "2012-03-17");

        Assertions.assertEquals(task1, task2);
        Assertions.assertNotEquals(task1, task3);

        Assertions.assertEquals(task1.hashCode(), task2.hashCode());
        Assertions.assertNotEquals(task1.hashCode(), task3.hashCode());
    }
}
