import java.util.Arrays;

/*
 * arr = [5,7,7,7,7,8,8,10]
 * target 7 
 * ans = [1,4]
 */

public class FirstLastIndex 
{
public static void main(String[] args) 
{
  int [] array = {5,2,8,8,10,5};
  System.out.println(Arrays.toString(searchRange(array,5)));
}
 public static int[] searchRange(int[] nums, int target)
 {
  int[] ans = {-1,-1} ;
  ans[0] = firstSearch(nums, target);
  ans[1] = lastSearch(nums, target);
  
  return ans ;
 }
 public static int firstSearch(int[] nums, int target)
 {
    int ans = -1 ;        
    int start = 0 ;
    int end = nums.length-1;
    
    while (start<=end) 
    {
      int mid = start + (end-start)/2;

      if (target == nums[mid])
      {
        ans = mid;
        end = mid-1;
      }      
      else if(target<nums[mid]) 
      {
        end = mid-1 ;        
      }
      else
      {
        start = mid+1;
      }
    }
    return ans ;
 }
 public static int lastSearch(int[] nums, int target)
 {
  int ans = -1 ;        
  int start = 0 ;
  int end = nums.length-1;
  
  while (start<=end) 
  {
    int mid = start + (end-start)/2;

    if (target == nums[mid])
    {
      ans = mid;
      start = mid+1;
    }      
    else if(target<nums[mid])  
    {
      end = mid-1 ;        
    }
    else
    {
      start = mid+1;
    }
  }
  return ans ; 
 }
}