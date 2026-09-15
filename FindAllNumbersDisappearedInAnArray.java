class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
       
        Arrays.sort(nums);
        int j=1;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<nums.length;)
        {
            if(j==nums[i])
            {
                i++;
                j++;
            }
            else if(j<nums[i])
            {
                arr.add(j);
                j++;
            }
            else if(j>nums[i])
            {
                i++;
            }
        }
        while(j<=nums.length)
        {
            arr.add(j);
            j++;
        }
        return arr;
    }
}
