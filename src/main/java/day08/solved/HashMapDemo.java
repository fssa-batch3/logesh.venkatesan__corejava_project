package day08.solved;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static Map<String, Integer> getDepartmentMap() {
        HashMap<String, Integer> deptMap = new HashMap<>();
        deptMap.put("HR", 5);
        deptMap.put("ADMIN", 10);
        deptMap.put("DEVELOPERS", 300);
        return deptMap;
    }

    public static void main(String[] args) {
        Map<String, Integer> deptMap = getDepartmentMap();

        for (String deptName : deptMap.keySet()) {
            Integer count = deptMap.get(deptName);
            System.out.println("Department Name: " + deptName + " and Employee Count: " + count);
        }
    }
}
