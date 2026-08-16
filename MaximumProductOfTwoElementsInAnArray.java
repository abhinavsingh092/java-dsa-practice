class Solution {
    public int maxProduct(int[] nums) {
        int max1=nums[0];
        int max2=Integer.MIN_VALUE;
        int i=0,j=0;
      for(int l=1;l<nums.length;l++)
      {
        if(max1<nums[l])
        {
            max1=nums[l];
            j=l;
        }
      }
           for(int k=0;k<nums.length;k++)
           {
            if(k==j)
            {
                continue;
            }
            else if(max2<nums[k])
            {
                max2=nums[k];
                i=k;
            }
           }
       return (nums[i]-1) * (nums[j]-1);
       
    }
}  
