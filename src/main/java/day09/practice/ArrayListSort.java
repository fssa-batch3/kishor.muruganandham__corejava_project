package day09.practice;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        System.out.println("Array List Before Sorting: " + arr);
        ArrayList<Integer> sortedArr = sortArrayList(arr);
        System.out.println("Array List After Sorting: " + sortedArr);
    }

    public static ArrayList<Integer> sortArrayList(ArrayList<Integer> arr) {
        Collections.sort(arr);
        return arr;
    }
}
