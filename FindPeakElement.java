 class Solution {
    public int findPeakElement(int[] nums) {
        int peak=0;
        int max=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(max<nums[i])
            {
                max=nums[i];
                peak =i;
            }
        }
        return peak;
    }
}
