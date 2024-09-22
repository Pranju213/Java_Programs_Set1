import java.util.*;
public class StringAnagram {
    public static void main(String args[]){
        String s1="Army";
        String s2="Mary";
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        if(s1.length()==s2.length()){
            char[] c1=s1.toCharArray();
            char[] c2=s2.toCharArray();
            
            Arrays.sort(c1);
            Arrays.sort(c2);
            boolean result=Arrays.equals(c1,c2);
            if(result){
                System.out.println(s1+ "and" +s2+ "are anagram");
            }
            else{
                System.out.println(s1+ "and" +s2+" are not anagram");
            }
        }
        else{
            System.out.println(s1+ "and" +s2+ "are anagram");
        }
    }
}
