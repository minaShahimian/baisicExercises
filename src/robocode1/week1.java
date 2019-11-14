package robocode1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class week1 {
    public static void main(String[] args) {

        float x;


        List<Integer> numbers = getSeveralNumber();
        List<Integer> reversed = reverse(numbers);
        System.out.println("numbers");
        Scanner input=new Scanner(System.in);
       x=input.nextFloat();

        System.out.println("reversed");

    }
    public static List<Integer>getSeveralNumber(){
        return Arrays.asList(1,2,3,4,5,6);

    }

    public static List<Integer> reverse(List<Integer>numbers){

       Integer size=numbers.size();
       if (size==0){
           return new ArrayList<>();

       }
       List<Integer>reversed=new ArrayList<>();
       for (int position=size-1;position>=0;position--){
           Integer number=numbers.get(position);
           reversed.add(number);

       }
       return reversed;

    }

}
