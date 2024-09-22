import java.util.*;
class ReverseSentence{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String : ");
        String s=sc.nextLine();
        String str[]=s.split(" ");
        String ans="";
        for(int i=str.length-1;i>=0;i--){
            ans=ans+str[i]+" ";
        }
        System.out.println(ans.substring(0,ans.length()-1));
    }
}