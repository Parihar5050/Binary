public class CapacityInDays
{
public static void main(String[] args)
{
 int[] array = {1,2,3,4,5,6,7,8,9,10};
 System.out.println(shipWithinDays(array, 5));
}
public static int shipWithinDays(int[] weights, int days)
{
    int minDays = 0; // max element in array 
    int maxDays = 0; // sum of array element
    for (int i = 0; i < weights.length; i++)
    {
     minDays = Math.max(minDays, weights[i]);
     maxDays +=weights[i] ;
    }    
    // System.out.println(minDays + " " + maxDays);
    int start = minDays;
    int end = maxDays;
    int ans = 0;
    while (start<=end)
    {
      int mid = start+(end-start)/2;
      
      if(canMinimize(weights, mid, days)==true)
      {
        ans = mid;
        end = mid-1;
      }
      else
      {
        start = mid+1;
      }
    }    
    return ans;
}
private static boolean canMinimize(int[] weights, int mid, int days)
{
    int d = 1;
    int weightsum = 0 ;
    for (int i = 0; i < weights.length; i++) 
    {
      weightsum += weights[i];

      if (weightsum>mid)
      {
       d++ ;  
       weightsum = weights[i];
      }
    }
    return d<=days;
}    
}
