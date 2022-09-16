public class First 
{
 public static void main(String[] args) 
 {
    int[] arr = {1,4,3,9,3,4,6,} ;
    int result = LinearSearch(arr, 4);

    System.out.println(result);
 }  
 
 static int LinearSearch(int[] array, int key)
 {
    if (array.length == 0) 
    {
      return -1 ; 
    }
    
    for(int i = 0; i < array.length; i++) 
    {
       if (array[i] == key) 
       {
        return i;
       } 
    }
    return -1 ;
 }
 
}
