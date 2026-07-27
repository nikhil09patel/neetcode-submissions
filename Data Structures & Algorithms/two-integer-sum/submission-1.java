class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] resArray = new int[2];
        for(int i = 0; i < nums.length - 1; i++) {
            for(int j = 1; j < nums.length; j++) {
                if(i != j && (nums[i] + nums[j] == target)) {
                    if(i <= j) {
                        resArray[0] = i;
                        resArray[1] = j;
                    }
                    else {
                        resArray[0] = j;
                        resArray[1] = i;
                    }    
                }
            }
        }
        return resArray;
    }
}
