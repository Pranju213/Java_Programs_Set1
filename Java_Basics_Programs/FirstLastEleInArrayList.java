
import java.util.*;
public class FirstLastEleInArrayList {
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(12);
        list.add(23);
        list.add(56);
        list.add(22);
        list.add(78);

        Iterator it=list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("First Element in ArrayList--->"+list.get(0));
        System.out.println("Last Element in ArrayList--->"+list.get(list.size()-1));
    }
}
