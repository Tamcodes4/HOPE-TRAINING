package DAY_5.task;
import java.util.*;

class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int i = 0, j = arr.length - 1;
        String vowels = "aeiouAEIOU";

        while (i < j) {
            while (i < j && vowels.indexOf(arr[i]) == -1) i++;
            while (i < j && vowels.indexOf(arr[j]) == -1) j--;

            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

        return new String(arr);
    }
}

class Reversevowels_345 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        Solution sol = new Solution();
        String result = sol.reverseVowels(s);

        System.out.println(result);

        sc.close();
    }
}