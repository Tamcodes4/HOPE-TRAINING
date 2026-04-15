public class MaxSubArr {
    public int maxSubArray(int[] nums) {
        int currSum = 0, maxSum = nums[0];
        for(int i = 0; i < nums.length; i++){
            currSum += nums[i];
            if(currSum > maxSum){
                maxSum = currSum;
            }  
            if(currSum < 0)
                currSum = 0;
        }
        return maxSum;
    }
    /*int curr = nums[i];
            sum = Math.max(sum + curr, curr);
            maxSum = Math.max(sum, maxSum);*/ 
}