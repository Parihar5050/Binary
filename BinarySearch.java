public class BinarySearch 
{
public static void main(String[] args) 
{
    int[] asc = {-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
    int[] des = {99,80,75,22,11,10,5,2,-3};

    System.out.println(binarySearch(asc, 22));
    System.out.println(binarySearch(des, 22));
}
public static int binarySearch(int[] array, int target) 
{
 int start = 0;
 int end = array.length-1 ;

 while (start<=end) 
 {
   int mid_element = start + (end-start)/2 ;

   boolean ascending = array[start] < array[end];
   
   if (array[mid_element] == target) 
   {
     return mid_element  ; 
   }

   if(ascending) 
   {
    if (target < array[mid_element]) 
    {
      end = mid_element-1 ;   
    } 
    else 
    {
        start = mid_element+1 ;
    } 
   }

   else 
   {
    if (target > array[mid_element]) 
    {
      end = mid_element-1 ;
    }
    else
    {
        start = mid_element+1 ;
    }
   } 

 }
    return -1 ;
}    
}
