public class StriverSortedArray
{
public static void main(String[] args)
{
    int[] arr = {4,5,6,7,0,0,1,2};
  System.out.println(elementSearch(arr,0 ));
    
}
public static int elementSearch(int[] array,int target)
{
 int start = 0 ;
 int end = array.length-1;
 while (start<=end)
 {
   int mid = start+(end-start)/2;
   
   if (array[mid] == target) return mid; 

  if (array[start]<=array[mid]) 
  {
    if (array[start] <= target && array[mid]>=target) 
    {
      end = mid-1;    
    } 
    else
    {
        start = mid+1;
    }  
  } 
  else
  {
    if (array[end]>=target && array[mid]<=target) 
    {
      start = mid+1;    
    }
    else 
    {
     end = mid-1;    
    }  
  }
 } 
 return -1;  
}    
}
