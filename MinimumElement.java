public class MinimumElement 
{
public static void main(String[] args)
{
  int[] array = {3,4,5,1,2};
  System.out.println(minElement(array)); 
}
public static int minElement(int[] nums)
{
  int start = 0;
  int end = nums.length-1;
  int n = nums.length;

  if (nums[end] > nums[0]) return nums[0];

  while (start<=end)
  {
   int mid = start + (end-start)/2;
   int next = (mid+1)%n;
   int prev = (mid-1+n)%n;
   
   if(nums[mid]<=nums[next] && nums[mid]<=nums[prev]) return nums[mid]; 

   if(nums[mid]>=nums[0])
   {
    start = mid+1;
   }
   else
   {
    end = mid-1;
   }
  }
  return -1;

}    
}
