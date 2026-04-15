
import java.util.*;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] result = intersection(nums1, nums2);
        System.out.print("Intersection: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1=new HashSet<>();
        Set<Integer> set2=new HashSet<>();
        for(int num:nums1){
            set1.add(num);
        }
        for(int num1:nums2){
            if(set1.contains(num1)){
                set2.add(num1);
            }
        }
        int[] arr=new int[set2.size()];
        int i=0;
        for(int num2:set2){
            arr[i++]=num2;
        }
        return arr;
    }
}