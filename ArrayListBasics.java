package ArrayList;

import java.util.ArrayList;

public class ArrayListBasics {
    public static void main(String[] args) {
        ArrayList<Integer> age=new ArrayList<>();
        age.add(24);
        age.add(35);
        age.add(1,45);// this will add element at specified index
        age.remove(1);// this will remove the element at index 1
        age.remove("24");//this will remove the provided element
        //age.clear(); --> this will clear all the elements in the arrayList
           System.out.println(age);
        age.set(0,99);//this will change element at index 0 to 99
        System.out.println(age);
        System.out.println(age.get(1));// this will display the element at index 2
    }
}
