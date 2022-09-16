import java.util.Arrays;

public class MatrixSearching 
{
public static void main(String[] args) 
{
  int[][] matrix = {{18,19,69},
                    {89,99,101},
                    {100,200,300}};  
 System.out.println(Arrays.toString( searchingElement(matrix, 18)));  
}
public static int[] searchingElement(int[][] array, int target) 
{
  int start = 0; // row
  int end = array.length-1; // column

  while (start<array.length && end>=0) 
  {
    // int mid = start + (end-start)/2 ;  
    if (array[start][end] == target)
    {
        return new int[]{start,end};
    }
    if (array[start][end] < target) 
    {
      start++ ;
    }
    else 
    {
      end-- ;     
    }   
  }
  return new int[] {-1,-1} ;

}
    
}