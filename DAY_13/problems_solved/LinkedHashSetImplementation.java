package DAY_13.problems_solved;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetImplementation {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();
            set.add(1);
            set.add(2);
            set.add(3);
            System.out.println(set.contains(1));
    }
}
