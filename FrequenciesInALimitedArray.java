class Solution {
    public ArrayList<Integer> frequencyCount(int[] arr) {
        
        int target=1;
        ArrayList<Integer> nums=new ArrayList<>();
        int index=0;
       while(target<=arr.length)
       {
           nums.add(0);
           target++;
       }
       for(int i=0;i<arr.length;i++)
       {
           if(arr[i]>= 1 && arr[i]<=arr.length)
           {
               index=arr[i]-1;
               nums.set(index,nums.get(index)+1);
           }
       }
        return nums;
    }
}
