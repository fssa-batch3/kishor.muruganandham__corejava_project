package day09;

import day09.practice.SortTaskUsingDeadLine;
import day09.practice.Task;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;

public class TestSortTaskUsingDeadline {

    @Test
    public void testSortTaskUsingDeadline() {

        ArrayList<Task> arr = new ArrayList<>();
        arr.add(new Task(3, "Coding", "2022-10-22"));
        arr.add(new Task(5, "Product Design", "2022-10-01"));
        arr.add(new Task(1, "Software Design", "2022-10-07"));
        arr.add(new Task(3, "Coding", "2022-10-22"));

        ArrayList<Task> expectedSortedArr = new ArrayList<>(arr);
        Collections.sort(expectedSortedArr);

        SortTaskUsingDeadLine.sortTasksByDeadline(arr);

        Assertions.assertEquals(expectedSortedArr, arr, "The tasks should be sorted based on their deadlines");
    }
}