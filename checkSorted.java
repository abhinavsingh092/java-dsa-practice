import java.util.*;
public class CheckSorted {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("put n:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
      // boolean sorted=true;
      int count=0;
       for(int i=0;i<arr.length-1;i++)
       {
        if(arr[i]>arr[i+1])
        {
            //sorted=false;
            count++;
            break;
        }
    }
        if(count==0)
        {
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
       }
    }
