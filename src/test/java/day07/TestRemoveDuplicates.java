package day07;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;

public class TestRemoveDuplicates {

    @Test
    public void testRemoveDuplicates() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(10);
        arr.add(15);
        arr.add(5);
        arr.add(20);
        arr.add(10);
        arr.add(25);
 
        HashSet<Integer> distinctNumbers = new HashSet<>(arr);

        HashSet<Integer> arr2 = new HashSet<>();
        arr2.add(5);
        arr2.add(10);
        arr2.add(15);
        arr2.add(20);
        arr2.add(25);

        Assertions.assertEquals(arr2, distinctNumbers, "Duplicate elements should be removed");
    }
}
