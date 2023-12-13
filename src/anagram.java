import java.util.Arrays;
import java.util.Scanner;



public class anagram {

    static boolean isAnagram(String a, String b) {
    	a = a.toLowerCase();
   	   	b = b.toLowerCase();
   	   	boolean result = false;
   	   	char[] c = a.toCharArray();
   	   	Arrays.sort(c);
   	   	char[] d = b.toCharArray();
   	   	Arrays.sort(d);
   	   	String e = new String (c);
        String f = new String (d);
        if (e.equals(f)) {
       	  result = true;
        }
      
		return result;
      
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}