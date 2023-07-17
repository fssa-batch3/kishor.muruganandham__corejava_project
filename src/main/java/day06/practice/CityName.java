package day06.practice;

import java.util.ArrayList;
import java.util.List;

public class CityName {

    public static void main(String[] args) {
        List<String> cityList = new ArrayList<String>();
        cityList.add("Chennai");
        cityList.add("Bangalore");
        cityList.add("Mumbai");
        cityList.add("Mumbai");

        System.out.println("ArrayList with duplicates: " + cityList);


        List<String> newList = cityList.stream().distinct().toList();


        System.out.println("ArrayList with duplicates removed: " + newList);
    }

}
