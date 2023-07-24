package day09;

import day09.practice.SortTaskUsingPriority;
import day09.practice.TaskPriority;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class TestSortTaskUsingPriority {

    @Test
    public void testSortTasksByPriority() {
        ArrayList<TaskPriority> arr = new ArrayList<>();
        arr.add(new TaskPriority(1, "Coding", "2022-10-22", 2));
        arr.add(new TaskPriority(5, "Product Design", "2022-10-01", 3));
        arr.add(new TaskPriority(2, "Software Design", "2022-10-07", 2));
        arr.add(new TaskPriority(3, "Coding", "2022-10-22", 1));

        ArrayList<TaskPriority> expectedSortedArr = new ArrayList<>();
        expectedSortedArr.add(new TaskPriority(3, "Coding", "2022-10-22", 1));
        expectedSortedArr.add(new TaskPriority(1, "Coding", "2022-10-22", 2));
        expectedSortedArr.add(new TaskPriority(2, "Software Design", "2022-10-07", 2));
        expectedSortedArr.add(new TaskPriority(5, "Product Design", "2022-10-01", 3));

        ArrayList<TaskPriority> sortedTasks = SortTaskUsingPriority.sortTasksByPriority(arr);

        Assertions.assertNotSame(expectedSortedArr, sortedTasks, "The tasks should be sorted based on priority and deadline");
    }
}






