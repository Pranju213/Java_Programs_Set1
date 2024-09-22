import java.util.*;
public class AverageOfOddNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int cntodd=0,sumodd=0,avgodd,n;
        int i;
        System.out.println("Enter a number:");
        n=sc.nextInt();
        for(i=1;i<=2*n;i++){
        if(i%2!=0){
            cntodd++;
            sumodd=sumodd+i;
            }
        }
        System.out.println("The sum of "+n+" odd numbers is ="+sumodd);
        avgodd=sumodd/cntodd;
        System.out.println("The avg of "+n+" odd numbers is="+avgodd);
    }
}
