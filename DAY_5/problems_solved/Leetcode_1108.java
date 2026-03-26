package DAY_5.problems_solved;
import java.util.*;

class Solution {
    public int balancedStringSplit(String s) {
        int count = 0;
        int c = 0;

        for (char ch : s.toCharArray()) {
            if (ch == 'R') {
                c++;
            }
            if (ch == 'L') {
                c--;
            }
            if (c == 0) {
                count++;
            }
        }
        return count;
    }
}

class Leetcode_1108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        Solution obj = new Solution();
        int result = obj.balancedStringSplit(s);

        System.out.println(result);

        sc.close();
    }
}