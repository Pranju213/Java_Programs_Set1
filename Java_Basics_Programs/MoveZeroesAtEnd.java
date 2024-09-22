import java.util.*;
public class MoveZeroesAtEnd {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,i,j=0;
        System.out.println("Enter a array length:");
        n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter element into the array: ");
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        System.out.println("Array------------>");
        for(i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        
    }
}
