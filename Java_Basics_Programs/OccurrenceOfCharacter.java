import java.util.*;
public class OccurrenceOfCharacter {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s=sc.nextLine();
        HashMap<Character,Integer> count=new HashMap<>();
        char[] arr=s.toCharArray(); //Convert String into character array
        for(char c:arr){
            if(c!=' '){
                if(count.containsKey(c)){
                    count.put(c,count.get(c)+1); //If character is already traversed incremenet it
                }
                else{
                    count.put(c,1); //If character is not traversed add it to Hashmap
                }
            }
        }
        for(Map.Entry entry:count.entrySet()){
            System.out.print(entry.getKey()+"="+entry.getValue()+",");
        }
    }
}
