
package pkg6;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer>a = new ArrayList<>();
        a.add(4);
        a.add(8);
        a.add(3);
        System.out.println(maxValueOfArray(a));
    }
    public static int maxValueOfArray(ArrayList<Integer>a){
        int max = a.get(0);
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i)>max) {
                max = a.get(i);
            }
        }
        return max;
    }
    
}
