public class KoKOBanana 
{
public static void main(String[] args) 
{
 int[] array = {30,11,23,4,20} ;
 System.out.println(kokoSpeed(array,5 )); 
}    

public static int kokoSpeed (int[] piles, int h) 
{
  int mx=0;
  for (int i = 0; i < piles.length; i++) 
  {
    mx =  Math.max(mx,piles[i]);   
  }
  
  int start = 1;
  int end = mx ;
//   int result = Integer.MAX_VALUE ;
  while (start<=end) 
  {
    //  mid = speed  which can be controlled by koko
   int speed = start + (end - start)/2 ;
   
   if(itspossible(piles,h,speed) == true) 
   {
    end = speed-1 ;
   }
   else
   {
    start = speed+1 ;
   }
  }
  return start;   
}

private static boolean itspossible(int[] piles, int h, int speed) 
{
    int time = 0 ;
    for (int i = 0; i < piles.length; i++) 
    {
        time+=piles[i]/speed;
        if(piles[i]%speed!=0)
        time++;
    }
    return time<=h;
}
}
