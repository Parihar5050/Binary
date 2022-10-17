public class MissingBinary 
{
public static void main(String[] args) 
{
    int n = nums.length;
        
    Arrays.sort(nums);
    
    for (int i = 0 ; i < n ; i++) {
        if (nums[i] != i) {
            return i;
        }
    }
    
    return n;
}
    
}