import java.util.*;
public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(strs));

    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String s : strs){
            char[] charArr = s.toCharArray();
            Arrays.sort(charArr);
            String orderedStrKey = new String(charArr);
            if(!map.containsKey(orderedStrKey)){
                map.put(orderedStrKey, new ArrayList<>());
            }
            map.get(orderedStrKey).add(s);
        }
        return new ArrayList<>(map.values());
    }
}