public class FindDuplicate
{
public static void main(String[] args)
{
  int[] array = {1,3,4,2,2} ;
  System.out.println(duplicateFinder(array));
}
public static int duplicateFinder(int[] nums)
{
    int start = 1, end = nums.length - 1;
    int duplicate = -1;
    
    while (start <= end) 
    {
        int mid = start+(end-start)/ 2;
     // Count how many numbers in 'nums' are less than or equal to 'cur'
        int count = 0;
        for (int i=0;i<nums.length;i++)
        {
            if (nums[i] <= mid)
                count++;
        }
        
        if (count > mid) {
            duplicate = mid;
            end = mid - 1;
        } else {
            start = mid + 1;
        }
    }
    return duplicate;

}    
}
