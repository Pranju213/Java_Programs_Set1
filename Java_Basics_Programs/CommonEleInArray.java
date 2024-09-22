import java.util.*;
public class CommonEleInArray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Integer[] a1=new Integer[5];
        Integer[] a2=new Integer[5];
         System.out.println("Enter Element in array1: ");
         for(int i=0;i<a1.length;i++){
            a1[i]=sc.nextInt();
        }
         System.out.println("Enter Element in array2: ");
         for(int i=0;i<a2.length;i++){
            a2[i]=sc.nextInt();
        }
        ArrayList<Integer> list1=new ArrayList<Integer>(Arrays.asList(a1));
        ArrayList<Integer> list2=new ArrayList<Integer>(Arrays.asList(a2));
        list1.retainAll(list2);
        System.out.println("Common Elements ----> "+list1);

    }
}
