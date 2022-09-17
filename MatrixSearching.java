public class MatrixSearching 
{
public static void main(String[] args) 
{
  int[][] matrix = {{1,3}};  
  System.out.println(searchingElement(matrix,3)); 
}

public static boolean searchingElement(int[][] matrix, int target) 
{
  int start = 0; // row
  int end = matrix.length-1; // column

  while (start<matrix.length && end>=0) 
  {
    if (matrix[start][end] == target)
    {
      return true;
    }
    if (matrix[start][end] < target) 
    {
      start++ ;
    }
    else 
    {
      end-- ;     
    }   
  }
  return false;
}

}