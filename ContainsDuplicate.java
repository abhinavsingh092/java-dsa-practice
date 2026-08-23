class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
      boolean present =false;
      for(int i=0;i<nums.length;i++)
      {
        if(map.containsKey(nums[i]))
        {
            present =true;
            break;
        }
        map.put(nums[i],i);
      }
return present;
    }
}
