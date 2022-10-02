public class BookAllocation
{
public static void main(String[] args) 
{
  int[] array = {12 ,34 ,67 ,90} ;
  System.out.println(findPages(array, 4, 5));
}
public static int findPages(int[] A,int N,int M) 
{
  int start = A[0] ;
  int sum = 0;
  for (int i = 0; i < A.length; i++) 
  {
   sum+=A[i];  
  }
  int end = sum;
  int ans = -1;
  
  if (M>N) return ans;


  while (start<=end)
  {
    int mid = start + (end-start)/2;
    if (possibleAllocation(A,N,M,mid))
    {
        ans = mid;
        end = mid-1;
    } 
    else
    {
        start = mid+1;
    } 
  }
  return ans;
}  
public static boolean possibleAllocation(int[] A,int N,int M, int mid) 
{
  int studendtCount = 1;
  int pageCount = 0;
  for(int i = 0; i < N; i++)
  {
   if(pageCount + A[i] <= mid)
   {
     pageCount += A[i];
   }
   else
   {
    studendtCount++ ;
   if(studendtCount > M || A[i] > mid)
    {
      return false;
    }
    pageCount = A[i];
   }
  }
  return true;
}  

}
