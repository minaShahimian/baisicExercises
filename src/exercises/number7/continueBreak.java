package exercises.number7;

import java.util.Scanner;

public class continueBreak {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("please inter the number:");
        int i=input.nextInt();
        for (int i1=0 ; i<10 ; i++){
            if (i==2) continue;
            System.out.format("%d,%d\n",i,i*i);
            if (i==8)break;


        }
    }
}
