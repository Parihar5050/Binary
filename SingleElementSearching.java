/*array = [1,1,2,3,3,4,4,8,8], output = 2 */
public class SingleElementSearching 
{
public static void main(String[] args) 
{
 int[] array = {1,1,2,2,8,9,9,10,10} ;
 System.out.println(searchingSingle(array));   
}
public static int searchingSingle(int[] nums) 
{
int start = 0 ;
int end = nums.length-2;

 while (start<=end) 
 {
  int mid = start + (end-start)/2;

  if (nums[mid] == nums[mid^1]) 
  {
   start = mid+1;  
  } 
  else 
  {
   end = mid-1;  
  }
 }
return nums[start];    
}    
}
