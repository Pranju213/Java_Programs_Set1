import java.util.Scanner;
public class BubbleSort {
    public static void main(String[] args) {
        int n,i,j,swap;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of element to sort:");
        n=sc.nextInt();
        int array[]=new int[n];
        System.out.println("Enter "+n+" integers");
        for(i=0;i<n;i++){
         array[i]=sc.nextInt();
        }
        for(i=0;i<n-1;i++){
            for(j=0;j<n-i-1;j++){
                if(array[j]>array[j+1])
                {
                   swap=array[j];
                   array[j]=array[j+1];
                   array[j+1]=swap;
                }
            }
        }
        System.out.println("Sorted array is:");
        for(i=0;i<n;i++){
            System.out.println(array[i]);
        }
    }
}
