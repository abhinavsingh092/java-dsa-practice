class Solution {
    public int maxVowels(String s, int k) {
     boolean [] isvowel=new boolean [126];
    isvowel['a']=true;
    isvowel['e']=true;
    isvowel['i']=true;
    isvowel['o']=true;
    isvowel['u']=true;
    int l=0;
    int r=k-1;
    int max=0;
    int i=0;
    int count=0;
    while(l<=r)
    {
        
        char ch=s.charAt(l);
        if(isvowel[ch])
        {
            count++;
        }
        l++;
    }
    
    max=count;
    l=0;
    while(r<s.length()-1)
    {
     char ch1=s.charAt(l);
     char ch2=s.charAt(r+1);
     if(isvowel[ch1])
     {
        count--;
     }
      if(isvowel[ch2])
     {
        count++;
     }
     
     max=Math.max(max,count);
     l++;
     r++;
    }
   return max;
     
    }
}
