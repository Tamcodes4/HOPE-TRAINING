package DAY_6.task;
import java.util.*;

class Solution_2 {
    public int firstMissingPositive(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int n : nums) {
            map.put(n, 1);
        }

        for (int i = 1; i <= 100001; i++) {
            if (!map.containsKey(i)) {
                return i;
            }
        }

        return -1;
    }
}
public class firstmisspositive_61{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Solution_2 sol = new Solution_2();
        int result = sol.firstMissingPositive(nums);

        System.out.println(result);

        sc.close();
    }
}