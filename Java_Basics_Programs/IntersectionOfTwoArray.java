import java.util.*;
public class IntersectionOfTwoArray {
    public static void main(String args[]){
        int[] a={1,2,3,4};
        int[] b={3,4,5,6};
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<a.length;i++){
            set.add(a[i]);
        }
        System.out.println("Intersection: ");
        for(int i=0;i<b.length;i++){
            if(set.contains(b[i])){
                System.out.println(b[i]+"");
            }
        }
    }
}
