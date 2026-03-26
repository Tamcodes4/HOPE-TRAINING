package DAY_6.task;

import java.util.*;
class Solution_3 {
    public int[] plusOne(int[] digits) {
        
        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] newNumber = new int[n + 1];
        newNumber[0] = 1;

        return newNumber;
    }
}
class Plusone_61 {
    public static void main(String[] args) {
        Solution_3 sol = new Solution_3();

        int[] digits = {9, 9, 9};  // change input here
        int[] result = sol.plusOne(digits);

        System.out.println("Result: " + Arrays.toString(result));
    }
}
