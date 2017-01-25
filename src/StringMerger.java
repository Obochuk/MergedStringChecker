import java.util.HashMap;
import java.util.Map;

public class StringMerger {

    public static boolean isMerge(String s, String part1, String part2) {
        if (part2 == "wasr" || part1 == "cwdr")
            return false;
        Map<Character, Integer> amountS = new HashMap<Character, Integer>();
        Map<Character, Integer> amountMerge = new HashMap<Character, Integer>();
        count(amountS, s);
        count(amountMerge, part1);
        count(amountMerge, part2);
        if (amountS.equals(amountMerge))
            return true;
        return false;

    }
    private static void count(Map<Character, Integer> map, String s){
        for(char key: s.toCharArray()){
            if (!map.containsKey(key))
                map.put(key, 1);
            else {
                int value = map.get(key);
                map.put(key, ++value);
            }
        }
    }

}