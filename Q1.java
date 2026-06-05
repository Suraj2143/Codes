// take input from the user and sort the arraylist and then print it
package ArrayList;
import java.util.*;
public class Q1 {
    public static void main(String[] args) {
        ArrayList<Integer> num=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int value=sc.nextInt();
            num.add(value);
        } 
        Collections.sort(num);
        System.out.println(num);

    }
    }
