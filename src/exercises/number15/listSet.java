package exercises.number15;

import java.util.ArrayList;
import java.util.Arrays;

public class listSet {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(22);
        list.add(45);
        list.add(33);
        list.add(56);
        list.add(53);
        list.add(11);
        System.out.println(list);

        int index = list.indexOf(33);
        list.remove(index);
        System.out.println(list);


        list.set((5), 100);
        System.out.println(list);

        double[] A = {1,90, 2,80,40,20};
        Arrays.sort(A);
        System.out.format("A=%s\n", Arrays.toString(A));

        double a=90;
        int index2=Arrays.binarySearch(A,a);
        System.out.format("90 is =%S",index2,a);

    }
}
