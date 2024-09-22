import java.util.*;
public class SecondLargeSmallEle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a=new int[5];
        int len=a.length;
        System.out.println("Enter a Element in array : ");
        for(int i=0;i<len;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        System.out.println("Second Largest Element in array: "+a[len-2]);
        System.out.println("Second Smallest Element in array: "+a[1]);
    }
}
