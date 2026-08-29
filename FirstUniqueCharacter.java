class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c1:s.toCharArray())
        {
            map.put(c1,map.getOrDefault(c1,0)+1);
        }
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(map.get(ch)==1)
            {
                return i;
               
            }
        }
        return -1;
    }
}
