class Solution {
    public int searchInsert(int[] nums, int target) {
        for(int i=0;i<nums.length;i++)
        {
            if(target==nums[i])
            return i;
            else if(target<nums[i])
            return i;
        }
        int count=0;
        if(target>nums[nums.length-1])
        count=nums.length;
        return count;

    }
}
