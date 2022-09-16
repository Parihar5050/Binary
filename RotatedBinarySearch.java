/**
 * RotatedBinarySearch
 */
public class RotatedBinarySearch 
{
public static void main(String[] args) 
{
    int[] nums = {4,5,6,7,0,1,2} ;
    System.out.println(rotation(nums));
}
static int search(int[] nums, int target)
{
  int pivot = rotation(nums);

  if(pivot == -1)
  {
    return binarySearch(nums, target, 0, nums.length-1);
  }

 if(nums[pivot] == target)
 {
    return pivot;
 }

 if(target>=nums[0])
 {
    return binarySearch(nums, target, 0, pivot-1);
 }
 
 return binarySearch(nums, target, pivot+1, nums.length-1) ;
}

public static int binarySearch(int[] array, int target ,int start, int end) 
{
    while (start<=end) 
    {
        int mid_element = start + (end-start)/2 ;

        if (target < array[mid_element]) 
        {
          end = mid_element-1 ;
        }
        else if (target > array[mid_element]) 
        {
          start = mid_element+1 ;
        }
        else 
        {
          return mid_element;
        }    
    }
    
    return -1;
}

// for finding pivot 
public static int rotation(int[] array) 
{
  int start = 0 ;
  int end = array.length-1;

  while (start<=end) 
  {
   int mid = start+(end-start)/2 ;
   
   if (mid < end && array[mid]>array[mid+1]) 
   {
    return mid; 
   }

   if (mid>start && array[mid]<array[mid-1]) 
   {
    return mid-1; 
   }

   if (array[start]<=array[mid]) 
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
}