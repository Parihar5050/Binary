import java.util.Arrays;

public class StringLinearSearch 
{
public static void main(String[] args) 
{
    String statement = "Aditya" ;
    // char letter = 'd' ;
    System.out.println(Arrays.toString(statement.toCharArray()));
    
    System.out.println(AlphaSearch(statement,'d'));
}
 public static boolean AlphaSearch(String st, char alphabet) 
 {
    for (int index = 0; index < st.length(); index++) 
    {
       if (alphabet == st.charAt(index)) 
       {
         return true ;
       }  
    }
   return false ; 
 }   
}
