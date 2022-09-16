import java.util.Scanner;

public class CoinsTriangle 
{
  public static void main(String[] args) 
  {
    Scanner io = new Scanner(System.in);
    int t = io.nextInt() ;
    
    while (t-->0) 
    {
        int a = io.nextInt();
        int h = 1;
    
        while (sum(h)<=a) 
        {
            h++;
        }
        System.out.println(h-1);
    }
    io.close();
  }  
  public static int sum(int n) 
  {
   return (n*(n+1))/2 ;  
  }      
  }
    
  
