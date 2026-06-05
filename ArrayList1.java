package ArrayList;
import java.util.*;
public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);

        Iterator<Integer> loop=list.iterator(); //this is iterator used to iterate throughout the ArrayList
        while(loop.hasNext()){// this condition will true till we have next element in the loop
            System.out.println("element: "+loop.next());// this will print the loop elements
        }
        Object[] obj=list.toArray();// we use object to store the converted list to array to obj 
        for(Object arr: obj){
            System.out.println(arr);
        }
        Collections.sort(list);// this will sort the list in ascending order
    
        
    }
}
