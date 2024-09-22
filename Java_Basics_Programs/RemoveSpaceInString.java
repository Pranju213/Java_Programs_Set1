import java.util.*;
public class RemoveSpaceInString {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str=sc.nextLine();
        System.out.println("Original String: "+str);
        str=str.replaceAll("\\s",""); // The \\s is matches the single white space character.
        System.out.println("Final String : "+str);
    }
}
