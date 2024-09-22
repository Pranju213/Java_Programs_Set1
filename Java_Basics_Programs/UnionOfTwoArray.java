import java.util.*;
class UnionOfTwoArray{
    public static void main(String args[]){
     int[] a={1,2,3,4};
     int[] b={3,4,5,6};
     HashSet<Integer> set=new HashSet<>();
     for(int i= 0 ;i<a.length;i++){
        set.add(a[i]);
     }
     for(int i=0;i<b.length;i++){
        set.add(b[i]);
     }
     System.out.println("Union : ");
     for(int num:set){
        System.out.println(num+"");
     }
    }
}