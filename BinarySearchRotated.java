public class BinarySearchRotated
{
public static void main(String[] args) 
{
  int[] arr = {17,15,7,8,1,2,3,4,5,6};
  System.out.println(actualSearch(arr,8 )); 
}
// this function is for finding mid element which will be used as anotherArray[mid] 
// 
 static int middleElementFinder(int[] array)
 {
   int start = 0 ;
   int end = array.length-1;
   int n = array.length;

   while (start<=end)
   {
     int mid = start + (end-start)/2;
     int next = (mid+1)%n;
     int prev = (mid+n-1)%n;

     if (array[mid] <= array[next] && array[mid] <= array[prev])
     {
        return mid;
     }
     else if (array[mid] <= array[0])
     {
        end = mid-1;
     }
     else
     {
        start = mid+1;
     }
   }
   return -1;   
 }   
/*this function is binary search for finding element in different part of array taking mid element as mid  */
 static int binarySearch(int[] array, int start, int end, int target)
 {
    while (start<=end)
    {
      int mid = start + (end-start)/2;
      if (target<array[mid]) 
      {
        end = mid-1;
      } 
      else
      {
        start = mid+1;  
      }
      return mid;
    }
    return -1;
 }
 /*FUnction for actually finding element in array using above function middleElement and binary search.
  * in this function mid element i.e. pivot comes from above middlElementFinder.
  then we take mid element == pivot and perform binarySearch.
  */
 static int actualSearch(int[] nums, int target)
 {
  int pivot = middleElementFinder(nums);
 
  if(target<=nums[0])
  {
    binarySearch(nums, pivot, nums.length-1, target);
  }
 
  else if(target>=nums[0])
  {
     return binarySearch(nums, target, 0, pivot-1);
  }
  
  return pivot;
 }
}