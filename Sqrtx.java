public class Sqrtx
{
public static void main(String[] args) 
{
    System.out.println(finder(8));
}
public static int finder(int x)
{
 long start = 0;
 long end = x;
 
 while (start<=end)
 {
   long mid = start + (end-start)/2;

   if (x==mid*mid) 
   {
    return (int)mid;  
   }
   
   if (x<mid*mid)
   {
    end = mid-1;  
   } 
   else
   {
    start = mid+1;
   }
 }
 return (int)end;
 

}    
}