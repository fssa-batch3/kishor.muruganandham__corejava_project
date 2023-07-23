package day09;

import day09.practice.ArrayListSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

public class TestArrayListSort {

    @Test
    public void testArrayListSort() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(4);
        arr.add(5);
        arr.add(8);
        arr.add(7);
        ArrayList<Integer> arr1 = new ArrayList<>(arr);
        Collections.sort(arr1);

        ArrayListSort.sortArrayList(arr);

        Assertions.assertEquals(arr1, arr, "The ArrayList should be sorted correctly");
    }
}





