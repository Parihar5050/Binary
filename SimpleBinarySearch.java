public class SimpleBinarySearch 
{
public static void main(String[] args) 
{
   int[] arr = {1,2,3,4,6,7} ;
   System.out.println(search(arr, 2));
     
}
 static int search(int[] array, int target)
 {
    int start = 0 ;
    int end = array.length-1 ;

    while (start<=end) 
    {
      int mid_element = start + (end-start)/2 ;

      if (target > array[mid_element]) 
      {
        start = mid_element+1 ;
      }
      else if (target < array[mid_element]) 
      {
        end = mid_element-1 ;   
      }
      else 
      {
        return mid_element;
      }
    }
    return -1 ;
 }   
}