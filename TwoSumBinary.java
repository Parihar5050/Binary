/*numbers = [2,7,11,15,96,100,500], target = 9
Output: [1,2] */
public class TwoSumBinary 
{
 public static void main(String[] args) 
 {
   int []numbers = {2,7,11,15,96};
   System.out.println(sum(numbers, 9)); 
 }
 public static int[] sum(int[] array, int target) 
 {
    int start = 0 ;
    int end = array.length-1 ;

    while (start<end) 
    {
      
      if (array[start] + array[end] == target) 
      {
        return new int[]{start+1 ,end+1} ;
      }
      
      else if(array[start] + array[end] > target)
      {
        end-- ;
      }
      else 
      {
        start++ ;
      }
    }
    return new int[]{-1,-1} ;
 }   
}
