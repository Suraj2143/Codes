package ArrayList;

import java.util.*;

public class sortingArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> age=new ArrayList<>();
        age.add(24);
        age.add(35);
        age.add(0);
        age.add(-23);
        age.add(-45);
        System.out.println("Before sorting: "+age);
        Collections.sort(age);
        System.out.println("After sorting: " + age);
        
    }
}
