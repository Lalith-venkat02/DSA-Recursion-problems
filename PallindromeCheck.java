import java.lang.*;
import java.util.*;

class PallindromeCheck
{
    public static boolean pal(String s){
        int n=s.length();
       // boolean b=true;
        for(int i=0;i<n/2;i++){
            if(s.charAt(i)!=s.charAt(n-i))
            return false;
        }
        return true;
     
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(pal(s));

	}
}
