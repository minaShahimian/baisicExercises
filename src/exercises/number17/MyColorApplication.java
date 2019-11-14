package exercises.number17;

import java.util.Arrays;
import java.util.EnumSet;
import java.util.Scanner;

public class MyColorApplication {
    public static void main(String[] args) {

        System.out.println("values is : " + Arrays.toString(Answer.values()));
        System.out.println("My color value: "+Arrays.toString(MyColor.values()));
        EnumSet<MyColor> s = EnumSet.range(MyColor.Black, MyColor.White);
        System.out.println("range is: "+s);

        Scanner input=new Scanner(System.in);

        System.out.println("Please enter the value : ");
        String str = input.next();
        Answer A= Answer.valueOf(str);
        System.out.println("Entry:"+A);


    }

    enum Answer {yes, no}
}
