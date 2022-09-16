/*ceiling number is smallest number which is greater than or equal to target number 
 * ceiling number => target number
 */
public class CeilingNumber 
{
public static void main(String[] args) 
{
  int[] array = {1,2,3,4,5,6} ;
  System.out.println(ceiling(array, 5)); 
}    
public static int ceiling(int[] array, int target) 
{
  int start = 0;
  int end = array.length-1;

  while (start<=end) 
  {
    int mid = start + (end-start)/2 ;

    if (target<array[mid]) 
    {
        end = mid-1 ;
    }  
    else if (target>array[mid]) 
    {
        start = mid + 1 ;
    }
    else 
    {
     return mid;
    }    
  }
  return start ;

}
}
