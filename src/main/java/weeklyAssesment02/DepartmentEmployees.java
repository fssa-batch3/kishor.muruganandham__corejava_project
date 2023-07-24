package weeklyAssesment02;

import java.util.*;

public class DepartmentEmployees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        str = str.trim();
        String[] arr = str.split(",");
        HashMap<String, List<String>> empArr = new HashMap<>();
        for (int i = 0; i < arr.length; i += 2) {
            String  dep = arr[i].trim();
            String  emp = arr[i + 1].trim();
            if (empArr.containsKey(dep)) {
                List<String> employees = empArr.get(dep);
                employees.add(emp);
            } else {
                List<String> employees = new ArrayList<>();
                employees.add(emp);
                empArr.put(dep, employees);
            }
        }
        empArr.forEach((key , value)->System.out.println(key + " = " + String.join("," , value)));
    }
}