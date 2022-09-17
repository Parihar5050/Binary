import java.util.Arrays;

public class SortedMatrixSearch 
{
public static void main(String[] args) 
{
  int[][] array = {{1,3,5,7},
                   {10,11,16,20},
                   {23,30,34,60}};
  
  System.out.println(Arrays.toString(searching(array,9)));
}    
public static int[] searching(int[][] matrix,int target) 
{
  int row = matrix.length;
  int columns = matrix[0].length;
  if (row == 1) 
  {
    return BinarySearch(matrix, 0,0, columns-1,target);  
  }

  int rowstart = 0;
  int rowend = row-1;
  int cmid = columns/2;
  
  while (rowstart<(rowend-1)) 
  {
    int mid = rowstart + (rowend-rowstart)/2;
    if (matrix[mid][cmid] == target) 
    {
     return new int[]{mid, cmid};  
    }

    if(matrix[mid][cmid] < target) 
    {
      rowstart = mid ;
    }
    else
    {
      rowend = mid;
    }
  }

  if (matrix[rowstart][cmid] == target)
  {
    return new int[]{rowstart, cmid};
  }
  if (matrix[rowstart + 1][cmid] == target) {
      return new int[]{rowstart + 1, cmid};
  }

  if (target<=matrix[rowstart][cmid-1]) 
  {
    return BinarySearch(matrix, rowstart, 0, cmid-1, target);  
  }
  if (target>=matrix[rowstart][cmid+1] && target <= matrix[rowstart][columns-1]) 
  {
   return BinarySearch(matrix, rowstart, cmid+1, columns-1, target);  
  }
  if (target<=matrix[rowstart+1][cmid-1]) 
  {
    return BinarySearch(matrix, rowstart+1, 0,cmid-1, target);  
  }
  else
  {
    return BinarySearch(matrix, rowstart+1, cmid+1, columns-1, target) ;
  }  
}


static int[] BinarySearch(int[][] matrix , int row, int columnStart, int columnEnd, int target) 
{
  while (columnStart<=columnEnd) 
  {
    int mid = columnStart + (columnEnd-columnStart)/2 ;
    
    if (matrix[row][mid] == target) 
    {
      return new int[]{row,mid};
    } 
    if (matrix[row][mid] < target) 
    {
     columnStart= mid+1;     
    }
    else
    {
      columnEnd = mid-1;
    }
  }
  return new int[]{-1,-1} ;
}
}
