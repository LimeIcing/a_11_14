import java.util.HashMap;
import java.util.Map;

public class Main14 {

    /*
    Write a method intersect that accepts two maps whose keys are strings and whose values are integers as parameters
    and returns a new map containing only the key/value pairs that exist in both of the parameter maps. In order for a
    key/value pair to be included in your result, not only do both maps need to contain a mapping for that key, but they
    need to map it to the same value. For example, if the two maps passed are
    {Janet=87, Logan=62, Whitaker=46, Alyssa=100, Stefanie=80, Jeff=88, Kim=52, Sylvia=95} and
    {Logan=62, Kim=52, Whitaker=52, Jeff=88, Stefanie=80, Brian=60, Lisa=83, Sylvia=87} , your method would return the
    following new map (the order of the key/value pairs does not matter): {Logan=62, Stefanie=80, Jeff=88, Kim=52} .
     */

    public static void main(String[] args) {
        HashMap<String, Integer> a = new HashMap<>();
        HashMap<String, Integer> b = new HashMap<>();
        a.put("Janet",87);
        a.put("Logan",62);
        a.put("Whitaker",46);
        a.put("Alyssa",100);
        a.put("Stefanie",80);
        a.put("Jeff",88);
        a.put("Kim",52);
        a.put("Sylvia",95);
        b.put("Logan",62);
        b.put("Kim",52);
        b.put("Whitaker",52);
        b.put("Jeff",88);
        b.put("Stefanie",80);
        b.put("Brian",60);
        b.put("Lisa",83);
        b.put("Sylvia",87);
        HashMap<String, Integer> c = new HashMap<>(intersect(a, b));
        System.out.println(c);
    }

    public static Map<String, Integer> intersect(Map<String, Integer> m, Map<String, Integer> n) {
        HashMap<String, Integer> returnMap = new HashMap<>();

        for (Map.Entry<String, Integer> mEntry:m.entrySet()) {
            for (Map.Entry<String, Integer> nEntry:n.entrySet()) {
                if (mEntry.equals(nEntry)) {
                    returnMap.put(mEntry.getKey(), mEntry.getValue());
                }
            }
        }

        return returnMap;
    }
}
