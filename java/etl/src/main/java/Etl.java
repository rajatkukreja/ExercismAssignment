import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Etl {
    Map<String, Integer> transform(Map<Integer, List<String>> old) {
        Map<String,Integer> map = new HashMap<>();
        for(Integer key:old.keySet()){
            putFromListToMap(old, map, key);
        }
        return map;
    }

    private void putFromListToMap(Map<Integer, List<String>> old,
                                  Map<String, Integer> map, Integer key) {
        for(String value:old.get(key)){
            map.put(value.toLowerCase(),key);
        }
    }
}
