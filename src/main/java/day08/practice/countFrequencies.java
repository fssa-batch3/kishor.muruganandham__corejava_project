package day08.practice;

import java.util.HashMap;
import java.util.Scanner;

public class countFrequencies {

    public static void main(String[] args) {
        HashMap<String, Integer> arr = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String[] strArr = str.split(",");

        for (String i: strArr) {
            i = i.trim();
            arr.put(i,arr.getOrDefault(i,0)+1);
        }

        arr.forEach((name,count) -> System.out.println(name + " : "+ count));
    }

}
