import java.util.*;
public class PalidromeNumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int number,temp,rev=0,digit;
        System.out.println("Enter a number: ");
        number=sc.nextInt();
        temp=number;
        while(number>0){
            digit=number%10;
            rev=rev*10+digit;
            number=number/10;
        }
        if(temp==rev){
            System.out.println("Number is Palidrome");
        }
        else{
            System.out.println("Number is not palidrome");
        }
    }
}
