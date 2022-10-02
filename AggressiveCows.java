import java.util.Arrays;
import java.util.Scanner;

public class AggressiveCows
{
public static void main(String[] args)
{
//   Scanner io = new Scanner(System.in);
//   int t = io.nextInt();
//   while (t-->0)
//   {
//     int arrSize = io.nextInt();
//     int totalCows = io.nextInt();
//     int[] stalls = new int[arrSize];
    
//     for (int i = 0; i < arrSize; i++) 
//     {
//      stalls[i] = io.nextInt();    
//     }
//     System.out.println(minimumPosition(stalls, 2));
System.out.println(minimumPosition(, 0));
}
  /*2
6 4
0 3 4 7 10 9
6 3
0 4 3 7 10 9 */
}

public static int minimumPosition(int[] array, int cow)
{
  Arrays.sort(array);

  int maxx=0;
  for (int i = 0; i < array.length; i++)
  {
    maxx = Math.max(array[0], array[i]);
  }

  int start = 0;
  int end = maxx;
  int ans = 0;
  
  while (start<=end)
  {
    int mid = start + (end-start)/2;
    
    if (possibleStall(array,cow,mid))
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
static boolean possibleStall(int[] array, int cow, int mid)
{
  int cowCount = 1;
  int lastPosition = array[0];

  for (int i = 0; i < array.length; i++) 
  {
    if (array[i]-lastPosition>=mid)
    {
      cowCount++;
      
      if (cowCount == cow) 
      {
        return true; 
      }
      lastPosition = array[i]; 
    }     
  }
  return false;
}

}
