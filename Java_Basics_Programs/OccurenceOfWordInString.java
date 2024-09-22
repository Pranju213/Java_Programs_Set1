import java.util.*;
public class OccurenceOfWordInString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String :");
        String s=sc.nextLine();
        HashMap<String,Integer> hashMap=new HashMap<>();
        String[] words=s.split(" ");
        for(String word:words){
            if(hashMap.containsKey(word)){
                hashMap.put(word,hashMap.get(word)+1);
            }
            else{
                hashMap.put(word,1);
            }
            System.out.println(hashMap);
        }
    }
}
