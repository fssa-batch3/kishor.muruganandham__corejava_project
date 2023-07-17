package day06.solved;

import java.util.Arrays;

public class StringArray {

    public static void main(String[] args) {

        // How it's stored in a normal array
        String[] cityArr = new String[4];
        cityArr[0] = "Chennai";
        cityArr[1] = "Bangalore";
        cityArr[2] = "Mumbai";
        
        System.out.println("Intial Array : ");
     // Display the city names
        for (String cityName : cityArr) {
            System.out.println(cityName);
        }
      
     // Add "Delhi" to the array
        cityArr[3] = "Delhi";
        
        System.out.println("\nArray after adding 'Delhi' : ");
        // Display the city names
        for (String cityName : cityArr) {
            System.out.println(cityName);
        }

        
     // Update Banglore to Kolkata
        cityArr[1] = "Kolkata";
        System.out.println("\nArray after updating 'Banglore' to 'Kolkata' : ");
     // Display the city names
        for (String cityName : cityArr) {
            System.out.println(cityName);
        }
        
        System.out.println("\nArray after removing 'Mumbai' : ");
        
     // Remove Mumbai
        for (int i = 0; i < cityArr.length; i++) {
        	if("Mumbai".equals(cityArr[i])) {
                for(int j = i; j < cityArr.length - 1; j++) {
                	cityArr[j] = cityArr[j+1];
                	cityArr[cityArr.length - 1] = null;
                }
        	}
		}
        
        
     // Display the city names
        for (String cityName : cityArr) {
            System.out.println(cityName);
        }
    }

}
