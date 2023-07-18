package day07.practice;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> numbersList = new ArrayList<>();
        numbersList.add(5);
        numbersList.add(10);
        numbersList.add(15);
        numbersList.add(5);
        numbersList.add(20);
        numbersList.add(10);
        numbersList.add(25);

        HashSet<Integer> distinctNumbers = new HashSet<>(numbersList);

        System.out.println("Distinct numbers:");
        for (Integer number : distinctNumbers) {
            System.out.println(number);
        }
    }
}
