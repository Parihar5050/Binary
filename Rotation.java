public class Rotation
{
public static void main(String[] args)
{
    // int 
    
}
static int search(int[] arr, int n) 
{
  
  int start = 0;
  int end = n-1;
  while (start<=end)
  {
   int mid = (start+end)/2;
   int next = arr[(mid+1)%n];
   int prev = arr[(mid-1+n)%n];
   
   if(arr[mid]<=next && arr[mid]<=prev)
   {
    return mid;    
   }

   else if(arr[mid] >= arr[0])
   {
    start = mid+1;
   }
   else 
   {
    end = mid-1;
   } 
  }
  return 0;
}    
}
