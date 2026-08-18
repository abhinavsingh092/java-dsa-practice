class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
       
     int l=0;
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            int count=0;
            int k=nums[i];
            for(int j=0;j<nums.length;j++)
            {
                if(k>nums[j])
                {
                    count++;
                }
            }
            arr[l++]=count;
        }
        return arr;
    }    
}
