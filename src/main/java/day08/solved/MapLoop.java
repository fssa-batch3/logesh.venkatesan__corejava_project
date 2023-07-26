package day08.solved;
import java.util.HashMap;
import java.util.Map;
public class MapLoop {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Chennai", 1);
        map.put("Banglore", 2);
        map.put("Chennai", 3);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }
    }
}
