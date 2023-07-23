package day06;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class TestCityName {

    @Test
    public void testRemoveDuplicates() {
        List<String> cityList = new ArrayList<>();
        cityList.add("Chennai");
        cityList.add("Bangalore");
        cityList.add("Mumbai");
        cityList.add("Mumbai");

        List<String> oldList = List.of("Chennai", "Bangalore", "Mumbai");
        List<String> newList = cityList.stream().distinct().toList();

        Assertions.assertEquals(oldList, newList, "Duplicate elements should be removed");
    }
}